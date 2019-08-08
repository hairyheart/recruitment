<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="/resources/css/personal.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<a href="index">Home</a>


	<table>
			<thead>
				<tr>
					<th>Candidato: </th>
					<th>Data: </th>
					<th>Ora: </th>
					<th>Stanza: </th>
					<th>Note</th>
					<th>Esito Globale</th>
					<th>Recruiter: </th>
					<th>BU: </th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${colloquio}" var="item">
					<tr>
					<td>
						<input id="candidato${item.getIdcolloquio()}"
							name="candidato" style="border: none;" type="text"
							value="${item.getCandidato().getNome()}  ${item.getCandidato().getCognome()}" disabled />
							</td>
							
						<td>
						<input id="data${item.getIdcolloquio()}"
							name="dataColloquio" style="border: none;" type="date"
							value="${item.getDataColloquio()}" disabled />
							</td>
							
						<td>
						<input id="ora${item.getIdcolloquio()}" type="time" name="oraColloquio" style="border: none;"
							value="${item.getOraColloquio()}" disabled />
							</td>
							
						<td>
						<input id="stanza${item.getIdcolloquio()}"
							name="stanza" type="text" style="border: none;"
							value="${item.getStanza()}" disabled />
							</td>
							
							<td>
						<input id="note${item.getIdcolloquio()}"
							name="note" type="text" style="border: none;"
							value="${item.getNote()}" disabled />
							</td>
						<td>
						<input id="esitoGlobale${item.getIdcolloquio()}"
							name="esitoGlobale" type="text" style="border: none;"
							value="${item.getEsitoGlobale()}" disabled />
							</td>
							
							<td>
						<input id="utente${item.getIdcolloquio()}"
						name="utente" type="text" style="border: none;"
							value="${item.getEsigenza().getUtente().getDipendente().getNome()}   ${item.getEsigenza().getUtente().getDipendente().getCognome()}" disabled />
							</td>
						<td>
						<input id="bu${item.getIdcolloquio()}"
						name="businessUnit" type="text" style="border: none;"
							value="${item.getEsigenza().getBusinessUnit().getDescrizione()}" disabled />
						</td> 
						<td>
<button id="enable" onclick="enable(${item.getIdcolloquio()})">Abilita modifica</button>
					</tr>

				</c:forEach>

			</tbody>

		</table>
		
		<script src="http://code.jquery.com/jquery-1.6.2.min.js"></script>
	<script>
	function enable(id){
		$("#candidato"+id).prop("disabled", false);
		$("#data"+id).prop("disabled", false);
		$("#ora"+id).prop("disabled", false);
		$("#stanza"+id).prop("disabled", false);
		$("#note"+id).prop("disabled", false);
		$("#esitoGlobale"+id).prop("disabled", false);
		$("#utente"+id).prop("disabled", false);

	}
	
	function send(id){		
		$("#nomeHid"+id).val($("#nome"+id).val()); // prende il valore dei campi hidden e gli setta il valore dei campi normali
		$("#cognomeHid"+id).val($("#cognome"+id).val());
		$("#emailHid"+id).val($("#email"+id).val());
		$("#telefonoHid"+id).val($("#telefono"+id).val());
		
		
		$("#modifica"+id).click(); // attivi l evento del bottone che lancerà l'action della form, cioè /updateDip
		
	}
	</script>
</body>
</html>