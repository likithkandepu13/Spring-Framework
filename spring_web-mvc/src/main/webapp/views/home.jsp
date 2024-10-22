<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Testing</title>
</head>
<body>
	<h2>Add a New Student</h2>
	<form action="addStudent" method="post">
		<label for="id">ID:</label> <input type="text" id="id" name="id">
		<br>
		<br> 
		<label for="name">Name:</label> <input type="text" id="name" name="name">
		<br> 
		<br> 
		<input type="submit" value="Submit">
	</form>

</body>
</html>