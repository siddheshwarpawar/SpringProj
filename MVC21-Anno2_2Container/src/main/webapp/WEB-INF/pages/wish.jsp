<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<title>Wish Message</title>

<div align="center">
	<h2 style="color: red;">Wish Message::</h2>
	<hr><br>
	<font face="calibri" color="purple" size="6">
		
		<marquee direction="left" style="color: red">${msg}</marquee>
		<marquee direction="right" style="color: purple;">${msg}</marquee>
		
		<marquee direction="up" style="color: gray;">${msg}</marquee>
		<marquee direction="down" style="color: green;">${msg}</marquee>
		 
	<br> <a href="welcome.htm"><img src="images/home.png"></a>
	</font>
</div>