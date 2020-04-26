<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/mycss.css" rel="stylesheet">
<script src="js/jquery-3.4.1.min.js"></script>
<script src="js/myjs.js"></script>
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
</style>
</head>
<body>
	<form action="UpdateAccountServlet" method="post">
		<table>
			<caption>Your Information</caption>
			<tr>
				<td class="left">Your Full Name:</td>
				<td><input name="fullname" class="right edit" value="${sessionScope.admin.fullname}" required></td>
			</tr>
			<tr>
				<td class="left">Your username:</td>
				<td><input name="username" class="right edit" value="${sessionScope.admin.username}" required></td>
			</tr>
			<tr>
				<td class="left">Your Phone:</td>
				<td><input name="phone" class="right edit" value="${sessionScope.admin.phone}" required></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input class="btn-save" value="Save" type="submit" onClick="return confirm('Do you want to save your info')">
					<a href="admin"><input type="button" value="Back to home"></a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>