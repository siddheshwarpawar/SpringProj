<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<br><br>
	<div align = "center">
		<h2>Result page</h2>
	<table>
		<tr>
			<th>id</th>
			<th>name</th>
			<th>desg</th>
			<th>sal</th>
			<th>deptno</th>
		</tr>
	<c:forEach items="${resList}" var = "result">
		<tr>
			<td><c:out value="${result.id }"></c:out></td>
			<td><c:out value="${result.name }"></c:out></td>
			<td><c:out value="${result.desg }"></c:out></td>
			<td><c:out value="${result.sal }"></c:out></td>
			<td><c:out value="${result.deptno }"></c:out></td>
		</tr>	
	</c:forEach>
	</table>
	
	<br><br>
	<a href="search.htm">HOME</a>
	</div>

	