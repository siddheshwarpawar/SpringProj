<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body bgcolor="pink">
	<div align="center">
		<div align="right">
			<a href="welcome.htm">HOME</a>
		</div>
		<br>
		<br>
		<h2>Employee Records</h2>
		<hr>
		<br>
		<table border="2" style="width: 50%; height: 60%;">
			<tr>
				<th>EID</th>
				<th>ENAME</th>
				<th>DESG</th>
				<th>SALARY</th>
			</tr>
			<c:forEach var="dto" items="${allEmps}">
				<tr>
					<td><c:out value="${dto.eid}" /></td>
					<td><c:out value="${dto.ename}" /></td>
					<td><c:out value="${dto.desg}" /></td>
					<td><c:out value="${dto.salary}" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>