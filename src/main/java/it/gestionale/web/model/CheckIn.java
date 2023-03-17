package it.gestionale.web.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "check_in")
public class CheckIn {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "id_prenotazione", nullable = false)
    private int idPrenotazione;
    
    @Column(name = "id_cliente", nullable = false)
    private int idCliente;
    
    @Column(name = "data_ingresso", nullable = false)
    private Date dataIngresso;
    
    @Column(name = "ora_ingresso", nullable = false)
    private String oraIngresso;
    
    @Column(name = "data_uscita", nullable = false)
    private Date dataUscita;
    
    @Column(name = "ora_uscita", nullable = false)
    private String oraUscita;
    
    @Column(name = "numero_camera", nullable = false)
    private int numeroCamera;
    
    @Column(name = "costo_totale", nullable = false)
    private BigDecimal costoTotale;
    
    @Column(name = "stato_prenotazione", nullable = false)
    private String statoPrenotazione;
    
    @Column(name = "numero_persone", nullable = false)
    private int numeroPersone;
    
    @Column(name = "metodo_pagamento")
    private String metodoPagamento;
    
    @Column(name = "note")
    private String note;
    
    @Column(name = "data_pagamento")
    private Date dataPagamento;
    
    @Column(name = "tassa_soggiorno")
    private BigDecimal tassaSoggiorno;

    
	public CheckIn(Integer id, int idPrenotazione, int idCliente, Date dataIngresso, String oraIngresso, Date dataUscita,
			String oraUscita, int numeroCamera, BigDecimal costoTotale, String statoPrenotazione, int numeroPersone,
			String metodoPagamento, String note, Date dataPagamento, BigDecimal tassaSoggiorno) {
		super();
		this.id = id;
		this.idPrenotazione = idPrenotazione;
		this.idCliente = idCliente;
		this.dataIngresso = dataIngresso;
		this.oraIngresso = oraIngresso;
		this.dataUscita = dataUscita;
		this.oraUscita = oraUscita;
		this.numeroCamera = numeroCamera;
		this.costoTotale = costoTotale;
		this.statoPrenotazione = statoPrenotazione;
		this.numeroPersone = numeroPersone;
		this.metodoPagamento = metodoPagamento;
		this.note = note;
		this.dataPagamento = dataPagamento;
		this.tassaSoggiorno = tassaSoggiorno;
	}

	public CheckIn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public  Integer  getId() {
		return id;
	}

	public void setId( Integer id) {
		this.id = id;
	}

	public int getIdPrenotazione() {
		return idPrenotazione;
	}

	public void setIdPrenotazione(int idPrenotazione) {
		this.idPrenotazione = idPrenotazione;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Date getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(Date dataIngresso) {
		this.dataIngresso = dataIngresso;
	}

	public String getOraIngresso() {
		return oraIngresso;
	}

	public void setOraIngresso(String oraIngresso) {
		this.oraIngresso = oraIngresso;
	}

	public Date getDataUscita() {
		return dataUscita;
	}

	public void setDataUscita(Date dataUscita) {
		this.dataUscita = dataUscita;
	}

	public String  getOraUscita() {
		return oraUscita;
	}

	public void setOraUscita(String oraUscita) {
		this.oraUscita = oraUscita;
	}

	public int getNumeroCamera() {
		return numeroCamera;
	}

	public void setNumeroCamera(int numeroCamera) {
		this.numeroCamera = numeroCamera;
	}

	public BigDecimal getCostoTotale() {
		return costoTotale;
	}

	public void setCostoTotale(BigDecimal costoTotale) {
		this.costoTotale = costoTotale;
	}

	public String getStatoPrenotazione() {
		return statoPrenotazione;
	}

	public void setStatoPrenotazione(String statoPrenotazione) {
		this.statoPrenotazione = statoPrenotazione;
	}

	public int getNumeroPersone() {
		return numeroPersone;
	}

	public void setNumeroPersone(int numeroPersone) {
		this.numeroPersone = numeroPersone;
	}

	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public BigDecimal getTassaSoggiorno() {
		return tassaSoggiorno;
	}

	public void setTassaSoggiorno(BigDecimal tassaSoggiorno) {
		this.tassaSoggiorno = tassaSoggiorno;
	}

	@Override
	public String toString() {
		return "CheckIn [id=" + id + ", idPrenotazione=" + idPrenotazione + ", idCliente=" + idCliente
				+ ", dataIngresso=" + dataIngresso + ", oraIngresso=" + oraIngresso + ", dataUscita=" + dataUscita
				+ ", oraUscita=" + oraUscita + ", numeroCamera=" + numeroCamera + ", costoTotale=" + costoTotale
				+ ", statoPrenotazione=" + statoPrenotazione + ", numeroPersone=" + numeroPersone + ", metodoPagamento="
				+ metodoPagamento + ", note=" + note + ", dataPagamento=" + dataPagamento + ", tassaSoggiorno="
				+ tassaSoggiorno + "]";
	}
    
    // costruttori, getter e setter, altri metodi
    
}

