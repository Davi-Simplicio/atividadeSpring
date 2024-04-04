package com.atividadespring.atividadespring.Model.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private LocalDateTime dataDeCadastro;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Curso> cursos;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Certificado> certificados;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Inscricao> inscricoes;
}
