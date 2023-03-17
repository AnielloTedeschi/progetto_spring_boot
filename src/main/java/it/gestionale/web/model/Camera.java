package it.gestionale.web.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "camere")
public class Camera {

  @Id
  @Column(name = "id")
  private Integer id;

  @Column(name = "piano")
  private Integer piano;

  @Column(name = "tipo")
  private String tipo;

  @Column(name = "prezzo")
  private BigDecimal prezzo;

  @Column(name = "nome")
  private String nome;

  @Column(name = "occupanti_max")
  private Integer occupantiMax;

  @Column(name = "descrizione")
  private String descrizione;

  @Column(name = "disponibile")
  private Boolean disponibile;

  @Column(name = "ultima_pulizia")
  private LocalDate ultimaPulizia;

  @Column(name = "ultima_manutenzione")
  private LocalDate ultimaManutenzione;

  public Camera() {}
  public Camera(Integer id, Integer piano, String tipo, BigDecimal prezzo, String nome, Integer occupantiMax,
      String descrizione, Boolean disponibile, LocalDate ultimaPulizia, LocalDate ultimaManutenzione) {
    this.id = id;
    this.piano = piano;
    this.tipo = tipo;
    this.prezzo = prezzo;
    this.nome = nome;
    this.occupantiMax = occupantiMax;
    this.descrizione = descrizione;
    this.disponibile = disponibile;
    this.ultimaPulizia = ultimaPulizia;
    this.ultimaManutenzione = ultimaManutenzione;
  }

  // getter e setter
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getPiano() {
    return piano;
  }

  public void setPiano(Integer piano) {
    this.piano = piano;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public BigDecimal getPrezzo() {
    return prezzo;
  }

  public void setPrezzo(BigDecimal prezzo) {
    this.prezzo = prezzo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getOccupantiMax() {
    return occupantiMax;
  }

  public void setOccupantiMax(Integer occupantiMax) {
    this.occupantiMax = occupantiMax;
  }

  public String getDescrizione() {
    return descrizione;
  }

  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  public Boolean getDisponibile() {
    	return disponibile;
  }

  public void setDisponibile(Boolean  disponibile) {
    this.disponibile = disponibile;
  }

  public LocalDate getUltimaPulizia() {
    return ultimaPulizia;
  }

  public void setUltimaPulizia(LocalDate ultimaPulizia) {
    this.ultimaPulizia = ultimaPulizia;
  }

  public LocalDate getUltimaManutenzione() {
    return ultimaManutenzione;
  }

@Override
public String toString() {
	return "Camera [id=" + id + ", piano=" + piano + ", tipo=" + tipo + ", prezzo=" + prezzo + ", nome=" + nome
			+ ", occupantiMax=" + occupantiMax + ", descrizione=" + descrizione + ", disponibile=" + disponibile
			+ ", ultimaPulizia=" + ultimaPulizia + ", ultimaManutenzione=" + ultimaManutenzione + "]";
}


}
