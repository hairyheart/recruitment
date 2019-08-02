<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista esigenza</title>

</head>

<body>
<div class="container-fluid">
	<a href="index">Home</a>
	<div style="padding-top: 10px" />
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col" style="font: bold; font-size: larger;width: 5em;">Numero risorse</th>
					<th scope="col" style="font: bold; font-size: larger;">Data inizio</th>
					<th scope="col" style="font: bold; font-size: larger;">Data fine</th>
					<th scope="col" style="font: bold; font-size: larger;">Tipologia</th>
					<th scope="col" style="font: bold; font-size: larger;">Business Unit</th>
					<th scope="col" style="font: bold; font-size: larger;width: 5em;">Tipo Risorsa</th>
				    <th scope="col" style="font: bold; font-size: larger;">Skill candidato</th>
					<th scope="col" style="font: bold; font-size: larger;">Recruiter</th>
					<th scope="col" style="font: bold; font-size: larger;"> </th>
					<th scope="col" style="font: bold; font-size: larger;"> </th>
					
					
										
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${listaEsigenza}" var="item">
					<tr>
						<td style="font-size: larger;">
						<input id="numeroRisorse" name="numeroRisorse"  style="border: none; width: 5em;" value="${item.getNumRisorse()}" disabled/>
						</td>
						<td style="font-size: larger;">
						<input id="dataIn" name="dataIn" type="date" style="border: none;" value="${item.getDataInizio()}" disabled />
						</td>
						<td style="font-size: larger;">
						<input id="dataFin" name="dataFin" type="date" style="border: none;" value="${item.getDataFine()}" disabled/>
						</td>
						<td style="font-size: larger;">
						<input id="tip" name="tip" style="border: none;width: 5em;" value="${item.getTipologia()}" disabled/>
						</td>
						
						<td style="font-size: larger;">
						<input id="bu" name="bu" style="border: none;" value="${item.getBusinessUnit().getDescrizione()}" disabled/>
						</td>
					 	
					 	<td style="font-size: larger;">
						<input id="tr" name="tr" style="border: none; width: 5em;" value="${item.getTipoRisorsa().getDescrizione()}" disabled/>
						</td>
						
						<td style="font-size: larger;">
						<select>
						<c:forEach items="${item.getSkills()}" var="skill">
						<option value="1">${skill.getDescrizione()}</option>
						</c:forEach>
                        </select>
                        
						</td>
						
						<td style="font-size: larger;">
						<input id="utente" name="utente" style="border: none;" value="${item.getUtente().getDipendente().getNome()}  ${item.getUtente().getDipendente().getCognome()}" disabled/>
						</td>
						
						
						<td style="font-size: larger;">
						
						<form action="deleteEsigenza">
						<input type="submit" value="Elimina esigenza"/>
						<input type="hidden" name="idEsigenza" value="${item.getIdEsigenza()}">
						</form>
						</td>
						
						<td style="font-size: larger;">
						
						<form action="gestioneColloquio">
						<input type="submit" value="Fissa colloquio"/>
						<input type="hidden" name="idEsigenza" value="${item.getIdEsigenza()}">
						</form>
						</td>
					
					</tr>

				</c:forEach>

			</tbody>

		</table>

	</div>
	
	
		<div style="padding-top: 15px" />


                         <h3>Creazione Esigenza</h3>
                         <div style="padding-top: 5px" />
                         
	<form:form action="addEsigenza" modelAttribute="esigenza">

         <label>Numero risorse:</label> 
         
		<form:input path="numRisorse" id="numRisorse" name="numRisorse" type="number" required="true" /> 
		 
		
		 
		 <label>Data inizio:</label> 
         
		<form:input path="dataInizio" id="dataInizio" name="dataInizio" type="date" required="true" />
		
	    
		
		<label>Data fine:</label> 
         
		<form:input path="dataFine" id="dataFine" name="dataFine" type="date" required="true" />
	
		
		
		<label>Tipologia:</label> 
        
		
	     <form:select name="tipologia" path="tipologia" id="tipologia">
	         	<c:forEach items="${listaTipo}" var="tipo">
				<form:option value="${tipo}">${tipo}</form:option>
			    </c:forEach>
		</form:select>
	
	
		<br>
		<div style="padding-top: 20px" />
		
		
		<label>Business Unit:</label>
     
		<form:select name="businessUnit" path="businessUnit" id="businessUnit">
		<c:forEach items="${listaBU}" var="bu">
				<form:option value="${bu.getIdBusinessUnit()}">${bu.getDescrizione()}</form:option>
			    </c:forEach>
		</form:select>
		
         
		 <label>Tipo Risorsa:</label> 
        <form:select name ="tipoRisorsa" path="tipoRisorsa" id="tipoRisorsa">
        <c:forEach items="${listaTR}" var="tr">
				<form:option  value="${tr.getIdRisorsa()}">${tr.getDescrizione()}</form:option>
	    </c:forEach>
		
		</form:select>
    
       <br>
              <div style="padding-top: 20px" />
       
		<label>Skill:</label>
			<c:forEach items="${listaSK}" var="sk">	
			<input type="checkbox"  name="skill" value="${sk.getIdSkill()}"> ${sk.getDescrizione()} 
			</c:forEach>
		<br>
               <div style="padding-top: 20px" />
        
		 <label>Recruiter:</label>
       
           <form:select name="utente" path="utente" id="user">
		     	<c:forEach items="${listaUser}" var="u">
				<form:option value="${u.getIdUtente()}">${u.getDipendente().getNome()} ${u.getDipendente().getCognome()}</form:option>
			    </c:forEach>
            </form:select>	 
            
        <br>  
        
       <div style="padding-top: 20px" />
        
         <input type="submit" value="aggiungi esigenza"/>
       
        </form:form>    
 
 <!-- 
 
    <form>
   
    <input name="numRisorse"  id="numRisorseHid"/><br>
    <input type="date" name="dataInizio" id="dataInizioHid"/><br>
	<input type="date" name="dataFine" id="dataFineHid"/><br>
	<input name="tipologia" id="tipologiaHid" /><br>
	
	<input name="businessUnit" id="businessUnitHid"/><br>
    <input name="tipoRisorsa"  id="tipoRisorsaHid"/><br>
    
    <input name="skill" id="skillHid"/><br>
	<input name="utente" id="utenteHid"/><br>
	
    <input type="submit" value="aggiungi esigenza" name="modifica" id="add"  onclick="addEsigenza()"/>

  </form>
  
 <script src="http://code.jquery.com/jquery-1.6.2.min.js"></script>
 
	 <script>
	 
	  function addEsigenza(){	
		  
			$("#numRisorseHid").val($("#numRisorse").val()); // prende il valore dei campi hidden e gli setta il valore dei campi normali
			$("#dataInizioHid").val($("#dataInizio").val());
			$("#dataFineHid").val($("#dataFine").val());
			$("#tipologiaHid").val($("#tipologia").val());
			$("#businessUnitHid").val($("#listBu option:selected").text());
			$("#tipoRisorsaHid").val($("#tipoRisorsa option:selected").text());
			$("#skillHid").val($("#sk option:selected").select2("selected",true));
			$("#utenteHid").val($("#user option:selected").text());
	  }
	  
	</script>
    -->
 </body>
</html>