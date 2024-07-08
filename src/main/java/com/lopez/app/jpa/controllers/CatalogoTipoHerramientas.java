package com.lopez.app.jpa.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lopez.app.jpa.enums.TipoHeramienta;

@RestController
@RequestMapping("api/herramientas")
public class CatalogoTipoHerramientas {

    @GetMapping("/tipos")
    public List<String> findAll() {
        List<String> tipos = new ArrayList<>();
        for (TipoHeramienta e : TipoHeramienta.values()) {
            tipos.add(e.toString());
        }
        return tipos;
    }

}
