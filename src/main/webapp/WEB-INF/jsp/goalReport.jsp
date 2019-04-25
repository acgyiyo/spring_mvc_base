<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Goals Report</title>
</head>
<body>
	<table>
		<tr>
			<th>Minutes</th>
			<th>Exercises minutes</th>
			<th>Activity</th>
		</tr>
		<c:forEach items="${goalReports}" var="goalReport">
			<tr>
				<td>${goalReport.goalMinutes}</td>
				<td>${goalReport.exerciseMinutes}</td>
				<td>${goalReport.exerciseActivity}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>