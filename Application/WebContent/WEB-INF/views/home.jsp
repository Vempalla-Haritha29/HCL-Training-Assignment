<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align: center">This is a home page</h1>
	<a href="display">Display Application Details</a>
	<table border=1>
		<tr>
			<th>Id</th>
			<th>name</th>
			<th>description</th>
			<th>cookingNotes</th>
		</tr>
		<c:forEach items="${applications}" var="application">
			<tr>
				<td>${recipe.Id}</td>
				<td>${recipe.Id}</td>
				<td>${recipe.name}</td>
				<td>${recipe.description}</td>
				<td>${recipe.cookingNotes}</td>
				<td><a href="#">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>