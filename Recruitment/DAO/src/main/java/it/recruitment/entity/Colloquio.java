package it.recruitment.entity;

import java.sql.Date;
import java.time.LocalTime;

public class Colloquio {

	private int idcolloquio;
	private Date dataColloquio;
	private LocalTime oraColloquio;
	private int stanza;
	private String esitoGlobale;
	private String note;
	private Esigenza esigenza;
	private Candidato candidato;
	
	
	public Colloquio(int idcolloquio, Date dataColloquio, LocalTime oraColloquio, int stanza, String esitoGlobale,
			String note, Esigenza esigenza,Candidato candidato ) {
		super();
		this.idcolloquio = idcolloquio;
		this.dataColloquio = dataColloquio;
		this.oraColloquio = oraColloquio;
		this.stanza = stanza;
		this.esitoGlobale = esitoGlobale;
		this.note = note;
		this.esigenza=esigenza;
		this.candidato=candidato;
	}


	public Colloquio() {
		super();
	}


	public Candidato getCandidato() {
		return candidato;
	}


	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}


	public int getIdcolloquio() {
		return idcolloquio;
	}


	public void setIdcolloquio(int idcolloquio) {
		this.idcolloquio = idcolloquio;
	}


	public Date getDataColloquio() {
		return dataColloquio;
	}


	public void setDataColloquio(Date dataColloquio) {
		this.dataColloquio = dataColloquio;
	}


	public LocalTime getOraColloquio() {
		return oraColloquio;
	}


	public void setOraColloquio(LocalTime oraColloquio) {
		this.oraColloquio = oraColloquio;
	}


	public int getStanza() {
		return stanza;
	}


	public void setStanza(int stanza) {
		this.stanza = stanza;
	}


	public String getEsitoGlobale() {
		return esitoGlobale;
	}


	public void setEsitoGlobale(String esitoGlobale) {
		this.esitoGlobale = esitoGlobale;
	}


	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}

	

	public Esigenza getEsigenza() {
		return esigenza;
	}


	public void setEsigenza(Esigenza esigenza) {
		this.esigenza = esigenza;
	}


	@Override
	public String toString() {
		return "Colloquio [idcolloquio=" + idcolloquio + ", dataColloquio=" + dataColloquio + ", oraColloquio="
				+ oraColloquio + ", stanza=" + stanza + ", esitoGlobale=" + esitoGlobale + ", note=" + note
				+ ", esigenza=" + esigenza + ", candidato=" + candidato + "]";
	}


	
	
	
}
