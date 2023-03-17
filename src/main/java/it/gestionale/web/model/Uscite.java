package it.gestionale.web.model;
import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "uscite")
public class Uscite {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "data")
    private LocalDate data;
    
    @Column(name = "descrizione", length = 100)
    private String descrizione;
    
    @Column(name = "importo")
    private BigDecimal importo;
    
    @Column(name = "tipo_pagamento", length = 50)
    private String tipoPagamento;
    
    @Column(name = "note", length = 1000)
    private String note;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_pagamento", referencedColumnName = "tipo", insertable = false, updatable = false)
    private MetodoPagamento metodoPagamento;

	public Uscite(Long id, LocalDate data, String descrizione, BigDecimal importo, String tipoPagamento, String note,
			MetodoPagamento metodoPagamento) {
		super();
		this.id = id;
		this.data = data;
		this.descrizione = descrizione;
		this.importo = importo;
		this.tipoPagamento = tipoPagamento;
		this.note = note;
		this.metodoPagamento = metodoPagamento;
	}

	public Uscite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public BigDecimal getImporto() {
		return importo;
	}

	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public MetodoPagamento getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	@Override
	public String toString() {
		return "Uscite [id=" + id + ", data=" + data + ", descrizione=" + descrizione + ", importo=" + importo
				+ ", tipoPagamento=" + tipoPagamento + ", note=" + note + ", metodoPagamento=" + metodoPagamento + "]";
	}
    
    
}