package it.gestionale.web.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clienti")
public class Cliente {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
@Column(name="nome")
private String nome;
@Column(name="cognome")
private String cognome;
@Column(name="codice_fiscale")
private String codiceFiscale;
@Column(name="indirizzo")
private String indirizzo;
@Column(name="email")
private String email;
@Column(name="telefono")
private String telefono;


public Cliente() {
	
}
public Cliente(Integer id, String nome, String cognome, String codiceFiscale, String indirizzo, String email,
		String telefono) {
	super();
	this.id = id;
	this.nome = nome;
	this.cognome = cognome;
	this.codiceFiscale = codiceFiscale;
	this.indirizzo = indirizzo;
	this.email = email;
	this.telefono = telefono;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCognome() {
	return cognome;
}
public void setCognome(String cognome) {
	this.cognome = cognome;
}
public String getCodiceFiscale() {
	return codiceFiscale;
}
public void setCodiceFiscale(String codiceFiscale) {
	this.codiceFiscale = codiceFiscale;
}
public String getIndirizzo() {
	return indirizzo;
}
public void setIndirizzo(String indirizzo) {
	this.indirizzo = indirizzo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
@Override
public String toString() {
	return "Cliente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale
			+ ", indirizzo=" + indirizzo + ", email=" + email + ", telefono=" + telefono + "]";
}

}
