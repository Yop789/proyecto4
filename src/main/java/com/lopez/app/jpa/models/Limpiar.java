package com.lopez.app.jpa.models;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pr4_limpiar")
public class Limpiar {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ11")
    @SequenceGenerator(sequenceName = "customer_seq11", allocationSize = 1, name = "CUST_SEQ11")
    private Long id;

    @JoinColumn(name = "limpiador")
    @ManyToOne
    private Usuario limpiador;

    @JoinColumn(name = "corral")
    @ManyToOne
    private Corral corral;

    @Column(name = "fecha_inicial")
    private LocalDateTime fecha;

    @Column(name = "fecha_final")
    private LocalDateTime fechaFinal;

    @Column(name = "estado")
    private Boolean estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getLimpiador() {
        return limpiador;
    }

    public void setLimpiador(Usuario limpiador) {
        this.limpiador = limpiador;
    }

    public Corral getCorral() {
        return corral;
    }

    public void setCorral(Corral corral) {
        this.corral = corral;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDateTime fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

}
