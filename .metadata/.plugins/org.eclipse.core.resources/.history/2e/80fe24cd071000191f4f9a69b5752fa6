<%-- 
    Document   : addbooks
    Created on : 12 Jul, 2017, 1:28:08 PM
    Author     : muska
--%>

<%@page import="java.com.dao.BookDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean
            id = "book1" class="java.com.model.Book" scope="page">
            
            </jsp:useBean>

        <jsp:setProperty property="*" name="book1"/>
        


        <%
        int retval = BookDAO.addBook(book1);
        if (retval > 0)
        
            %>
        <%="book added"%>





    </body>
</html>
