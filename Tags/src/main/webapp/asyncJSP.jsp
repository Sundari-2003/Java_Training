<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p id="mla1"></p>
		<p id="mla2"></p>
		<p id="mla3"></p>
	
	<script type="text/javascript">
	function mlaDisp(inputdata)
	{
		document.getElementById("mla1").innerHTML=inputdata;
	}
	
	function setData(input1,input2,mlaCallback)
	{
		let sum=input1+input2;
		mlaCallback(sum);
	}
	setData(10,20,mlaDisp);
	setTimeout(mlaAsyncTime,3000);
	
	function mlaAsyncTime()
	{
		document.getElementById("mla2").innerHTML="MLA NEXT EXAMPLE..";
		
	}
	</script>
</body>
</html>