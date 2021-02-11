<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pagina Registro de Puntuacion</title>
</head>
<body>
	<form action="win" method="get">
		<table>
			<tr>
				<h3>Winner List</h3>
			</tr>
			<tr>
				<c:forEach var="winner" items="${Winner}" >
					<c:out value="${Winner}" />
					<br>
				</c:forEach>
			</tr>
		</table>
	</form>
	<form action="/" method="get">
		<input type="submit" value="homepage">
	</form>
</body>
