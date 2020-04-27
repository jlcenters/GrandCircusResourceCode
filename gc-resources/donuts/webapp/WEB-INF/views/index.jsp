<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h1>It Be Donuts Out Here</h1>
	<ul>
		<c:forEach items="${donuts}" var="donut">
			<li>${donut.count}</li>
		</c:forEach>
	</ul>

</body>
</html>