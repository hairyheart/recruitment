package it.recruitment.entity;

import java.sql.Date;

public class Valutazione {
	
	private int idValutazione;
	private String esito;
    private String valutazione;
    private Colloquio colloquio;
    private Dipendente dipendente;
    
    
	public Valutazione(int idValutazione, String esito, String valutazione, Colloquio colloquio, Dipendente dipendente) {
		super();
		this.idValutazione = idValutazione;
		this.esito = esito;
		this.valutazione = valutazione;
		this.colloquio=colloquio;
		this.dipendente=dipendente;
	}

	public Valutazione() {
		super();
	}

	
	public Colloquio getColloquio() {
		return colloquio;
	}

	public void setColloquio(Colloquio colloquio) {
		this.colloquio = colloquio;
	}

	public Dipendente getDipendente() {
		return dipendente;
	}

	public void setDipendente(Dipendente dipendente) {
		this.dipendente = dipendente;
	}

	public int getIdValutazione() {
		return idValutazione;
	}

	public void setIdValutazione(int idValutazione) {
		this.idValutazione = idValutazione;
	}

	public String getEsito() {
		return esito;
	}

	public void setEsito(String esito) {
		this.esito = esito;
	}

	public String getValutazione() {
		return valutazione;
	}

	public void setValutazione(String valutazione) {
		this.valutazione = valutazione;
	}

	@Override
	public String toString() {
		return "Valutazione [idValutazione=" + idValutazione + ", esito=" + esito + ", valutazione=" + valutazione
				+ ", colloquio=" + colloquio + ", dipendente=" + dipendente + "]";
	}


}
