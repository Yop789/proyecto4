package com.lopez.app.jpa.services;

import java.util.List;

import com.lopez.app.jpa.dtos.AlimentarDto;
import com.lopez.app.jpa.dtos.DetalleAlimentarDto;

public interface IDetalleAlimentar extends IService<AlimentarDto, DetalleAlimentarDto> {

    List<AlimentarDto> findByAlimentarId(Long id);

}
