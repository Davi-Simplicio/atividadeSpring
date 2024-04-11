package com.atividadespring.atividadespring.Model.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    private List<Curso> cursos;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    private List<Certificado> certificados;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    private List<Inscricao> inscricoes;
}
