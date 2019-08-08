<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body>

<form:form action="addUtente" modelAttribute="addUtente">

<form:input path="username"/>

<form:input path="password"/>

<form:input path="iddipendente"/>

<input type="submit" value="Salva credenziali">

</form:form>

</body>
</html>