<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="jakarta.tags.core"  prefix="c" %>
    <%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Core Tags</title>
</head>
<body>
	<h1>Test JSP</h1>
	<%!
	int x=30;
	
	%>
	<c:set var="x" scope="session" value="${30}"></c:set>
	<c:out value="${x}"></c:out>
</body>
</html>