package com.lopez.app.jpa.models;

import java.sql.Date;
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
@Table(name = "pr4_detalle_alimentar")
public class Detalle_alimentar {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ14")
    @SequenceGenerator(sequenceName = "customer_seq14", allocationSize = 1, name = "CUST_SEQ14")
    private Long id;

    @JoinColumn(name = "id_alimentacion")
    @ManyToOne
    private Alimentar alimentar;

    @JoinColumn(name = "id_herramienta")
    @ManyToOne
    private Herramienta herramienta;

    @Column(name = "fecha_inicio")
    private LocalDateTime fecha;

    @Column(name = "fecha_fin")
    private LocalDateTime fechaFin;

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Alimentar getAlimentar() {
        return alimentar;
    }

    public void setAlimentar(Alimentar alimentar) {
        this.alimentar = alimentar;
    }

    public Herramienta getHerramienta() {
        return herramienta;
    }

    public void setHerramienta(Herramienta herramienta) {
        this.herramienta = herramienta;
    }

}
