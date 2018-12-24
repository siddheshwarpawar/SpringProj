<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<h1 style="color:red;text-align:center">MultiActionFormController</h1>
<form  action="insert.htm"  method="POST">
    EID :: <input type="text" name="eid"> <br>
    ENAME ::<input type="text" name="ename"> <br>
    DESG :: <input type="text" name="desg"> <br>
    SALARY :: <input type="text" name="salary"> <br>
    
    <input type="submit" value="add" name="p1">
    <input type="submit" value="view" name="p1">
	<input type="reset" value="Reset" >
</form>
<br>

<div class="col-sm-6" style="background-color: lavenderblush;">
					<a href="list_stud.htm"> <img title="Get all Employee List"
						style="size: 10px" src="images/report.png">
					</a>
				</div>

<c:if test="${res ne null }">
${res} 
</c:if>