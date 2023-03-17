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
@Table(name = "entrate")
public class Entrate {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "data", nullable = false)
   private LocalDate data;

   @Column(name = "descrizione", length = 100)
   private String descrizione;

   @Column(name = "importo", nullable = false)
   private BigDecimal importo;

   @Column(name = "tipo_pagamento", length = 50)
   private String tipoPagamento;

   @Column(name = "note", length = 1000)
   private String note;

   @ManyToOne
   @JoinColumn(name = "tipo_pagamento", referencedColumnName = "tipo", insertable = false, updatable = false)
   private MetodoPagamento metodiPagamento;

   
public Entrate(Long id, LocalDate data, String descrizione, BigDecimal importo, String tipoPagamento, String note,
		MetodoPagamento metodiPagamento) {
	super();
	this.id = id;
	this.data = data;
	this.descrizione = descrizione;
	this.importo = importo;
	this.tipoPagamento = tipoPagamento;
	this.note = note;
	this.metodiPagamento = metodiPagamento;
}

public Entrate() {
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

public MetodoPagamento getMetodiPagamento() {
	return metodiPagamento;
}

public void setMetodiPagamento(MetodoPagamento metodiPagamento) {
	this.metodiPagamento = metodiPagamento;
}

@Override
public String toString() {
	return "Entrate [id=" + id + ", data=" + data + ", descrizione=" + descrizione + ", importo=" + importo
			+ ", tipoPagamento=" + tipoPagamento + ", note=" + note + ", metodiPagamento=" + metodiPagamento + "]";
}

   
}
