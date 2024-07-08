package com.lopez.app.jpa.models;

import com.lopez.app.jpa.enums.EnumEstadoUsuario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pr4_trabajadores")
public class Usuario {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ10")
    @SequenceGenerator(sequenceName = "customer_seq10", allocationSize = 1, name = "CUST_SEQ10")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "ap_Paterno")
    private String apPaterno;

    @Column(name = "ap_Materno")
    private String apMaterno;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "rol")
    private String rol;

    @Column(name = "estado")
    private EnumEstadoUsuario estado;

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

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public EnumEstadoUsuario getEstado() {
        return estado;
    }

    public void setEstado(EnumEstadoUsuario estado) {
        this.estado = estado;
    }

}
