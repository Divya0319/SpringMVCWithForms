<!DOCTYPE html>
<html>
	<head>
		<title>Hello World - Input form</title>
	</head>
	<body>
	<form action="processFormVersionThree" method="GET">
		<input type = "text" name = "studentName"
		 	placeholder="What's your name?"/>
		 
		 <input type = "submit" />
		 
		 <br>
		 <img src="${pageContext.request.contextPath}/assets/pics/logo.bmp">
		 
	</form>
	</body>
</html>