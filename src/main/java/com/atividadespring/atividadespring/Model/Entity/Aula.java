package com.atividadespring.atividadespring.Model.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Aula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String conteudo;
    private LocalDateTime dataDePublicacao;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    private Curso curso;
}
