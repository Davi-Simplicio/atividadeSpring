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
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataDeCriacao;
    @OneToOne(cascade = CascadeType.ALL)
    private Instrutor instrutor;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Aula> aulas;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Inscricao> inscricoes;
}
