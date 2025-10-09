<%@page import="com.test.MovieDao" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Movie Created</title>
</head>
<body>
    <jsp:useBean id="mv" class="com.test.Movie" />
    <jsp:setProperty property="*" name="mv" />

    <%
        MovieDao.createMovie(mv);
        out.println("Movie created successfully!");
    %>
</body>
</html>