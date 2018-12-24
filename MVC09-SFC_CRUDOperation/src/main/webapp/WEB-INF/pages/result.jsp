<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<body bgcolor="tan">
	<h1 style="color: red; text-align: center;">Student Report</h1>
	<div align="center">

		${resMsg}

		<c:choose>
			<c:when test="${!empty emplist}">
				<table  class="table table-hover" border="1">
				<thead>
					<tr>
						<th>EID</th>
						<th>ENAME</th>
						<th>DESG</th>
						<th>SALARY</th>
						<th>op1</th>
						<th>op2</th>
					</tr>
				</thead>
					<c:forEach items="${emplist}" var="emp">
						<tr class="danger">
							<td>${emp.eid}</td>
							<td>${emp.ename}</td>
							<td>${emp.desg}</td>
							<td>${emp.salary}</td>
							<td class="success"><a href="update_emp.htm?id=${emp.eid}">
									<img title="Edit student" width="36" height="30"
									src="images/edit.ico"></a></td>
							<td class="info"><a href="delete_emp.htm?id=${emp.eid}"
											onclick="return confirm_click()">
											<img title="Delete student" width="36" height="30"
									src="images/delete.ico"></a></td>
						</tr>
					</c:forEach>
				</table>
			</c:when>
		</c:choose>
	</div>
	<br><br><br>
	<div align="center">
		<a href="add_emp.htm">
					<img title="Add new Employee" width="36" height="30"
									src="images/add.png"></a>
		<br>
		<a href="welcome.htm"> <img title="Get all Employee List"
			style="size: 3px" src="images/home.png">
		</a>
	</div>
</body>


<script type="text/javascript">
function confirm_click()
{
	return confirm("Are you sure ?");
}
</script>