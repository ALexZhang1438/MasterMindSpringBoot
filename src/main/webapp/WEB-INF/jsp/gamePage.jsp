<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pagina de juego</title>
</head>
<body>
	<h1>funciona</h1>
	porfavor introduzca separados con comas
	<form action="check" method="get">
		<h3>Introduce los colores creas</h3>
		<input type="text" name="userAnswer" />
		<input type="submit"/>
		<c:out value="has acertado: ${aciertos}" />
	</form>
</body>
</html>