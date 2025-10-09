<%@page import="com.test.MovieDao" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head><title>Delete Movie</title></head>
<body>
<h2>Delete Movie</h2>
<form method="post">
    Enter Movie ID to Delete: <input type="text" name="id">
    <input type="submit" value="Delete">
</form>

<%
    String idStr = request.getParameter("id");
    if (idStr != null) {
        int id = Integer.parseInt(idStr);
        MovieDao.deleteMovie(id);
        out.println("Movie deleted successfully.");
    }
%>
</body>
</html>
