<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>

	<%
	/*  String name = (String)request.getAttribute("Name");
	Integer rollNo = (Integer)request.getAttribute("RollNo");
	LocalDateTime time = (LocalDateTime)request.getAttribute("Time");  */
	%>


	<h1>
		Hello My name is
		<%-- <%=name %> --%>
		${Name}
	</h1>

	<h1>This is help page</h1>
	<h1>
		My Roll No is
		<%-- <%=rollNo %> --%>
		${RollNo}
	</h1>
	<h1>
		Date and Time is:
		<%-- <%=time.toString()%> --%>
		${Time}
	</h1>
	<hr>
	<h1>
	${Marks}
	</h1>
	
	<c:forEach var="item" items="${Marks }">
	<h1>${item }</h1>
	<c:out value="${item }"></c:out>
	</c:forEach>
	
</body>
</html>