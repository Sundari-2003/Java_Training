<%@ page import="java.util.List" %>
<%@page import="com.test.MovieDao" %>
<%@page import="com.test.Movie" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head><title>Read Movie</title></head>
<body>
<h2>Search Movie by Name</h2>
<form method="get">
    Enter Movie Name: <input type="text" name="name">
    <input type="submit" value="Search">
</form>

<%
    String name = request.getParameter("name");
    if (name != null && !name.isEmpty()) {
        Movie mv = MovieDao.getMovieByName(name);
        if (mv != null) {
            out.println("Movie Found: " + mv.getName() + " directed by " + mv.getDirector());
        } else {
            out.println("Movie not found.");
        }
    }
%>

<h2>All Movies</h2>
<%
    List<Movie> movies = MovieDao.getAllMovies();
    for (Movie m : movies) {
        out.println("<br>" + m.getId() + " - " + m.getName() + " - " + m.getDirector());
    }
%>
</body>
</html>