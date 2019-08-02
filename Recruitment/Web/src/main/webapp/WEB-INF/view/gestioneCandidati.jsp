<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Candidati</title>
</head>
<body>
<div class="container-fluid">
	<a href="index">Home</a>
	<div style="padding-top: 10px" />
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col" style="font: bold; font-size: larger;">Nome</th>
					<th scope="col" style="font: bold; font-size: larger;">Cognome</th>
					<th scope="col" style="font: bold; font-size: larger;">Email</th>
					<th scope="col" style="font: bold; font-size: larger;">Numero
						telefono</th>
					<th scope="col" style="font: bold; font-size: larger;">Skill</th>	
					<th scope="col" style="font: bold; font-size: larger;">Eliminazione</th>
					<th scope="col" style="font: bold; font-size: larger;">Abilita
						modifica</th>
					<th scope="col" style="font: bold; font-size: larger;">Modifica</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${allCandidati}" var="item">
					<tr>
						<td style="font-size: larger;"><input type="text" id="nome${item.getIdCandidato()}"
							name="nomeCandidato" style="border: none;"
							value="${item.getNome()}" disabled /></td>
						<td style="font-size: larger;"><input id="cognome${item.getIdCandidato()}"
							name="cognomeCandidato" style="border: none;"
							value="${item.getCognome()}" disabled /></td>
						<td style="font-size: larger;"><input id="email${item.getIdCandidato()}"
							name="emailCandidato" type="email" style="border: none;"
							value="${item.getEmail()}" disabled /></td>
						<td style="font-size: larger;"><input id="telefono${item.getIdCandidato()}"
							name="telefonoCandidato" type="number" style="border: none;"
							value="${item.getNumTelefono()}" disabled /></td>

						
						<td style="font-size: larger;">
						
						<select>
						<c:forEach items="${item.getSkills()}" var="skill">
						<option value="1">${skill.getDescrizione()}</option>
						</c:forEach>
                        </select>
                        
						</td>

						<td>
							<form action="deleteCandidato">

								<input type="hidden" name="idCandidato"
									value="${item.getIdCandidato()}" /> <input type="submit"
									value="elimina candidato" />

							</form>

						</td>
						<td>
							<button id="enable" onclick="enable(${item.getIdCandidato()})">Abilita modifica</button>

						</td>
						<td>

							<form action="updateCandidato">
								<input type="hidden" name="idCandidato"
									value="${item.getIdCandidato()}" />
									
									<input type="hidden" name="nomeCandidato" id="nomeHid${item.getIdCandidato()}" value="${item.getNome()}" />
									
									<input type="hidden" name="cognomeCandidato" id="cognomeHid${item.getIdCandidato()}"
									value="${item.getCognome()}" />
									
									<input type="hidden" name="emailCandidato"
									value="${item.getEmail()}" id="emailHid${item.getIdCandidato()}"/>
									
									<input type="hidden" name="telefonoDipendente"
									value="${item.getNumTelefono()}" id="telefonoHid${item.getIdCandidato()}"/>
									
									<input type="submit"
									value="modifica candidato" name="modifica" id="modifica${item.getIdCandidato()}"  onclick="send(${item.getIdCandidato()})"/>

							</form>
						</td>

					</tr>

				</c:forEach>

			</tbody>

		</table>

	</div>
	
	<div style="padding-top: 30px" />


	<form action="addCandidato" modelAttribute="candidato">
		  
		    <input name="nome" placeholder="Nome Candidato" required="true" /> 
		    <input name="cognome" placeholder="Cognome Candidato" required="true" /> 
		    <input type="email" name="email" placeholder="E-mail" required="true" /> 
		    <input type="number" name="numTelefono" placeholder="Numero di telefono" required="true" /> 
		    <input type="submit" value="Salva candidato">
	</form>


<script src="http://code.jquery.com/jquery-1.6.2.min.js"></script>
	<script>
	function enable(id){
		$("#nome"+id).prop("disabled", false);
		$("#cognome"+id).prop("disabled", false);
		$("#email"+id).prop("disabled", false);
		$("#telefono"+id).prop("disabled", false);

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