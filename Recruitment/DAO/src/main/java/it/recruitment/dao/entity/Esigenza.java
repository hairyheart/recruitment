package it.recruitment.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="esigenza")
public class Esigenza {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idesigenza")
	private int idEsigenza;
	
	@Column(name="num_risorse")
	private int numRisorse;
	
	@Column(name="data_inizio")
	private Date dataInizio;
	
	@Column(name="data_fine")
	private Date dataFine;
	
	@Column(name="tipologia")
	private String tipologia;
	
	@ManyToOne
	@JoinColumn(name="idtiporisorse")	
	private TipoRisorsa tipoRisorsa;
	
	@ManyToOne
	@JoinColumn(name="idbu")	
	private BusinessUnit businessUnit;
	
	@ManyToOne
	@JoinColumn(name="iddipendente")
	private Dipendente dipendente;
	
	@ManyToMany
	@JoinTable(name="relazione_skill_esigenza", joinColumns = {@JoinColumn(name="idesigenze")}, 
	inverseJoinColumns = {@JoinColumn(name="idskill")})
	private Set<Skill> skills=new  HashSet<>();
	
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
