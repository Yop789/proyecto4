package com.lopez.app.jpa.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lopez.app.jpa.enums.EstatusCorral;
import com.lopez.app.jpa.enums.TipoEspecie;
import com.lopez.app.jpa.enums.TiposSueloCorral;
import com.lopez.app.jpa.enums.TiposVallas;

@RestController
@RequestMapping("api/corrales")
public class CatalogoTipoCorrale {

    @GetMapping("/tipos")
    public List<String> findAll() {
        List<String> tipos = new ArrayList<>();
        for (TiposSueloCorral e : TiposSueloCorral.values()) {
            tipos.add(e.toString());
        }
        return tipos;
    }

    @GetMapping("/tipos/animales")
    public List<String> findEspecies() {
        List<String> tipos = new ArrayList<>();
        for (TipoEspecie e : TipoEspecie.values()) {
            tipos.add(e.toString());
        }
        return tipos;
    }

    @GetMapping("/tipos/Vallas")
    public List<String> findVallas() {
        List<String> tipos = new ArrayList<>();
        for (TiposVallas e : TiposVallas.values()) {
            tipos.add(e.toString());
        }
        return tipos;
    }

    @GetMapping("/tipos/estatus")
    public List<String> findEstatus() {
        List<String> tipos = new ArrayList<>();
        for (EstatusCorral e : EstatusCorral.values()) {
            tipos.add(e.toString());
        }
        return tipos;
    }

}
