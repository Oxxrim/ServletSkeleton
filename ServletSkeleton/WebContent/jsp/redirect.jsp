<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Redirect</title>
</head>
<body>
	
	<br>
	<br>
	<br>
	<br>
	<h2>Your reversed text is</h2>
	<h3><%=session.getAttribute("reversedText") %></h3>
	<h3>Recieved by method <%=session.getAttribute("metod")%></h3>
	<br>
	<br>
	<a href="/ServletSkeleton/index.jsp">Back to landing page!!!</a>
	
</body>
</html>