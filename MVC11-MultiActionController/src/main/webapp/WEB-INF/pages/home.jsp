<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body bgcolor="cyan">
	<div align="center">
		<form action="mvc.htm" method="POST">
			Name::<input type="text" name = "name"> <br>
			Age::<input type="text" name = "age"> <br>
			Address::<input type="text" name = "addrs"> <br>
			Email::<input type="email" name="email"> <br> <br>
			<input type="submit" name="p1" value="insert"> &nbsp;
			<input type="submit" name="p1" value="update"> &nbsp;
			<input type="submit" name="p1" value="delete"> &nbsp;
			<input type="submit" name="p1" value="view"> &nbsp;
		</form>
	</div>
	
	<br><br>
	
	${resultData} 
	
	</body>
</html>