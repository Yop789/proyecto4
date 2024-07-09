package com.lopez.app.jpa.dtos;

import java.time.LocalDateTime;
import java.util.List;

public class LimpiarHeramientaDTO {
    private Long id;

    private Long id_limpiador;

    private Long id_corral;

    private LocalDateTime fecha;

    private LocalDateTime fechaFin;

    private Boolean estado;

    private List<DetalleLimpiarDto> herramientas;

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

    public Long getId_corral() {
        return id_corral;
    }

    public void setId_corral(Long id_corral) {
        this.id_corral = id_corral;
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

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<DetalleLimpiarDto> getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(List<DetalleLimpiarDto> herramientas) {
        this.herramientas = herramientas;
    }

}
