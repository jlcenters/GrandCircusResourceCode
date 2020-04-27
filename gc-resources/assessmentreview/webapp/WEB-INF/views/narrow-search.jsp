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
		<table>
			<tr>
				<th>Hotel Name</th>
				<th>Price Per Night</th>
			</tr>
			<c:forEach var="hotel" items="${hotels}">
				<tr>
					<td>${hotel.name}</td>
					<td>${hotel.pricePerNight}</td>
				</tr>
			</c:forEach>

		</table>
	</div>
</body>
</html>