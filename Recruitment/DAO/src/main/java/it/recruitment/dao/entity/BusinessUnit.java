package it.recruitment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bu")
public class BusinessUnit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idbu")
	private int idBusinessUnit;
	
	@Column(name="descrizione")
	private String descrizione;
	
	public BusinessUnit(int idBusinessUnit, String descrizione) {
		super();
		this.idBusinessUnit = idBusinessUnit;
		this.descrizione = descrizione;
	}

	public BusinessUnit() {
		super();
	}

	public int getIdBusinessUnit() {
		return idBusinessUnit;
	}

	public void setIdBusinessUnit(int idBusinessUnit) {
		this.idBusinessUnit = idBusinessUnit;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		return "BusinessUnit [idBusinessUnit=" + idBusinessUnit + ", descrizione=" + descrizione + "]";
	}
	
	

}
