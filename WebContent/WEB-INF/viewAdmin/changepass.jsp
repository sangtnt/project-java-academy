<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	.left{
		font-weight: bold;
		text-align: right;
	}
	.right{
		color: red;
		font-weight: bold;
	}
	caption{
		color: blue;
		font-size: 30px;
	}
	table{
		border: 1px black solid;
		margin: auto;
	}
	.mess, .mess1{
		color: red;
		text-align: center;
		font-weight: bold;
	}
</style>
<script src="js/jquery-3.4.1.min.js"></script>
<script src="js/myjs.js"></script>
</head>
<body>
	<p class="password" style="display: none">${sessionScope.admin.password }</p>
	<form action="ChangePassAdminServlet" method="post">
		<table>
			<caption>CHANGE PASSWORD</caption>
			<tr>
				<td class="left">Old Password:</td>
				<td><input class="right oldpass" type="text" required></td>
			</tr>
			<tr>
				<td colspan="2" class="mess1"></td>
			</tr>
			<tr>
				<td class="left">New Password:</td>
				<td><input class="right new1" name="newpass" type="password" required></td>
			</tr>
			<tr>
				<td class="left">New password again:</td>
				<td><input class="right newpass" type="password" required></td>
			</tr>
			<tr>
				<td colspan="2" class="mess"></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="Change">
					<a href="admin"><input type="button" value="Back to home"></a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>