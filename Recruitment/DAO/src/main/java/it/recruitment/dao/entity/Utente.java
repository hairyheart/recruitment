package it.recruitment.dao.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="utente")
public class Utente {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idutente")
	private int idUtente;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@OneToOne
	@JoinColumn(name="iddipendente")
	private Dipendente dipendente;
	
	@ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable( name="relazione_profilo_utente", joinColumns = {@JoinColumn(name="idutente")}, 
	inverseJoinColumns = {@JoinColumn(name="idprofilo")})
	private Set<Profilo> profilo = new  HashSet<>();

	public Utente(int idUtente, String username, String password, Dipendente dipendente, Set<Profilo> profilo) {
		super();
		this.idUtente = idUtente;
		this.username = username;
		this.password = password;
		this.dipendente = dipendente;
		this.profilo = profilo;
	}

	public Utente(String username, String password, Dipendente dipendente) {
		super();
		this.username = username;
		this.password = password;
		this.dipendente = dipendente;
	}
	
	public Utente(int idUtente) {
		this.idUtente = idUtente;
	}


	public Utente() {
		super();
	}

	public int getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Dipendente getDipendente() {
		return dipendente;
	}

	public void setDipendente(Dipendente dipendente) {
		this.dipendente = dipendente;
	}

	public Set<Profilo> getProfilo() {
		return profilo;
	}

	public void setProfilo(Set<Profilo> profilo) {
		this.profilo = profilo;
	}

	@Override
	public String toString() {
		return "Utente [idUtente=" + idUtente + ", username=" + username + ", password=" + password +"]";
	}

	
}

