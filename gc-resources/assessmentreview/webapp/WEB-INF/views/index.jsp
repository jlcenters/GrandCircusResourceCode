<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
	<form action="/hotels">
	<input type ="text" name="city" placeholder="Enter City to search by">
	<button type="submit">SEARCH</button>
	</form>
		<c:forEach var="city" items="${cities}">
			<h2><a href="/hotels?city=${city}">${city}</a></h2>
		</c:forEach>
	</div>
</body>
</html>