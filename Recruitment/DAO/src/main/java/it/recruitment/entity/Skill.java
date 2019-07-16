package it.recruitment.entity;

public class Skill {
	
	private int idSkill;
	private String descrizione;
	
	public Skill(int idSkill, String descrizione) {
		super();
		this.idSkill = idSkill;
		this.descrizione=descrizione;
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
	
	
}