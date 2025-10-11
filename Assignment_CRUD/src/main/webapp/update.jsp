<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign up Here</title>
<style type="text/css">
	h1
	{background-color:maroon;
	color:white;
	}
 .p1
	{background-color:navy;
	color:white;
	}
	
	body
	{
		background-color:white
	}
	
	
  p, a {
            font-family: sans-serif;
            font-size:15;
            color: darkblue;
        }
 
</style>
 
</head>
<body>
	<h1>Update Your Name Here</h1>
	<form action="Update" method="post">
		Enter ID:<input type="text" name="id"><br><br>
		Enter New Name:<input type="text" name="nname"><br><br>
	
		<input type="submit" value="Update">
	</form>
 
</body>
</html>

