<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>




<html>
<body>
	


<table>
	 	<th>Sr No</th>
		<th>Ticket_id</th>
		<th>Price</th>
		<th>How_long</th>
		<th>ticket_class_id</th>

		<c:forEach var="ticket" items="${list}" varStatus="status">
			<tr>
			    <td>${status.index + 1}</td>
				<td>${ticket.price}</td>
				<td>${ticket.how_long}</td>
				<td>${ticket.id_class_ticket}</td>

			</tr>
		</c:forEach>
	</table>
	
	
	
</body>
</html>