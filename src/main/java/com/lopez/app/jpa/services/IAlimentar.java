package com.lopez.app.jpa.services;

import com.lopez.app.jpa.dtos.AlimentarDto;
import com.lopez.app.jpa.models.Alimentar;

public interface IAlimentar extends IService<Alimentar, AlimentarDto> {

    Long saveReturId(AlimentarDto t);

    void update(Long id);

}
