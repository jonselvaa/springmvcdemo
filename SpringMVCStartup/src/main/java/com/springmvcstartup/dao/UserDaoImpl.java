package com.springmvcstartup.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvcstartup.Entity.UserEntity;
import com.springmvcstartup.Model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		boolean saveFlag = true;
		UserEntity userEntity = new UserEntity();
		userEntity.setUserName(user.getUserName());
		try {
			Session session = sessionFactory.getCurrentSession();
			session.save(userEntity);
		}catch(Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		
		return saveFlag;
	}

	public List<User> getUsers() {
		List<User> list = new ArrayList<User>();
		try {
			
			Session session = sessionFactory.getCurrentSession();
			Query<UserEntity> qry = session.createQuery("from UserEntity", UserEntity.class);
			List<UserEntity> users = qry.getResultList();
			
			for(int i = 0; i<users.size(); i++){
				UserEntity userEntity = (UserEntity) users.get(i);
				User user = new User();
				user.setUserId(userEntity.getUserId());
				user.setUserName(userEntity.getUserName());
				list.add(user);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
