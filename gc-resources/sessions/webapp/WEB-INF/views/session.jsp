<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body class = "bg-${preferences.theme }">
    <%@ include file="partials/header.jsp" %>

<p>${sessionId }</p>
<p>${preferences.name }</p>
	<div class="container">
		<h1>Hello</h1>
	</div>
	
	<div class = "container">
	<form method = "post">
	<label>Name:</label>
	<input type ="text" name="name">
	<label></label>
	</form>
</div>
</body>
</html>