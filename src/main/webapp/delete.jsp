 
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
<title>Create</title>
</head>
<body>
	<h2>Spring MVC Create, Read, Update and Delete (CRUD) Example</h2>	
<form action="/delete" method="post">
<pre>
    <strong>Delete Here | <a href="./readTicket">Click for Read</a></strong>
		
	
	
	PRICE: <input type="text" name="price" />
	

	<input type="submit" value="Delete" />
	
	
</pre>
</form>
${msg}
</body>
</html>