package it.gestionale.web.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "statistiche")
public class Statistiche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_rilevamento", nullable = false)
    private LocalDate dataRilevamento;

    @Column(name = "num_clienti", nullable = false)
    private int numClienti;

    @Column(name = "num_camere_totali", nullable = false)
    private int numCamereTotali;

    @Column(name = "num_camere_disponibili", nullable = false)
    private int numCamereDisponibili;

    @Column(name = "num_prenotazioni_totali", nullable = false)
    private int numPrenotazioniTotali;

    @Column(name = "num_prenotazioni_concluse", nullable = false)
    private int numPrenotazioniConcluse;

    @Column(name = "num_prenotazioni_annullate", nullable = false)
    private int numPrenotazioniAnnullate;

    @Column(name = "num_entrate", nullable = false)
    private int numEntrate;

    @Column(name = "num_uscite", nullable = false)
    private int numUscite;

    @Column(name = "importo_entrate", nullable = false)
    private BigDecimal importoEntrate;

    @Column(name = "importo_uscite", nullable = false)
    private BigDecimal importoUscite;

    @Column(name = "tassa_soggiorno_totale", nullable = false)
    private BigDecimal tassaSoggiornoTotale;

    // Constructors, getters, and setters omitted for brevity

    // Foreign keys

    @ManyToOne
    @JoinColumn(name = "num_clienti", insertable = false, updatable = false)
    private Cliente clienti;

    @ManyToOne
    @JoinColumn(name = "num_camere_totali", insertable = false, updatable = false)
    private Camera camereTotali;

    @ManyToOne
    @JoinColumn(name = "num_camere_disponibili", insertable = false, updatable = false)
    private Camera camereDisponibili;

    @ManyToOne
    @JoinColumn(name = "num_prenotazioni_totali", insertable = false, updatable = false)
    private Prenotazione prenotazioniTotali;

    @ManyToOne
    @JoinColumn(name = "num_prenotazioni_concluse", insertable = false, updatable = false)
    private Prenotazione prenotazioniConcluse;

    @ManyToOne
    @JoinColumn(name = "num_prenotazioni_annullate", insertable = false, updatable = false)
    private Prenotazione prenotazioniAnnullate;

    @ManyToOne
    @JoinColumn(name = "num_entrate", insertable = false, updatable = false)
    private Entrate entrate;

    @ManyToOne
    @JoinColumn(name = "num_uscite", insertable = false, updatable = false)
    private Uscite uscite;

	public Statistiche(Long id, LocalDate dataRilevamento, int numClienti, int numCamereTotali, int numCamereDisponibili,
			int numPrenotazioniTotali, int numPrenotazioniConcluse, int numPrenotazioniAnnullate, int numEntrate,
			int numUscite, BigDecimal importoEntrate, BigDecimal importoUscite, BigDecimal tassaSoggiornoTotale,
			Cliente clienti, Camera camereTotali, Camera camereDisponibili, Prenotazione prenotazioniTotali,
			Prenotazione prenotazioniConcluse, Prenotazione prenotazioniAnnullate, Entrate entrate, Uscite uscite) {
		super();
		this.id = id;
		this.dataRilevamento = dataRilevamento;
		this.numClienti = numClienti;
		this.numCamereTotali = numCamereTotali;
		this.numCamereDisponibili = numCamereDisponibili;
		this.numPrenotazioniTotali = numPrenotazioniTotali;
		this.numPrenotazioniConcluse = numPrenotazioniConcluse;
		this.numPrenotazioniAnnullate = numPrenotazioniAnnullate;
		this.numEntrate = numEntrate;
		this.numUscite = numUscite;
		this.importoEntrate = importoEntrate;
		this.importoUscite = importoUscite;
		this.tassaSoggiornoTotale = tassaSoggiornoTotale;
		this.clienti = clienti;
		this.camereTotali = camereTotali;
		this.camereDisponibili = camereDisponibili;
		this.prenotazioniTotali = prenotazioniTotali;
		this.prenotazioniConcluse = prenotazioniConcluse;
		this.prenotazioniAnnullate = prenotazioniAnnullate;
		this.entrate = entrate;
		this.uscite = uscite;
	}

	public Statistiche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataRilevamento() {
		return dataRilevamento;
	}

	public void setDataRilevamento(LocalDate dataRilevamento) {
		this.dataRilevamento = dataRilevamento;
	}

	public int getNumClienti() {
		return numClienti;
	}

	public void setNumClienti(int numClienti) {
		this.numClienti = numClienti;
	}

	public int getNumCamereTotali() {
		return numCamereTotali;
	}

	public void setNumCamereTotali(int numCamereTotali) {
		this.numCamereTotali = numCamereTotali;
	}

	public int getNumCamereDisponibili() {
		return numCamereDisponibili;
	}

	public void setNumCamereDisponibili(int numCamereDisponibili) {
		this.numCamereDisponibili = numCamereDisponibili;
	}

	public int getNumPrenotazioniTotali() {
		return numPrenotazioniTotali;
	}

	public void setNumPrenotazioniTotali(int numPrenotazioniTotali) {
		this.numPrenotazioniTotali = numPrenotazioniTotali;
	}

	public int getNumPrenotazioniConcluse() {
		return numPrenotazioniConcluse;
	}

	public void setNumPrenotazioniConcluse(int numPrenotazioniConcluse) {
		this.numPrenotazioniConcluse = numPrenotazioniConcluse;
	}

	public int getNumPrenotazioniAnnullate() {
		return numPrenotazioniAnnullate;
	}

	public void setNumPrenotazioniAnnullate(int numPrenotazioniAnnullate) {
		this.numPrenotazioniAnnullate = numPrenotazioniAnnullate;
	}

	public int getNumEntrate() {
		return numEntrate;
	}

	public void setNumEntrate(int numEntrate) {
		this.numEntrate = numEntrate;
	}

	public int getNumUscite() {
		return numUscite;
	}

	public void setNumUscite(int numUscite) {
		this.numUscite = numUscite;
	}

	public BigDecimal getImportoEntrate() {
		return importoEntrate;
	}

	public void setImportoEntrate(BigDecimal importoEntrate) {
		this.importoEntrate = importoEntrate;
	}

	public BigDecimal getImportoUscite() {
		return importoUscite;
	}

	public void setImportoUscite(BigDecimal importoUscite) {
		this.importoUscite = importoUscite;
	}

	public BigDecimal getTassaSoggiornoTotale() {
		return tassaSoggiornoTotale;
	}

	public void setTassaSoggiornoTotale(BigDecimal tassaSoggiornoTotale) {
		this.tassaSoggiornoTotale = tassaSoggiornoTotale;
	}

	public Cliente getClienti() {
		return clienti;
	}

	public void setClienti(Cliente clienti) {
		this.clienti = clienti;
	}

	public Camera getCamereTotali() {
		return camereTotali;
	}

	public void setCamereTotali(Camera camereTotali) {
		this.camereTotali = camereTotali;
	}

	public Camera getCamereDisponibili() {
		return camereDisponibili;
	}

	public void setCamereDisponibili(Camera camereDisponibili) {
		this.camereDisponibili = camereDisponibili;
	}

	public Prenotazione getPrenotazioniTotali() {
		return prenotazioniTotali;
	}

	public void setPrenotazioniTotali(Prenotazione prenotazioniTotali) {
		this.prenotazioniTotali = prenotazioniTotali;
	}

	public Prenotazione getPrenotazioniConcluse() {
		return prenotazioniConcluse;
	}

	public void setPrenotazioniConcluse(Prenotazione prenotazioniConcluse) {
		this.prenotazioniConcluse = prenotazioniConcluse;
	}

	public Prenotazione getPrenotazioniAnnullate() {
		return prenotazioniAnnullate;
	}

	public void setPrenotazioniAnnullate(Prenotazione prenotazioniAnnullate) {
		this.prenotazioniAnnullate = prenotazioniAnnullate;
	}

	public Entrate getEntrate() {
		return entrate;
	}

	public void setEntrate(Entrate entrate) {
		this.entrate = entrate;
	}

	public Uscite getUscite() {
		return uscite;
	}

	public void setUscite(Uscite uscite) {
		this.uscite = uscite;
	}

	@Override
	public String toString() {
		return "Statistiche [id=" + id + ", dataRilevamento=" + dataRilevamento + ", numClienti=" + numClienti
				+ ", numCamereTotali=" + numCamereTotali + ", numCamereDisponibili=" + numCamereDisponibili
				+ ", numPrenotazioniTotali=" + numPrenotazioniTotali + ", numPrenotazioniConcluse="
				+ numPrenotazioniConcluse + ", numPrenotazioniAnnullate=" + numPrenotazioniAnnullate + ", numEntrate="
				+ numEntrate + ", numUscite=" + numUscite + ", importoEntrate=" + importoEntrate + ", importoUscite="
				+ importoUscite + ", tassaSoggiornoTotale=" + tassaSoggiornoTotale + ", clienti=" + clienti
				+ ", camereTotali=" + camereTotali + ", camereDisponibili=" + camereDisponibili
				+ ", prenotazioniTotali=" + prenotazioniTotali + ", prenotazioniConcluse=" + prenotazioniConcluse
				+ ", prenotazioniAnnullate=" + prenotazioniAnnullate + ", entrate=" + entrate + ", uscite=" + uscite
				+ "]";
	}
    
}
