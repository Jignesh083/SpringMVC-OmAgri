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
<h1>${msg}</h1>
<form action="submit" method="post">
<label for="data">Submit Data:</label>
<input type="text" id="data" name="data">
<button type="submit">Submit</button>
</form>
</body>
</html>