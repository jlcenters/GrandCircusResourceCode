<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>I LOVE COOKIES</title>
</head>
<body>
    <%@ include file="partials/header.jsp" %>
<h1>SESSION OF COOKIES</h1>
<h3>${cookieCount }</h3>
<a href ="/cookies/add">ADD</a>
</body>
</html>