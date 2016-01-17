<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add a student</title>
</head>
<body>
<form:form commandName="student">
		<spring:message code="student.text" />
		<table>
			<tr>
				<td>name:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>sex:</td>
				<td><form:input path="sex" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add a student" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>