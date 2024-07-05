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
@Table(name = "pr4_alimentar")
public class Alimentar {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ18")
    @SequenceGenerator(sequenceName = "customer_seq18", allocationSize = 1, name = "CUST_SEQ18")
    private Long id;

    @JoinColumn(name = "alimentador")
    @ManyToOne
    private Usuario alimentador;

    @JoinColumn(name = "comida")
    @ManyToOne
    private Comida comida;

    @Column(name = "cantidad")
    private Integer cantidad;

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

    public Usuario getAlimentador() {
        return alimentador;
    }

    public void setAlimentador(Usuario alimentador) {
        this.alimentador = alimentador;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
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
