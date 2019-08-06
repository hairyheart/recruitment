package it.recruitment.dao.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	private String cognome;
	
	@Column(name="email")
	private String email;
	
	@Column(name="num_telefono")
	private int numTelefono;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="relazione_skill_candidato", joinColumns = {@JoinColumn(name="idcandidato"), }, 
	inverseJoinColumns = {@JoinColumn(name="idskill")})
	private Set<Skill> skills=new  HashSet<>();
	
	
	public Candidato(int idCandidato, String nome, String cognome, String email, int numTelefono, Skill skill) {
		super();
		this.idCandidato = idCandidato;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.numTelefono = numTelefono;
		this.skills.add(skill);
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
		return cognome;
	}


	public void setCognome(String cognome) {
		cognome = cognome;
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


	public Set<Skill> getSkills() {
		return skills;
	}


	public void setSkills(Set<Skill> skills) {
		this.skills = skills;
	}


	@Override
	public String toString() {
		return "Candidato [idCandidato=" + idCandidato + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email
				+ ", numTelefono=" + numTelefono + ", skills=" + skills + "]";
	}





}
