<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Employee</title>
</head>
<body bgcolor="tan">
	<br><br>
	<h2 align="center">Search Employee</h2>
	<br><br>
	<form action="result.htm" method="post">
		<div align="center">
			<table>
				<tr>
					<td>ID ::</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>NAME::</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>DESG::</td>
					<td><input type="text" name="desg"></td>
				</tr>
				<tr>
					<td>SAL ::</td>
					<td><input type="text" name="sal"></td>
				</tr>
				<tr>
					<td><input type="submit" value="SUBMIT" name="res"></td>
					<td><input type="reset" value="CLEAR" name ="clear"></td>
				</tr>

			</table>
		</div>		
	</form>
</body>
</html>