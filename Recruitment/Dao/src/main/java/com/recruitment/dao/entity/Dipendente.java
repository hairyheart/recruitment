package com.recruitment.dao.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="dipendente")
public class Dipendente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="iddipendente")
	private int idDipendente;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="cognome")
	private String cognome;
	
	@Column(name="email")
	private String email;
	
	@Column(name="num_telefono")
	private int numTelefono;
	
	@OneToOne(mappedBy = "dipendente",cascade = CascadeType.ALL, optional = false)
	private Utente utente;
	
	public Dipendente(int idDipendente, String nome, String cognome, String email, int numTelefono, Utente utente) {
		super();
		this.idDipendente = idDipendente;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.numTelefono = numTelefono;
		this.utente=utente;
	}
	
	public Dipendente(String nome, String cognome, String email, int numTelefono) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.numTelefono = numTelefono;
	}
	
	

	public Dipendente() {
		super();
	}
	
	
	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public int getIdDipendente() {
		return idDipendente;
	}

	public void setIdDipendente(int idDipendente) {
		this.idDipendente = idDipendente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
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

	/*
	@Override
	public String toString() {
		return "Dipendente [idDipendente=" + idDipendente + ", nome=" + nome + ", cognome=" + cognome + ", email="
				+ email + ", numTelefono=" + numTelefono + ", utente=" + utente + "]";
	}
*/
	
	

}
