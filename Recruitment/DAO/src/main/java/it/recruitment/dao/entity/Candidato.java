package it.recruitment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidato")
public class Candidato {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idcandidato")
	private int idCandidato;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="cognome")
	private String Cognome;
	
	@Column(name="email")
	private String email;
	
	@Column(name="num_telefono")
	private int numTelefono;
	
	
	public Candidato(int idCandidato, String nome, String cognome, String email, int numTelefono) {
		super();
		this.idCandidato = idCandidato;
		this.nome = nome;
		Cognome = cognome;
		this.email = email;
		this.numTelefono = numTelefono;
	}


	public Candidato() {
		super();
	}


	public int getIdCandidato() {
		return idCandidato;
	}


	public void setIdCandidato(int idCandidato) {
		this.idCandidato = idCandidato;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return Cognome;
	}


	public void setCognome(String cognome) {
		Cognome = cognome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getNumTelefono() {
		return numTelefono;
	}


	public void setNumTelefono(int numTelefono) {
		this.numTelefono = numTelefono;
	}


	@Override
	public String toString() {
		return "Candidato [idCandidato=" + idCandidato + ", nome=" + nome + ", Cognome=" + Cognome + ", email=" + email
				+ ", numTelefono=" + numTelefono + "]";
	}
	
	

}
