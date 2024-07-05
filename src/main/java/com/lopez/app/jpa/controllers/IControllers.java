package com.lopez.app.jpa.controllers;

import java.util.List;
import java.util.Map;

public interface IControllers<CL, DTO> {

    Map<String, String> guardar(DTO dto);

    List<CL> findAll();

    CL findById(Long id);

    Map<String, String> deleteById(Long id);

    Map<String, String> update(DTO dto);

}
