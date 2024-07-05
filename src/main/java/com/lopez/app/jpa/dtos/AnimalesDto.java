package com.lopez.app.jpa.dtos;

import java.util.Date;

import com.lopez.app.jpa.enums.TipoEspecie;

public class AnimalesDto {

    private Long id;

    private Integer siniiga;

    private TipoEspecie especie;

    private String genero;

    private Integer peso;

    private Integer altura;

    private String color;

    private Date fechaNacimiento;

    private Long idCorral;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSiniiga() {
        return siniiga;
    }

    public void setSiniiga(Integer siniiga) {
        this.siniiga = siniiga;
    }

    public TipoEspecie getEspecie() {
        return especie;
    }

    public void setEspecie(TipoEspecie especie) {
        this.especie = especie;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getIdCorral() {
        return idCorral;
    }

    public void setIdCorral(Long idCorral) {
        this.idCorral = idCorral;
    }

}
