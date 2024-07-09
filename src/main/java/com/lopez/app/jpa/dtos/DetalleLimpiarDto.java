package com.lopez.app.jpa.dtos;

import java.time.LocalDateTime;

public class DetalleLimpiarDto {

    private Long id;

    private Long id_limpieza;

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
        return id_limpieza;
    }

    public void setId_limpiador(Long id_limpieza) {
        this.id_limpieza = id_limpieza;
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
