package com.example.backendPortfolio.entity;

import com.example.backendPortfolio.security.entity.Usuario;
import com.sun.istack.NotNull;
import lombok.*;
import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
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
    @NotEmpty(message = "El campo email no puede estar vacio")
    @NotBlank(message = "El campo email no puede estar vacio")
    private String email;
    @NotNull
    @Column
    @Size(min = 8, max = 20, message = "El campo contraseña debe tener entre 8 y 20 caracteres")
    private String password;

    private String telefono;
    @NotNull
    @Column
    @NotBlank(message = "El campo Direccion no puede estar vacio")
    private String direccion;
    @Column
    private String ciudad;
    @Column
    private String pais;
    @Column

    private String fecha_nacimiento;
    @Column
    @NotBlank(message = "El campo genero no puede estar vacio")
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