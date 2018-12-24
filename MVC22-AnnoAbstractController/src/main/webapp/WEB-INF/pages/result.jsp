
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>Empployee List</h2>

 <table border="1"  bgcolor="cyan">
         <tr> <th>EID</th><th>ENAME</th><th>DESG</th><th>SALARY</th></tr>
          <c:forEach var="dto"  items="${listResult}">
              <tr>
                 <td>${dto.eid}</td>
                 <td>${dto.ename}</td>
                 <td>${dto.desg}</td>
                 <td>${dto.salary}</td>
              </tr>
          </c:forEach>
</table>