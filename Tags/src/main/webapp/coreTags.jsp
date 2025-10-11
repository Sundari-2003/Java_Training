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
	
	<c:set var="age" scope="session" value="${30}"></c:set>
<!--  	<c:remove var="x"/>-->

	<c:out value="${x}"></c:out>
	
	<c:choose>
		<c:when test="${age==18}">
		you are eligible for voter id
		</c:when>
		
		<c:when test="${age>=18 }">
		eligible
		</c:when>
		
		<c:otherwise>
		not eligible for voter id
		</c:otherwise>
	
	</c:choose>
		<c:forEach var="i" begin="1" end="10">
		<c:out value="${i}"></c:out>
		</c:forEach>
	
</body>
</html>