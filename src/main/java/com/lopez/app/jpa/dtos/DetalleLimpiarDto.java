package com.lopez.app.jpa.dtos;

import java.time.LocalDateTime;

public class DetalleLimpiarDto {

    private Long id;

    private Long id_limpiador;

    private Long id_herramienta;

    private LocalDateTime fecha;

    private LocalDateTime fechaFin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_limpiador() {
        return id_limpiador;
    }

    public void setId_limpiador(Long id_limpiador) {
        this.id_limpiador = id_limpiador;
    }

    public Long getId_herramienta() {
        return id_herramienta;
    }

    public void setId_herramienta(Long id_herramienta) {
        this.id_herramienta = id_herramienta;
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

}
