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
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataDeCriacao;
    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    private Instrutor instrutor;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "curso")
    private List<Aula> aulas;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    private List<Inscricao> inscricoes;
}
