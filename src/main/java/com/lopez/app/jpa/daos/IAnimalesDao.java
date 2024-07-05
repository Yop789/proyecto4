package com.lopez.app.jpa.daos;

import org.springframework.data.repository.CrudRepository;

import com.lopez.app.jpa.models.Animales;

public interface IAnimalesDao extends CrudRepository<Animales, Long> {

}
