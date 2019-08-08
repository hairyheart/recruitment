package com.recruitment.dao.entity;
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
@Table(name="skill")
public class Skill {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idskill")
	private int idSkill;
	
	@Column(name="descrizione")
	private String descrizione;
	
	
	@ManyToMany(mappedBy = "skills",fetch = FetchType.EAGER)
	private Set<Esigenza> esigenze=new  HashSet<>();
	
	@ManyToMany(mappedBy = "skills",fetch = FetchType.EAGER)
	private Set<Candidato> candidato=new  HashSet<>();
	
	
	public Skill(int idSkill, String descrizione) {
		super();
		this.idSkill = idSkill;
		this.descrizione=descrizione;
	}
	
	public Skill(int idSkill) {
		this.idSkill = idSkill;
	}

	public Skill() {
		super();
	}

	public int getIdSkill() {
		return idSkill;
	}

	public void setIdSkill(int idSkill) {
		this.idSkill = idSkill;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		return "Skill [idSkill=" + idSkill + ", descrizione=" + descrizione + "]";
	}


	@Override
	public boolean equals(Object obj) {
		Skill other = (Skill) obj;
		if (idSkill != other.idSkill)
			return false;
		return true;
	}
 
	
	
}