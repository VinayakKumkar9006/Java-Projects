<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

</head>
<body>
<div align="center">
<h1>User Login</h1>
</div>
<form action="LoginServlets" method="post">
<table>
<tr><td> Enter Name:</td><td><input type="text" name="txtName"></td></tr>
<tr><td> Enter Password:</td><td><input type="Password" name="txtPwd"></td></tr>
<tr><td><input type="Submit" value="Login"></td><td><input type="Reset"></td></tr>
</table>
</form>

</body>
</html>