<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<div class="container">
  <div class="jumbotron">
    <h2>Update Employee Record</h2>
<br><br>
</div>

<font face="calibri" color="purple" size="4">

<div class="container">
  
  <form:form commandName="empCmd" method="post">
    <div class="form-group row">
      <div class="col-xs-3">
        <label for="ex2">EID</label>
        <form:input path="eid" disabled="true" class="form-control"/>
      </div>
      <div class="col-xs-3">
        <label for="ex2">ENAME</label>
        <form:input path="ename" class="form-control"/>
      </div>
      <div class="col-xs-3">
        <label for="ex2">EID</label>
        <form:input path="desg"  class="form-control"/>
      </div>
      <div class="col-xs-3">
        <label for="ex2">EID</label>
        <form:input path="salary" class="form-control"/>
      </div>
    </div>
    <br><br>
    <div align="center">
    	<input type="submit" class="btn btn-info" name="Update" value="Update">
    </div>
    		
    
  </form:form>
</div>



<%-- 	<form:form commandName="empCmd" method="post">
   		<table border="1">
   			<tr><td><b>EID</b></td><td><form:input path="eid" disabled="true" /></td></tr>
   			<tr><td><b>ENAME</b></td><td><form:input path="ename" /></td></tr>
   			<tr><td><b>DESG</b></td><td><form:input path="desg" /></td></tr>
   			<tr><td><b>SALARY</b></td><td><form:input path="salary" /></td></tr>
   		</table>
   		
<br>
		<input type="submit" class="btn btn-info" name="Update" value="Update">
	</form:form> --%>
</div>
<a href="list_stud.htm"> <img title="Get all Employee List"
	style="size: 3px" class="img-rounded" src="images/home.png">
</a>

