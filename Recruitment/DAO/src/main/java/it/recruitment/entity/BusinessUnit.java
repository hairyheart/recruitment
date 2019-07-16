package it.recruitment.entity;

public class BusinessUnit {
	
	private int idBusinessUnit;
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
