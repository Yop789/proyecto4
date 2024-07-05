package com.lopez.app.jpa.dtos;

import java.time.LocalDateTime;

public class DetalleAlimentarDto {

    private Long id;

    private Long id_alimetacion;

    private Long id_herramienta;

    private LocalDateTime fecha;

    private LocalDateTime fechaFin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_alimetacion() {
        return id_alimetacion;
    }

    public void setId_alimetacion(Long id_alimetacion) {
        this.id_alimetacion = id_alimetacion;
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
