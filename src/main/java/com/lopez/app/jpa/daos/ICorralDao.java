package com.lopez.app.jpa.daos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lopez.app.jpa.enums.EstatusCorral;
import com.lopez.app.jpa.enums.TipoEspecie;
import com.lopez.app.jpa.models.Corral;

public interface ICorralDao extends CrudRepository<Corral, Long> {

    @Query(value = "SELECT v FROM Corral v WHERE v.tipoAnimal = ?1 AND v.estatus = ?2")
    List<Corral> findByEspecie(TipoEspecie especie, EstatusCorral estatus);

}
