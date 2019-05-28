
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Create</title>
</head>
<body>
	
<form action="create" method="post">
<pre>
    <strong>Create Here | <a href="./readTicket">Click for Read</a></strong>
		
	HOW_LONG: <input type="text" name="how_long" />
	
	PRICE: <input type="text" name="price" />
	
	ID_CLASS_TICKET: <input type="text" name="id_class_ticket" />

	<input type="submit" value="Create" />
</pre>
</form>
${msg}
</body>
</html>