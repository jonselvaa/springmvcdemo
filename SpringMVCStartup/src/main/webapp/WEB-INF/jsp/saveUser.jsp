<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><spring:message code = "lbl.title" /></title>
<style>
	.error{
		color:red
	}
	.errorblock {
         color: #000;
         background-color: #ffEEEE;
         border: 3px solid #ff0000;
         padding: 8px;
         margin: 16px;
      }
</style>
</head>
<body>
	<h1>Create new User</h1>
	<form:form method="POST" modelAttribute="user" action="saveUser.html">
	<form:errors path = "*" cssClass = "errorblock" element = "div" />
		<table>
			<tr>
				<td><spring:message code = "lbl.userName" /></td>
				<td>
					<form:input path="userName" size = "30" />
					<form:errors path="userName" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td colspan = "2" align = "center">
				<input type = "submit" value = "Save User" name = "btnSubmit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>