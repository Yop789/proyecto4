package com.lopez.app.jpa.dtos;

import com.lopez.app.jpa.enums.TipoHeramienta;

public class HerramientasDto {

    private Long id;

    private Integer codigo;

    private String nombre;

    private String descripcion;

    private Boolean disponibilidad;

    private String marca;

    private String color;

    private TipoHeramienta tipoHerramienta;

    private Boolean estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TipoHeramienta getTipoHerramienta() {
        return tipoHerramienta;
    }

    public void setTipoHerramienta(TipoHeramienta tipoHerramienta) {
        this.tipoHerramienta = tipoHerramienta;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

}
