package it.gestionale.web.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "metodi_pagamento")
public class MetodoPagamento {

    @Id
    @Column(name = "tipo", length = 50)
    private String tipo;

    @Column(name = "descrizione")
    private String descrizione;

    // constructors, getters and setters

    public MetodoPagamento() {}

    public MetodoPagamento(String tipo, String descrizione) {
        this.tipo = tipo;
        this.descrizione = descrizione;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

	@Override
	public String toString() {
		return "MetodoPagamento [tipo=" + tipo + ", descrizione=" + descrizione + "]";
	}

}
