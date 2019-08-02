package it.recruitment.dao.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="profilo")
public class Profilo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idprofilo")
	private int idprofilo;
	
	@Column(name="privilegio")
	private String privilegio;
	
	@Column(name="descrizione")
	private String descrizione;
	
	@ManyToMany(mappedBy = "profilo",fetch = FetchType.EAGER)
	private Set<Utente> utente=new  HashSet<>();

	
	public Profilo(int idprofilo, String privilegio, String descrizione, Set<Utente> utente) {
		super();
		this.idprofilo = idprofilo;
		this.privilegio = privilegio;
		this.descrizione = descrizione;
		this.utente = utente;
	}
	
	
	public Profilo() {
		super();
	}


	public Set<Utente> getUtente() {
		return utente;
	}

	public void setUtente(Set<Utente> utente) {
		this.utente = utente;
	}

	public int getIdprofilo() {
		return idprofilo;
	}

	public void setIdprofilo(int idprofilo) {
		this.idprofilo = idprofilo;
	}

	public String getPrivilegio() {
		return privilegio;
	}

	public void setPrivilegio(String privilegio) {
		this.privilegio = privilegio;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	@Override
	public String toString() {
		return "Profilo [idprofilo=" + idprofilo + ", privilegio=" + privilegio + ", descrizione=" + descrizione
				+ ", utente=" + utente + "]";
	}

	
	
}
