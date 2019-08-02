package it.recruitment.dao.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
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

import org.springframework.beans.factory.annotation.Autowired;

import it.recruitment.dao.BuDaoInterface;

import javax.persistence.FetchType;


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
	@JoinColumn(name="idutente")
	private Utente utente;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="relazione_skill_esigenza", joinColumns = {@JoinColumn(name="idesigenze"), }, 
	inverseJoinColumns = {@JoinColumn(name="idskill")})
	private Set<Skill> skills=new  HashSet<>();
	
	public Esigenza(int idEsigenza, int numRisorse, Date dataInizio, Date dataFine, String tipologia, 
			TipoRisorsa tipoRisorsa, BusinessUnit businessUnit, Utente utente, Set<Skill> skills) {
		super();
		this.idEsigenza = idEsigenza;
		this.numRisorse = numRisorse;
		this.dataInizio = dataInizio; 
		this.dataFine = dataFine;
		this.tipologia = tipologia;
		
		this.businessUnit=businessUnit;
		this.utente=utente;
		this.tipoRisorsa=tipoRisorsa;
		this.skills = skills;
			
	}
	
	public Esigenza(int numRisorse, Date dataInizio, Date dataFine, String tipologia, 
			TipoRisorsa tipoRisorsa, BusinessUnit businessUnit, String nomeRecruiter, Set<Skill> skill) {
		super();
		this.numRisorse = numRisorse;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.tipologia = tipologia;
		
		this.businessUnit= businessUnit;
		this.utente=new Utente();
		this.tipoRisorsa=tipoRisorsa;
		this.skills=skill;
			
	}
	
	public Esigenza(int numRisorse, Date dataInizio, Date dataFine, String tipologia) {
		super();
		this.numRisorse = numRisorse;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.tipologia = tipologia;
	}

	public Esigenza() {
		super();
	}

	
	public Set<Skill> getSkills() {
		return skills;
	}
	
	public void setSkills(Set<Skill> skill) {
		this.skills=skill;
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

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
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
				+ ", businessUnit=" + businessUnit + ", utente=" + utente + "]";
	}


}
