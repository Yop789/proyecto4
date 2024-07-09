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
@Table(name = "pr4_detalle_limpiar")
public class Detalle_limpiar {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ13")
    @SequenceGenerator(sequenceName = "customer_seq13", allocationSize = 1, name = "CUST_SEQ13")
    private Long id;

    @JoinColumn(name = "id_limpieza")
    @ManyToOne
    private Limpiar limpieza;

    @JoinColumn(name = "id_herramienta")
    @ManyToOne
    private Herramienta herramienta;

    @Column(name = "fecha_inicio")
    private LocalDateTime fecha;

    @Column(name = "fecha_fin")
    private LocalDateTime fechaFin;

    public Long getId() {
        return id;
    }

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

    public void setId(Long id) {
        this.id = id;
    }

    public Limpiar getLimpieza() {
        return limpieza;
    }

    public void setLimpieza(Limpiar limpieza) {
        this.limpieza = limpieza;
    }

    public Herramienta getHerramienta() {
        return herramienta;
    }

    public void setHerramienta(Herramienta herramienta) {
        this.herramienta = herramienta;
    }

}
