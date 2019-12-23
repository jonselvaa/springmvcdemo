package com.springmvcstartup.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import com.springmvcstartup.Model.User;
import com.springmvcstartup.service.UserService;
import com.springmvcstartup.service.UserServiceImpl;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/login.html")
	public String sayHello(Model model) {
		
		
		
		model.addAttribute("user", new User());
		return "saveUser";
	}
	
	@RequestMapping(value = "/saveUser.html", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") @Valid User user, 
			BindingResult result) {		
		
		if(result.hasErrors())
			return "saveUser";
		else
			userService.saveUser(user);
			return "redirect:/list.html";
			
	}	

	@GetMapping("/list.html")
	public String listUser(Model model) {
		List<User> user = userService.getUsers();
		model.addAttribute("users", user);
		return "userSaved";		
	}
	
}
