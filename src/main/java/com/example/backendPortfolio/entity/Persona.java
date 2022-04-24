package com.example.backendPortfolio.entity;

import com.example.backendPortfolio.security.entity.Usuario;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "usuario_datos")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona", nullable = false)
    private Long id;

    @Email
    @Column
    private String email;
    @NotNull
    @Column
    private String telefono;
    @NotNull
    @NotEmpty(message = "DAdada")
    @Column
    private String direccion;
    @Column
    private String ciudad;
    @Column
    private String pais;
    @Column
    private String fecha_nacimiento;
    @Column
    private String genero;
    @Column
    private String foto;
    @Column
    private String estado;

@ManyToOne(fetch = FetchType.LAZY)
private Usuario user;


    @OneToMany( cascade = CascadeType.ALL)
    @JoinColumn(name ="id_experiencia")
    private List<Experiencia> experiencias;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id_usuario")
    private Usuario usuario;

    public boolean esNulo()
{
    return false;
}

}