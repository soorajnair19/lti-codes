<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="book1" scope="session" class="model.Book"></jsp:useBean>
<h1> Book Details <br>
BookID&nbsp;<jsp:getProperty property="id" name="book1"/> <br>
BookName&nbsp;<jsp:getProperty property="bookname" name="book1"/> <br>
AuthorName&nbsp;<jsp:getProperty property="authorname" name="book1"/> <br>

</h1>
</body>
</html>