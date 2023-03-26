package com.portfolio.maximilianofigueroa.service;

import com.portfolio.maximilianofigueroa.model.Persona;
import com.portfolio.maximilianofigueroa.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class PersonaService {
    private final PersonaRepository personaRepository;

    @Autowired
    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public void agregarPersona(Persona persona) {
        personaRepository.save(persona);
    }

    public List<Persona> verPersonas() {
        return personaRepository.findAll();
    }

    public Persona buscarPersona(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    public void editarPersona(Persona persona) {
        personaRepository.save(persona);
    }

    public void borrarPersona(Long id) {
        personaRepository.deleteById(id);
    }
}