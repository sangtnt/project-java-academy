<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/bootstrap-theme.css" rel="stylesheet">
<link href="css/mycss.css" rel="stylesheet">
<script src="js/jquery-3.4.1.min.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/myjs.js"></script>
<style>
	.table-border, .table-border th, .table-border td{
		border: 1px solid black;
	}
	.left{
		font-weight: bold;
		text-align: right;
	}
	.right{
		color: red;
		font-weight: bold;
	}
</style>
</head>
<body>
	<nav class="navbar navbar-default">
	  <div class="container-fluid">
	    <!-- Brand and toggle get grouped for better mobile display -->
	    <div class="navbar-header">
	      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
	        <span class="sr-only">Toggle navigation</span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	      </button>
	      <a class="navbar-brand" href="#">Admin</a>
	    </div>
	
	    <!-- Collect the nav links, forms, and other content for toggling -->
	    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	      <ul class="nav navbar-nav">
	        <li class="active"><a href="#">Home <span class="sr-only">(current)</span></a></li>
	        <li><a href="CategoryServlet">Category</a></li>
	      </ul>
	      <form class="navbar-form navbar-left">
	        <div class="form-group">
	          <input type="text" class="form-control" placeholder="Search">
	        </div>
	        <button type="submit" class="btn btn-default">Submit</button>
	      </form>
	      <ul class="nav navbar-nav navbar-right">
	        <li class="dropdown">
	          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Info</a>
	          <ul class="dropdown-menu">
	            <li><a href="UpdateAccountServlet">View account</a></li>
	            <li><a href="ChangePassAdminServlet">Change password</a></li>
	            <li role="separator" class="divider"></li>
	            <li><a href="LogoutServlet">Logout</a></li>
	          </ul>
	        </li>
	      </ul>
	    </div><!-- /.navbar-collapse -->
	  </div><!-- /.container-fluid -->
	</nav>
<!-- end menu -->
	<table class="table table-border table-hover table-striped" style="margin: auto; width: 500px;">
		<thead>
			<tr>
				<th></th>
				<th>Meaning</th>
				<th>Type</th>
			</tr>
		</thead>
		<c:forEach var="con" items="${sessionScope.content }">
			<tr>
				<td>${con.words }</td>
				<td>${con.meaning }</td>
				<td>${con.category.name }</td>
			</tr>
		</c:forEach>
	</table>
	<div style="text-align:center; margin-top:20px">
		<input type="button" value="Add more" class="btn btn-primary add">
	</div>
	<form action="InsertContentServlet" method="post">
		<table class="fadd" style="margin:auto; margin-top:20px">
			<tr>
				<td class="left">Word: </td>
				<td><input name="word" class="right" type="text" required></td>
			</tr>	
			<tr>
				<td class="left">Meaning: </td>
				<td><input name="meaning" class="right" type="text" required></td>
			</tr>
			<tr>
				<td class="left">Type: </td>
				<td>
					<select name="category">
						<c:forEach var="cat" items="${sessionScope.category }">
							<option value="${cat.id }">${cat.name }</option>
						</c:forEach>
					</select>
				</td>
			</tr>		
			<tr>
				<td></td>
				<td><input type="submit" value="Add"><input class="cadd" type="button" value="Cancel"></td>
			</tr>
		</table>
	</form>
</body>
</html>