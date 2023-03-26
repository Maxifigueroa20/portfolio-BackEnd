package com.portfolio.maximilianofigueroa.controller;

import com.portfolio.maximilianofigueroa.model.Educacion;
import com.portfolio.maximilianofigueroa.service.EducacionService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/educacion")
public class EducacionController {
    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/agregar")
    public void agregarEducacion(@RequestBody Educacion educacion) {
        educacionService.agregarEducacion(educacion);
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Educacion> verEducaciones() {
        return educacionService.verEducacion();
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PutMapping("/editar")
    public void editarEducacion(@RequestBody Educacion educacion) {
        educacionService.editarEducacion(educacion);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarEducacion(@PathVariable("id") Long id) {
        educacionService.borrarEducacion(id);
    }
}