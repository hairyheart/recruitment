package it.recruitment.dao.entity;

import java.sql.Date;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="colloquio")
public class Colloquio {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idcolloquio")
	private int idcolloquio;
	
	
	@Column(name="data")
	private Date dataColloquio;
	
	
	@Column(name="ora") 
	private LocalTime oraColloquio;
	
	
	@Column(name="stanza")
	private String stanza;
	
	
	@Column(name="esito_globale")
	private String esitoGlobale;
	
	
	@Column(name="note")
	private String note;
	
	@ManyToOne
	@JoinColumn(name="idesigenza")	
	private Esigenza esigenza;
	
	@ManyToOne
	@JoinColumn(name="idcandidato")	
	private Candidato candidato;
	
	
	public Colloquio(int idcolloquio, Date dataColloquio, LocalTime oraColloquio, String stanza, String esitoGlobale,
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


	public String getStanza() {
		return stanza;
	}


	public void setStanza(String stanza) {
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
