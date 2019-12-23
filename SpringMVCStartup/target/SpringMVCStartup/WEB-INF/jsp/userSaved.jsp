<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th><spring:message code = "lbl.userId" /></th>
				<th><spring:message code = "lbl.userName" /></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${users}">
				<tr>
					<td>${user.userId}</td>
					<td>${user.userName}</td>
				</tr>
			</c:forEach>				 
		</tbody>
	</table>
</body>
</html>