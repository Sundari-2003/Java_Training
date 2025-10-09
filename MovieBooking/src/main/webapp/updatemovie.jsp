<%@page import="com.test.MovieDao" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head><title>Update Movie</title></head>
<body>
<h2>Update Movie Director</h2>
<form method="post">
    Enter Movie ID: <input type="text" name="id"><br>
    New Director Name: <input type="text" name="director"><br>
    <input type="submit" value="Update">
</form>

<%
    String idStr = request.getParameter("id");
    String newDirector = request.getParameter("director");

    if (idStr != null && newDirector != null) {
        int id = Integer.parseInt(idStr);
        MovieDao.updateMovie(id, newDirector);
        out.println("Movie updated successfully.");
    }
%>
</body>
</html>