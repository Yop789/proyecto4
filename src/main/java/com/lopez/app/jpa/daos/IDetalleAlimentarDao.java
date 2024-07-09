package com.lopez.app.jpa.daos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lopez.app.jpa.models.Detalle_alimentar;

public interface IDetalleAlimentarDao extends CrudRepository<Detalle_alimentar, Long> {

    @Query("SELECT d FROM Detalle_alimentar d WHERE d.alimentar.id =?1")
    List<Detalle_alimentar> finByAlimentarId(Long id);

}
