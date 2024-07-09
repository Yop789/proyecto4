package com.lopez.app.jpa.daos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lopez.app.jpa.models.Detalle_limpiar;

public interface IDetalleLimpiarDao extends CrudRepository<Detalle_limpiar, Long> {

    @Query("SELECT d FROM Detalle_limpiar d WHERE d.limpieza.id =?1")
    List<Detalle_limpiar> finByLimpizaId(Long id);
}
