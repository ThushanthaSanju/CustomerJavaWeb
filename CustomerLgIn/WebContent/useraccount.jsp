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

	<table>
		<c:forEach var="cus" items="${cusDEtails}">


			<c:set var="id" value="${cus.id}" />
			<c:set var="name" value="${cus.nameString}" />
			<c:set var="email" value="${cus.emailString}" />
			<c:set var="phone" value="${cus.phoneString}" />
			<c:set var="username" value="${cus.userNameString}" />
			<c:set var="password" value="${cus.passwordString}" />


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
			<tr>
				<td>Password</td>
				<td>${cus.passwordString}</td>
			</tr>




		</c:forEach>

	</table>

	<c:url value="updatecustomer.jsp" var="cusupdate">

		<c:param name="id" value="${id}"></c:param>
		<c:param name="name" value="${name}"></c:param>
		<c:param name="email" value="${email}"></c:param>
		<c:param name="phone" value="${phone}"></c:param>
		<c:param name="username" value="${username}"></c:param>
		<c:param name="password" value="${password}"></c:param>

	</c:url>

	<a href="${cusupdate}"> <input type="button" name="update"
		value="Update My Data">
	</a>
	<br>


	<c:url value="deletecustomer.jsp" var="cusdelete">

		<c:param name="id" value="${id}"></c:param>
		<c:param name="name" value="${name}"></c:param>
		<c:param name="email" value="${email}"></c:param>
		<c:param name="phone" value="${phone}"></c:param>
		<c:param name="username" value="${username}"></c:param>
		<c:param name="password" value="${password}"></c:param>

	</c:url>
	<a href="${cusdelete}"> <input type="button" name="delete"
		value="Delete My Account">
	</a>

</body>
</html>





