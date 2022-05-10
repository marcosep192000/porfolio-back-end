package com.example.backendPortfolio.entity;

import lombok.*;
import org.h2.api.DatabaseEventListener;

import javax.persistence.*;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "educacion")
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "Fecha_inicio", nullable = false)
    private Date fechaInicion;
    @Column(name = "fecha_fin", nullable = false)
    private Date fechaFin;
    @Column(name = "Nombre_institucion", nullable = false)
    private String nombreInstitucion;
    @Column(name = "Nombre_titulo", nullable = false)
    private String nombreTitulo;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @Column(name = "url_Institucion")
    private String urlInstitucion;
    @Column(name = "url_Titulo")
    private String urlTitulo;

}