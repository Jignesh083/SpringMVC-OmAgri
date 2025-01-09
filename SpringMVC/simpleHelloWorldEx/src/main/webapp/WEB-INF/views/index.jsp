
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello world!</h1>


<!-- <%-- <% %> --%> It is called ScriptLet Tag -->
<%

String name = (String)request.getAttribute("name");
Integer id = (Integer)request.getAttribute("Id");
List<String> frnds = (List<String>) request.getAttribute("f");
%>


<h1>Name is: <%=name%></h1>
<h1>Id: <%=id %></h1>
<h1>Friends: <%=frnds %></h1>


<h1><% 

for(String s:frnds){
	out.println(s);
}

%></h1>
</body>
</html>