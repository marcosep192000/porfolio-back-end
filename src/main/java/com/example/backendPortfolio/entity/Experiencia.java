package com.example.backendPortfolio.entity;

import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "experiencia")
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre_empresa", nullable = false)
    private String nombreEmpresa;

    @Column(name = "puesto", nullable = false)
    private String puesto;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "fecha_inicio", nullable = false)
    private String fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private String fechaFin;

    @Column(name = "logo_empresa", nullable = false)
    private String logoEmpresa;

    @Column(name = "url_empresa", nullable = false)
    private String urlEmpresa;

    @Column(name = "url_github", nullable = false)
    private String urlGithub;

    @Column(name = "url_linkedin", nullable = false)
    private String urlLinkedIn;

    @Column
    private  int persona_id;

}
