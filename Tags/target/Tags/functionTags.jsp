<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
        
    <%@ taglib uri="jakarta.tags.core"  prefix="c" %>
    <%@ taglib uri="jakarta.tags.functions"  prefix="fn" %>
    <%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Function Tags</title>
</head>
<body>
	<c:set var="msg" value="hii simple mla jstl function tags"></c:set>
	
	<c:if test="${fn:contains(msg,'mla')}">
		<h1>Yes the given content mla available</h1>
	</c:if>
	
	<c:if test="${fn:containsIgnoreCase(msg,'mla')}">
		<h1>Yes the given content mla is tested</h1>
	</c:if>
	
	<c:out value="${msg}"></c:out>
	<c:out value="${fn:toUpperCase(msg)}"></c:out>
	
</body>
</html>