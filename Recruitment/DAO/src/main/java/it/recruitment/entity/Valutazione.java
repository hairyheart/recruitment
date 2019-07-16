package it.recruitment.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="valutazione")
public class Valutazione {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idvalutazione")
	private int idValutazione;
	
	@Column(name="esito")
	private String esito;
	
	@Column(name="txt_valutazione")
    private String valutazione;
	
	@ManyToOne
	@JoinColumn(name="idcolloquio")
    private Colloquio colloquio;
	
	@ManyToOne
	@JoinColumn(name="iddipendente")
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
