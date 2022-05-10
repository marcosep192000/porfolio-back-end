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
@Table(name = "idioma")
public class Idioma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "idioma", nullable = false)
    private String idioma;
    @Column(name = "nivel", nullable = false)
        private String nivel;
    @Column(name = "nivel_escrito", nullable = false)
        private String nivelEscrito;
    @Column(name = "nivel_oral", nullable = false)
        private String nivelOral;


}