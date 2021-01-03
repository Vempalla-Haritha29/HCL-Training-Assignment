<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="customers">Display Customers</a>
<table>
  <%
    List<Customer> customers=(List<Customer>)request.getAttribute("customers");
    System.out.println(customers);
    for(customer c:customers)
  {
	%>
	<tr>
	<td><%=c.getId()%></td><td><%=c.getName() %></td><td><%=c.getAddress() %></td>
	</tr>
	<%
	}
	%>
</table>

</body>
</html>