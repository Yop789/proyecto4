package com.lopez.app.jpa.services;

import java.util.List;

import com.lopez.app.jpa.dtos.CorralDto;
import com.lopez.app.jpa.models.Corral;

public interface ICorralEService extends IService<Corral, CorralDto> {
    List<Corral> findByEspecie(String especie, String estatus);

    

}
