<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add the Alien</h2>
<form action="addAlien">
	
	<label>AID</label><br>	
	<input type="text" name="aid"></input><br>
	<label>NAME</label><br>
	<input type="text" name="aname"></input><br><br>
	<input type="submit"><br>

</form>

<br>
<h2>Get the Alien</h2>
<form action="getAlien">
	
	<label>AID</label><br>	
	<input type="text" name="aid"></input><br><br>
	<input type="submit"><br>

</form>


</body>
</html>