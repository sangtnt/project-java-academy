<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/mycss.css" rel="stylesheet">
</head>
<body style="background: grey">
	<h1 style="text-align: center; color: red; background: black">WARNING!!!<br/>
		KHÔNG PHẬN SỰ MIỄN VÀO!
	</h1>
	<form action="LoginServlet" method="POST">
		<table class="login">
			<caption>
				<h3 style="text-shadow: 4px 4px 9px rgba(0, 131, 150, 1);">ENTER ADMIN USERNAME</h3>
			</caption>
			<tr>
				<td style="font-weight: bold">Username:</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td style="font-weight: bold">Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login"></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align:center; color: red; background: black">${message }</td>
			</tr>
		</table>
	</form>
</body>
</html>