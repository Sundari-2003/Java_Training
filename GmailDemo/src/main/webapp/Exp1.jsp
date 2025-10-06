<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
	int x = 30;
	int y = 50;
	public int add(){
		return x + y;
	}
	%>
	
	<!-- --------Expression Tag---------------- -->
	<%= add() %>
	
	<!-- --------Scriplet Tag---------------- -->
	<%
		out.println("JSP's Implicit Object");
		out.print(new Date());
	%>
	<!-- <jsp:forward page="home.html"></jsp:forward> -->
	<jsp:include page="login.html"></jsp:include>
	
</body>
</html>