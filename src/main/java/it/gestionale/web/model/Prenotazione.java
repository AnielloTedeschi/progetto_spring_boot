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
@Table(name = "prenotazioni")
public class Prenotazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome_prenotante", nullable = false)
    private String nomePrenotante;

    @Column(name = "telefono", nullable = false)
    private String telefono;

    @Column(name = "email", nullable = false)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_camera", nullable = false)
    private Camera camera;

    @Column(name = "data_prenotazione", nullable = false)
    private LocalDate dataPrenotazione;

    @Column(name = "num_persone", nullable = false)
    private int numPersone;

    @Column(name = "acconto", nullable = false)
    private BigDecimal acconto;

    // costruttore vuoto
    public Prenotazione() {
    }

    // costruttore con parametri
    public Prenotazione(String nomePrenotante, String telefono, String email, Camera camera,
                        LocalDate dataPrenotazione, int numPersone, BigDecimal acconto) {
        this.nomePrenotante = nomePrenotante;
        this.telefono = telefono;
        this.email = email;
        this.camera = camera;
        this.dataPrenotazione = dataPrenotazione;
        this.numPersone = numPersone;
        this.acconto = acconto;
    }

    // getters e setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomePrenotante() {
        return nomePrenotante;
    }

    public void setNomePrenotante(String nomePrenotante) {
        this.nomePrenotante = nomePrenotante;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public LocalDate getDataPrenotazione() {
        return dataPrenotazione;
    }

    public void setDataPrenotazione(LocalDate dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }

    public int getNumPersone() {
        return numPersone;
    }

    public void setNumPersone(int numPersone) {
        this.numPersone = numPersone;
    }

    public BigDecimal getAcconto() {
        return acconto;
    }

    public void setAcconto(BigDecimal acconto) {
        this.acconto = acconto;
    }

	@Override
	public String toString() {
		return "Prenotazione [id=" + id + ", nomePrenotante=" + nomePrenotante + ", telefono=" + telefono + ", email="
				+ email + ", camera=" + camera + ", dataPrenotazione=" + dataPrenotazione + ", numPersone=" + numPersone
				+ ", acconto=" + acconto + "]";
	}

}
