<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pagina de inicio</title>
</head>
<body>
	<form action="aleatoria" method="get">
		<tr>
			<input type="text" name="valorIntroducido" />
		</tr>
		<tr>
			<input type="submit"/>
		</tr>
		<c:out value="${puntuacion}" />
	</form>
</body>
</html>