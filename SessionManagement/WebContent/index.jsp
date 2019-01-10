<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
   <%@taglib uri="/WEB-INF/custom.tld" prefix="custom"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>

<%-- <%User user= (User)request.getAttribute("UserObj"); %>
<%user.getUsername(); %> --%>


<!-- <form action="Servlet1" method="POST">
<input type="submit" value="getrecords">
</form>
<br> <br>
<form action="SessionServlet3" method="POST">
FirstName:<input type="text" name="id"> <br> <br>
Salary:<input type="text" name="bookname"> <br> <br>
<input type="submit" value="addrecords">


</form> -->

<custom:greet> Hello </custom:greet>


</body>
</html>