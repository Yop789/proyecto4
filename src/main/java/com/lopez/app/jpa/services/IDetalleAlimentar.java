package com.lopez.app.jpa.services;

import java.util.List;

import com.lopez.app.jpa.dtos.DetalleAlimentarDto;
import com.lopez.app.jpa.models.Detalle_alimentar;

public interface IDetalleAlimentar extends IService<Detalle_alimentar, DetalleAlimentarDto> {

    List<Detalle_alimentar> findByAlimentarId(Long id);

}
