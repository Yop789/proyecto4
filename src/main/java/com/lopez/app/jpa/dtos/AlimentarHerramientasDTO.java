package com.lopez.app.jpa.dtos;

import java.time.LocalDateTime;
import java.util.List;

public class AlimentarHerramientasDTO {

    private Long id;

    private Long id_alimentador;

    private Long id_comida;

    private Integer cantidad;

    private Long id_corral;

    private LocalDateTime fecha;

    private LocalDateTime fechaFinal;

    private Boolean estado;

    private List<DetalleAlimentarDto> herramientas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_alimentador() {
        return id_alimentador;
    }

    public void setId_alimentador(Long id_alimentador) {
        this.id_alimentador = id_alimentador;
    }

    public Long getId_comida() {
        return id_comida;
    }

    public void setId_comida(Long id_comida) {
        this.id_comida = id_comida;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
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

    public LocalDateTime getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDateTime fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<DetalleAlimentarDto> getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(List<DetalleAlimentarDto> herramientas) {
        this.herramientas = herramientas;
    }

}
