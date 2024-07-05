package com.lopez.app.jpa.models;

import java.util.Date;

import com.lopez.app.jpa.enums.EnumCategoriaComida;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pr4_comidas")
public class Comida {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ16")
    @SequenceGenerator(sequenceName = "customer_seq16", allocationSize = 1, name = "CUST_SEQ16")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "disponibilidad")
    private Boolean disponibilidad;

    @Column(name = "categoria")
    private EnumCategoriaComida categoria;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "fecha_reabasteciendo")
    private Date fechaReabasteciendo;

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public EnumCategoriaComida getCategoria() {
        return categoria;
    }

    public void setCategoria(EnumCategoriaComida categoria) {
        this.categoria = categoria;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaReabasteciendo() {
        return fechaReabasteciendo;
    }

    public void setFechaReabasteciendo(Date fechaReabasteciendo) {
        this.fechaReabasteciendo = fechaReabasteciendo;
    }

}
