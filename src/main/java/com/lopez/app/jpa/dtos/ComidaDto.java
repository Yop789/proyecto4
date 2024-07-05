package com.lopez.app.jpa.dtos;

import java.sql.Date;

import com.lopez.app.jpa.enums.EnumCategoriaComida;

public class ComidaDto {

    private Long id;

    private String nombre;

    private String descripcion;

    private Boolean disponibilidad;

    private EnumCategoriaComida categoria;

    private Integer cantidad;

    private Date fechaReabasteciendo;

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
