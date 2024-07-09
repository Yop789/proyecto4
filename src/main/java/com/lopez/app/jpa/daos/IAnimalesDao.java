package com.lopez.app.jpa.daos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lopez.app.jpa.models.Animales;

public interface IAnimalesDao extends CrudRepository<Animales, Long> {

    @Query("select a from Animales a where a.corral.id = ?1")
    List<Animales> findByIdCorral(Long idCorral);

}
