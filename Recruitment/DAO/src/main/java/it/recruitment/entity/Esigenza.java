package it.recruitment.entity;

import java.sql.Date;

public class Esigenza {
	
	private int idEsigenza;
	private int numRisorse;
	private Date dataInizio;
	private Date dataFine;
	private String tipologia;
	private TipoRisorsa tipoRisorsa;
	private BusinessUnit businessUnit;
	private Dipendente dipendente;
	
	
	
	public Esigenza(int idEsigenza, int numRisorse, Date dataInizio, Date dataFine, String tipologia, 
			TipoRisorsa tipoRisorsa, BusinessUnit businessUnit, Dipendente dipendente) {
		super();
		this.idEsigenza = idEsigenza;
		this.numRisorse = numRisorse;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.tipologia = tipologia;
		this.businessUnit=businessUnit;
		this.dipendente=dipendente;
		this.tipoRisorsa=tipoRisorsa;
		
	}


	public Esigenza() {
		super();
	}


	
	public TipoRisorsa getTipoRisorsa() {
		return tipoRisorsa;
	}


	public void setTipoRisorsa(TipoRisorsa tipoRisorsa) {
		this.tipoRisorsa = tipoRisorsa;
	}


	public BusinessUnit getBusinessUnit() {
		return businessUnit;
	}


	public void setBusinessUnit(BusinessUnit businessUnit) {
		this.businessUnit = businessUnit;
	}


	public Dipendente getDipendente() {
		return dipendente;
	}


	public void setDipendente(Dipendente dipendente) {
		this.dipendente = dipendente;
	}


	public int getIdEsigenza() {
		return idEsigenza;
	}


	public void setIdEsigenza(int idEsigenza) {
		this.idEsigenza = idEsigenza;
	}


	public int getNumRisorse() {
		return numRisorse;
	}


	public void setNumRisorse(int numRisorse) {
		this.numRisorse = numRisorse;
	}


	public Date getDataInizio() {
		return dataInizio;
	}


	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}


	public Date getDataFine() {
		return dataFine;
	}


	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}


	public String getTipologia() {
		return tipologia;
	}


	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}


	@Override
	public String toString() {
		return "Esigenza [idEsigenza=" + idEsigenza + ", numRisorse=" + numRisorse + ", dataInizio=" + dataInizio
				+ ", dataFine=" + dataFine + ", tipologia=" + tipologia + ", tipoRisorsa=" + tipoRisorsa
				+ ", businessUnit=" + businessUnit + ", dipendente=" + dipendente + "]";
	}


	
	
	
	

}
