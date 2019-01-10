<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sqll"%>
<%@page import="java.util.*"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL PRACTICE</title>
</head>
<body>

	<sqll:setDataSource var="ds" driver="oracle.jdbc.driver.OracleDriver"
		url="jdbc:oracle:thin:@localhost:1521:xe" user="hr" password="hr"
		scope="session"/>
		
		<sqll:query var="query" sql="select first_name,salary from employees"
		dataSource="${ds}"
		scope="session"
		startRow="1" maxRows="10"></sqll:query>
		
		<sqll:query var="query1" sql="insert into employees values (?,?) "
		dataSource="${ds}"
		scope="session"
		startRow="1" maxRows="10"></sqll:query>
		

<c:forEach items="${query.rows}" var="row"> <br>
 <c:out value="${row.first_name}"></c:out> <br>
	<c:out value="${row.salary}"></c:out> <br>
	</c:forEach>
</body>
</html>