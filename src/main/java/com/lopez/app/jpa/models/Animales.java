package com.lopez.app.jpa.models;

import java.util.Date;

import com.lopez.app.jpa.enums.TipoEspecie;

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
@Table(name = "pr4_animales")
public class Animales {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ17")
    @SequenceGenerator(sequenceName = "customer_seq17", allocationSize = 1, name = "CUST_SEQ17")
    private Long id;

    @Column(name = "siniiga")
    private Integer siniiga;

    @Column(name = "especie")
    private TipoEspecie especie;

    @Column(name = "genero")
    private String genero;

    @Column(name = "peso")
    private Integer peso;

    @Column(name = "altura")
    private Integer altura;

    @Column(name = "color")
    private String color;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @JoinColumn(name = "id_corral")
    @ManyToOne
    private Corral corral;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSiniiga() {
        return siniiga;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public Corral getCorral() {
        return corral;
    }

    public void setCorral(Corral corral) {
        this.corral = corral;
    }

    // Getters and setters

}
