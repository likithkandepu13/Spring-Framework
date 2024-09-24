<!-- addStudentView.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adding New Employee</title>
</head>
<body>
 <h2>Add a New Employee</h2>
 <form action="addStudent" method="post">
 <label for="id">ID:</label> <input type="text" id="eid" name="eid">
 <br>
 <br>
 <label for="name">Name:</label> <input type="text" id="ename" name="ename">
 <br>
 <br>
 <input type="submit" value="Submit">
 </form>
</body>
</html>
