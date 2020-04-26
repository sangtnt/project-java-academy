<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet">
<style>
	.word{
		height: auto;
		width: 400px;
		background: blue;
		margin:auto;
		margin-top: 10%;
		text-align:center;
		font-size: 20px;
		overflow: auto;
		-webkit-box-shadow: inset -1px 3px 77px 76px rgba(0,0,0,0.59);
		-moz-box-shadow: inset -1px 3px 77px 76px rgba(0,0,0,0.59);
		box-shadow: inset -1px 3px 77px 76px rgba(0,0,0,0.59);
		color: white;
		border-radius: 20px;
	}
	.word:hover{
		cursor:pointer;
	}
	.meaning{
		display:none;
		background: green;
		-webkit-box-shadow: inset -1px 3px 77px 76px rgba(0,0,0,0.59);
		-moz-box-shadow: inset -1px 3px 77px 76px rgba(0,0,0,0.59);
		box-shadow: inset -1px 3px 77px 76px rgba(0,0,0,0.59);
	}
</style>
<script src="js/jquery-3.4.1.min.js"></script>
<script src="js/myjs.js"></script>
</head>
<body style="background: grey">
	<div class="word words">
		${content.words }
	</div>
	<div class="word meaning">
		${content.meaning }
	</div>
	<div style="text-align:center; margin-top: 20px">
		<a style="margin:auto" href="ContentRandomServlet?catid=${sessionScope.catid}">
			<input class="btn btn-lg btn-danger" type="button" value="Another word">
		</a><br/>
		<hr/>
		<a href="HomeServlet"><input type="button" value="Back to home"></a>
	</div>
</body>
</html>