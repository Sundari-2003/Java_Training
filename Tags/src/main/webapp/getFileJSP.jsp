<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Async Servlet with JavaScript</h1>
	<p id="mla"></p>
	<script type "text/javascript">
	async function getFile(){
		let newpromise=new Promise(function(resolve){
			let request=new XMLHttpRequest();
			request.open('GET','AsyncServlet');
			request.onload=function(){
				if(request.status == 200)
					{
					resolve(request.response);
					}
				else
					{
					resolve("No data available...");
					}
			};
			request.send();
			});
		document.getElementById("mla").innerHTML=await newpromise;
	}
	getFile();</script>
</body>
</html>