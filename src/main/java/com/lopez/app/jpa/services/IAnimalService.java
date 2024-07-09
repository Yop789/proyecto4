package com.lopez.app.jpa.services;

import java.util.List;

import com.lopez.app.jpa.dtos.AnimalesDto;

import com.lopez.app.jpa.models.Animales;

public interface IAnimalService extends IService<Animales, AnimalesDto> {

    List<Animales> findByIdCorral(Long idCorral);

}
