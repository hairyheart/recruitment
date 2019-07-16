package it.recruitment.entity;

public class TipoRisorsa {

	private int idRisorsa;
	private String descrizione;
	
	public TipoRisorsa(int idRisorsa, String descrizione) {
		super();
		this.idRisorsa = idRisorsa;
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
