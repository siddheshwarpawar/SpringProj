<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   
<div align="center">
	<h1>Login Page</h1>
<form:form method="POST" modelAttribute="userCmd">
	Username :: <form:input path="uname"/><form:errors path="uname"/><br><br>
	Password :: <form:input path="pass"/><form:errors path="pass"/><br><br><br><br>
	<input type="submit" value="Login"> &nbsp;  &nbsp; &nbsp;
	<input type="reset" value="Reset"> <br>
</form:form> 

${resultMsg}

</div>