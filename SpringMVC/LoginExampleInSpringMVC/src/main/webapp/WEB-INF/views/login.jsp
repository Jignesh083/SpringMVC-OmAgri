<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Login Form</h2>
	<form action="login" method="post">
	<label for="userName">UserName:</label>
	<input type="text" id="username" name="userName" required="required">
	<br>
	<label for="password">Password:</label>
	<input type="password" id="password" name="password" required="required">
	<br>
	<button type="submit">Login</button>
	</form>
	<p style="color: red;">${error}</p>
</body>
</html>