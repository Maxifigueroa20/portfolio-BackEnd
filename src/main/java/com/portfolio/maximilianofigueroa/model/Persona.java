package com.portfolio.maximilianofigueroa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idPersona;

    @Column(name = "nombre")
    private String nombrePersona;

    @Column(name = "titulo")
    private String tituloPersona;

    @Column(name = "descripcion")
    private String descripcionPersona;

    @Column(name = "numero_telefono")
    private Long numeroPersona;

    @Column(name = "correo_electronico")
    private String correoPersona;

    @Column(name = "imagen")
    private String imagenPersona;

    @Column(name = "banner")
    private String bannerPersona;
}