<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" 
prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Employee Page</title>
	<link href="${pageContext.request.contextPath}/WEB-INF/styles/mystyle.css" rel="stylesheet" />
	<style>
.error {
	color: red;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
<h1>
	Add an Employee
</h1>
<c:url var="addAction" value="/employee/add" ></c:url>
<form:form action="${addAction}" 
	modelAttribute="employee">
<table border="1">
	<c:if test="${!empty employee.name}">
	<tr>
		<td>
			<form:label path="id">
				<spring:message text="employee ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="id" readonly="true" 
			size="8"  disabled="true" />
			<form:hidden path="id" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="name">
				<spring:message text="employee Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="name" />
			<form:errors path="name" cssClass="errors"></form:errors>
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="country">
				<spring:message text="Country Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="country" />
			<form:errors path="country" cssClass="errors"></form:errors>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${!empty employee.name}">
				<input type="submit"
					value="<spring:message 
					text="Edit employee"/>" />
			</c:if>
			<c:if test="${empty employee.name}">
				<input type="submit"
					value="<spring:message 
					text="Add employee"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<h3>employees List</h3>
<c:if test="${!empty listemployees}">
	<table class="tg" border="1">
	<tr>
		<th width="80">employee ID</th>
		<th width="120">employee First Name</th>
		<th width="120">employee Last Name</th>
		<th width="120">employee email</th>
		<th width="120">address</th>
		<th width="120">salary</th>
		<th width="120">phone number</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	
	<c:forEach items="${listemployees}" var="employee">
		<tr>
			<td>${employee.id}</td>
			<td>${employee.firstName}</td>
			<td>${employee.lastName}</td>
			<td>${employee.emailAddress}</td>
			<td>${employee.address}</td>
			<td>${employee.salary}</td>
			<td>${employee.phoneNumber}</td>
		    <td>${employee.password}</td>
			
			<td><a href="
			<c:url value='/edit/${employee.id}' />" >Edit</a></td>
			<td><a href="
			<c:url value='/delete/${employee.id}' />" >Delete</a>
			</td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
