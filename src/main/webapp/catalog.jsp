
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

<title>Insert title here</title>
</head>
<body>

<table>
	<c:forEach var="plane" items="${listP}" varStatus="status">
			<tr>
			    
			    <td>${plane.id_plane}</td>
				<td>${plane.plane_name}</td>
				<td>${plane.id_ticket_plane}</td>
				<td>${plane.id_class_plane}</td>
				
				
			</tr>
			</c:forEach>
			</table>
			
			<table>
	<c:forEach var="airport" items="${list}" varStatus="status">
			<tr>
			    
			    <td>${airport.id_airport}</td>
				<td>${airport.city_name}</td>
				<td>${airport.airport_name}</td>
				<td>${airport.id_plane_airport}</td>
				
				
			</tr>
			</c:forEach>
			</table>





</body>
</html>