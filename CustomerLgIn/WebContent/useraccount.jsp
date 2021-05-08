<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<c:forEach var="cus" items="${cusDEtails}">
		
		${cus.id}
		${cus.nameString}
		${cus.emailString}
		${cus.phoneString}
		${cus.userNameString}
		
		
		</c:forEach>
</body>
</html>