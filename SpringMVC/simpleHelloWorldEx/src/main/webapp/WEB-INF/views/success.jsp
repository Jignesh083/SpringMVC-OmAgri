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
<h3>${header1 }</h3>
<h1>Welcome ,${user.userName }</h1>
<h1>Your Email Address is ${user.email }</h1>
<h1>Your password is ${user.password }</h1>
</body>
</html>