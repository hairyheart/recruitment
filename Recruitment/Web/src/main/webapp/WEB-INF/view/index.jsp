<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet"
	href="<c:url value="/resources/css/bootstrap.min.css" />" />

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>

<script src="<c:url value="/resources/js/bootstrap.bundle.min.js" />"></script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a>User authenticated : ${username}  </a>
	<br>
	<c:forEach items="${profilo}" var="item">
	Profiles : ${item}
	<br>
	</c:forEach>
	
	<div style="padding-top: 30px" />

	<a href="gestioneDipendenti">Gestione Dipendenti</a>
	
	
	<div style="padding-top: 10px" />

	<a href="listaEsigenza">Gestione Esigenze</a>
	<div style="padding-top: 10px" />

	<a href="gestioneCandidati">Gestione Candidati</a>
	<br>
	<a href="listaColloqui">Lista colloqui</a>
</body>
</html>