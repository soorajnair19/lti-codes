<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>;
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>

<a href="RegForm.jsp"> Register </a> <br> <br>
<a href="servlets">GetHeader </a> <br> <br>
<%-- <%User user= (User)request.getAttribute("UserObj"); %>
<%user.getUsername(); %> --%>
<form action="LoginServlet" method="POST">

Username:<input type="text" name="username"> <br> <br>
Password: <input type="password" name="password"> <br> <br>
<input type="submit" value=Submit>


</form>

</body>
</html>