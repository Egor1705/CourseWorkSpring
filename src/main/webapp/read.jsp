  
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Read</title>
</head>
<body>
	<h2>Spring MVC Create, Read, Update and Delete (CRUD) Example</h2>
	<p><strong>Ticket List is Here | <a href="create.jsp">Click for Create</a></strong></p>
	<p><strong>Ticket List is Here | <a href="delete.jsp">Click for Delete</a></strong></p>
	
	 
	
	
	
	
	
	
	
	
	
	
	
	<table border="1">
		<tr>
		
			<th>HOW_LONG</th>
			<th>PRICE</th>
			<th>ID_CLASS_TICKET</th>
		</tr>
		<c:forEach var="ticket" items="${listTicket}">
			<tr>
				<td>${ticket.how_long}</td>
				<td>${ticket.price}</td>
				<td>${ticket.id_class_ticket}</td>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>