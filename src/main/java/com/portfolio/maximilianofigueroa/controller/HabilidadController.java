package com.portfolio.maximilianofigueroa.controller;

import com.portfolio.maximilianofigueroa.model.Habilidad;
import com.portfolio.maximilianofigueroa.service.HabilidadService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/habilidad")
public class HabilidadController {

    private final HabilidadService habilidadService;

    public HabilidadController(HabilidadService habilidadService) {
        this.habilidadService = habilidadService;
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/agregar")
    public void agregarHabilidad(@RequestBody Habilidad habilidad) {
        habilidadService.agregarHabilidad(habilidad);
    }

    @GetMapping("/ver")
    public List<Habilidad> verHabilidades() {
        return habilidadService.verHabilidades();
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PutMapping("/editar")
    public void editarHabilidad(@RequestBody Habilidad habilidad) {
        habilidadService.editarHabilidad(habilidad);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarHabilidad(@PathVariable("id") Long id) {
        habilidadService.borrarHabilidad(id);
    }
}