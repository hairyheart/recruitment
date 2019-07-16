package it.recruitment.entity;

public class Dipendente {
	
	private int idDipendente;
	private String nome;
	private String cognome;
	private String email;
	private int numTelefono;
	
	public Dipendente(int idDipendente, String nome, String cognome, String email, int numTelefono) {
		super();
		this.idDipendente = idDipendente;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.numTelefono = numTelefono;
	}

	public Dipendente() {
		super();
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

	@Override
	public String toString() {
		return "Dipendente [idDipendente=" + idDipendente + ", nome=" + nome + ", cognome=" + cognome + ", email="
				+ email + ", numTelefono=" + numTelefono + "]";
	}
	
	
	

}
