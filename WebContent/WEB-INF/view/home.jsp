<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/mycss.css" rel="stylesheet">
</head>
<body style="background: grey">
	<div class="container-fluid">
		<div class="row">
			<c:forEach var="cat" items="${category}">
				<div class="cot col-xs-6 col-sm-4">
					<div class="category">
						<a href="ContentRandomServlet?catid=${cat.id}">${cat.name }</a>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>