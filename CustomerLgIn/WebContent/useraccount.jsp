<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
		body {
		  background-color: coral;
		}
		</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<c:forEach var="cus" items="${cusDEtails}">
		
		<table>
		
		
				<tr>
					<td>Customer ID :</td>
					<td>${cus.id}</td>
				</tr>
				<tr>
					<td>Customer Name :</td>
					<td>${cus.nameString}</td>
				</tr>
				<tr>
					<td>Customer Email</td>
					<td>${cus.emailString}</td>
				</tr>
				<tr>
					<td>Customer Phone Number</td>
					<td>${cus.phoneString}</td>
				</tr>
				<tr>
					<td>Customer Username</td>
					<td>${cus.userNameString}</td>
				</tr>

		
		</table>
		
		</c:forEach>
</body>
</html>