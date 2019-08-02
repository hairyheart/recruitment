<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="addColloquio" modelAttribute="colloquio">

         <label>Data colloquio:</label> 
         
		<form:input path="dataColloquio" id="dataColloquio" name="dataColloquio" type="date" required="true" /> 
		 
		
		 
		 <label>Ora colloquio:</label> 
         
		<form:input path="oraColloquio" id="oraColloquio" name="oraColloquio" type="time" required="true" />
		
	    
		
		<label>Stanza :</label> 
         
		<form:input path="stanza" id="stanza" name="stanza" type="text" required="true" />
	
	    <br>
	    <div style="padding-top: 20px" />
	    
		<label>Note :</label> 
	    <br>
       
           <form:input path="note" id="note" name="note" type="text" hight="10em" required="true" />
		<br>
		
		<div style="padding-top: 20px" />
		
		
		<label>Candidati :</label>
     
		<form:select name="candidato" path="candidato" id="candidato">
		<c:forEach items="${candidati}" var="c">
				<form:option value="${c.getIdCandidato()}">${c.getNome()} ${c.getCognome()}</form:option>
			    </c:forEach>
		</form:select>
		
       <div style="padding-top: 20px" />
        
         <input type="hidden" value="${idEsigenza}" name="esigenza">
         <input type="submit" value="aggiungi colloquio"/>
       
        </form:form> 

</body>
</html>