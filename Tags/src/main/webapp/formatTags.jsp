<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
        <%@ taglib uri="jakarta.tags.core"  prefix="c" %>
    <%@ taglib uri="jakarta.tags.fmt"  prefix="fmt" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:set var="currentDate" value="<%= new Date() %>"> </c:set>
	<c:out value="${currentDate}"></c:out>
	<fmt:formatDate type="date" value="${currentDate}"/><br><br>
	<fmt:formatDate type="time" value="${currentDate }"/>
	<fmt:formatDate type="both" value="${currentDate }"/>
	<fmt:formatDate pattern="yyyy-mm-dd" value="${currentDate }"/>
	
</body>
</html>