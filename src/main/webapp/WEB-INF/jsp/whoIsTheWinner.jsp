<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pagina Registro de Puntuacion</title>
</head>
<body>
	<form:form modelAttribute="theWinnerIS" action="win" method="get">
		<h2>nombre</h2>
		<form:input id="name" path="nombre" />
		<form:input type="submit"/>
	</form:form>
</body>
</html>