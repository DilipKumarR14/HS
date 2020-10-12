<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Videos</title>
</head>
<body>

	<%
	/*
	 if Back button is pressed it should not show previous page
	*/
	
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	
	/*
	check before entering to video jsp file
	*/
	if (session.getAttribute("uname") == null) {
		response.sendRedirect("login.jsp");
	}
	%>

	<h3>Hey youre in video page</h3>



	<iframe width="560" height="315"
		src="https://www.youtube.com/embed/-sL8RnkjBDY" frameborder="0"
		allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
		allowfullscreen></iframe>

</body>
</html>