package it.recruitment.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_risorse")
public class TipoRisorsa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idtiporisorse")
	private int idRisorsa;
	
	@Column(name="descrizione")
	private String descrizione;
	
	public TipoRisorsa(int idRisorsa, String descrizione) {
		super();
		this.idRisorsa = idRisorsa;
		this.descrizione = descrizione;
	}
	public TipoRisorsa(int idRisorsa) {
		this.idRisorsa = idRisorsa;
	}
	
	public TipoRisorsa(String descrizione) {
		this.descrizione = descrizione;
	}

	public TipoRisorsa() {
		super();
	}

	public int getIdRisorsa() {
		return idRisorsa;
	}

	public void setIdRisorsa(int idRisorsa) {
		this.idRisorsa = idRisorsa;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		return "TipoRisorsa [idRisorsa=" + idRisorsa + ", descrizione=" + descrizione + "]";
	}

	
	
}
