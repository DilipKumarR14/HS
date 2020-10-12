<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

	<%
	
	/*
	 if Back button is pressed it should not show previous page
	*/
	
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	
		/*
	check before entering to welcome jsp file
	*/
	if (session.getAttribute("uname") == null) {
		response.sendRedirect("login.jsp");
	}
	%>

	<h3>Welcome ${ uname }</h3>
	<br>
	<a href="./video.jsp">Video</a>
	<br>
	<br>
	<a href="./about.jsp">About us</a>


<br><br>

	<form action="Logout">

		<input type="submit" value="Logout">

	</form>




</body>
</html>