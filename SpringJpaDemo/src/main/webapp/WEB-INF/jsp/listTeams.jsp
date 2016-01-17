<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Teams</title>
</head>
<body>
	<table border=1 align=center>
		<tr>
			<th>TeamName</th>
			<th>Tutor</th>
			<th>Student</th>
			<th>Sex</th>
		</tr>
		<c:forEach items="${teams}" var="team">
			<tr>
				<td>${team.name}</td>
				<td>${team.tutor}</td>
				<td colspan=2>
				<table>
					<c:forEach items="${team.students}" var="student">
						<tr>
							<td>${student.name}</td>
							<td>${student.sex}</td>
						</tr>
					</c:forEach>
				</table>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>