package com.lopez.app.jpa.dtos;

import com.lopez.app.jpa.enums.EstatusCorral;
import com.lopez.app.jpa.enums.TipoEspecie;
import com.lopez.app.jpa.enums.TiposSueloCorral;
import com.lopez.app.jpa.enums.TiposVallas;

public class CorralDto {

    private Long id;

    private TiposSueloCorral tipo;

    private Integer capacidad;

    private String ubicacion;

    private EstatusCorral estatus;

    private Integer tamano;

    private TiposVallas tipoValla;

    private TipoEspecie tipoAnimal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TiposSueloCorral getTipo() {
        return tipo;
    }

    public void setTipo(TiposSueloCorral tipo) {
        this.tipo = tipo;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public EstatusCorral getEstatus() {
        return estatus;
    }

    public void setEstatus(EstatusCorral estatus) {
        this.estatus = estatus;
    }

    public Integer getTamano() {
        return tamano;
    }

    public void setTamano(Integer tamano) {
        this.tamano = tamano;
    }

    public TiposVallas getTipoValla() {
        return tipoValla;
    }

    public void setTipoValla(TiposVallas tipoValla) {
        this.tipoValla = tipoValla;
    }

    public TipoEspecie getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoEspecie tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

}
