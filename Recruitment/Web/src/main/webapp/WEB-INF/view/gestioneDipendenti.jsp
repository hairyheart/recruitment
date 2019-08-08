<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista dipendenti</title>
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
					<th scope="col" style="font: bold; font-size: larger;">Eliminazione</th>
					<th scope="col" style="font: bold; font-size: larger;">Abilita
						modifica</th>
					<th scope="col" style="font: bold; font-size: larger;">Modifica</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${allDipendenti}" var="item">
					<tr>
						<td style="font-size: larger;"><input type="text" id="nome${item.getIdDipendente()}"
							name="nomeDipendente" style="border: none;"
							value="${item.getNome()}" disabled /></td>
						<td style="font-size: larger;"><input id="cognome${item.getIdDipendente()}"
							name="cognomeDipendente" style="border: none;"
							value="${item.getCognome()}" disabled /></td>
						<td style="font-size: larger;"><input id="email${item.getIdDipendente()}"
							name="emailDipendente" type="email" style="border: none;"
							value="${item.getEmail()}" disabled /></td>
						<td style="font-size: larger;"><input id="telefono${item.getIdDipendente()}"
							name="telefonoDipendente" type="number" style="border: none;"
							value="${item.getNumTelefono()}" disabled /></td>

						<td>
							<form action="deleteDipendente">

								<input type="hidden" name="idDipendente"
									value="${item.getIdDipendente()}" /> <input type="submit"
									value="elimina dipendete" />

							</form>

						</td>
						<td>
							<button id="enable" onclick="enable(${item.getIdDipendente()})">Abilita modifica</button>

						</td>
						<td>

							<form action="updateDip">
								<input type="hidden" name="idDipendente"
									value="${item.getIdDipendente()}" />
									
									<input type="hidden" name="nomeDipendente" id="nomeHid${item.getIdDipendente()}" />
									
									<input type="hidden" name="cognomeDipendente" id="cognomeHid${item.getIdDipendente()}"
									value="${item.getCognome()}" />
									
									<input type="hidden" name="emailDipendente"
									value="${item.getEmail()}" id="emailHid${item.getIdDipendente()}"/>
									
									<input type="hidden" name="telefonoDipendente"
									value="${item.getNumTelefono()}" id="telefonoHid${item.getIdDipendente()}"/>
									
									<input type="submit"
									value="modifica dipendete" name="modifica" id="modifica${item.getIdDipendente()}"  onclick="send(${item.getIdDipendente()})"/>

							</form>
						</td>

					</tr>

				</c:forEach>

			</tbody>

		</table>

	</div>


	<div style="padding-top: 30px" />


	<form action="addDipendente" modelAttribute="dipendente">
		  
		    <input name="nome" placeholder="Nome Dipendente" required="true" /> 
		    <input name="cognome" placeholder="Cognome Dipendente" required="true" /> 
		    <input type="email" name="email" placeholder="E-mail" required="true" /> 
		    <input type="number" name="numTelefono" placeholder="Numero di telefono" required="true" /> 
		    <input type="submit" value="Salva dipendente">
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