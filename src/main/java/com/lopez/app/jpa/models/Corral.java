package com.lopez.app.jpa.models;

import com.lopez.app.jpa.enums.EstatusCorral;
import com.lopez.app.jpa.enums.TipoEspecie;
import com.lopez.app.jpa.enums.TiposSueloCorral;
import com.lopez.app.jpa.enums.TiposVallas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pr4_corrales")
public class Corral {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ15")
    @SequenceGenerator(sequenceName = "customer_seq15", allocationSize = 1, name = "CUST_SEQ15")
    private Long id;

    @Column(name = "tipo_suelo")
    private TiposSueloCorral tipo;

    @Column(name = "capacidad")
    private Integer capacidad;

    @Column(name = "descripcion_Ubicacion")
    private String ubicacion;

    @Column(name = "estatus")
    private EstatusCorral estatus;

    @Column(name = "tamaño")
    private Integer tamano;

    @Column(name = "tipo_valla")
    private TiposVallas tipoValla;

    @Column(name = "tipo_animal_actual")
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
