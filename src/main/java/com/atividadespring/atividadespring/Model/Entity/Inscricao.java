package com.atividadespring.atividadespring.Model.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Inscricao {

    private String titulo;
    private String descricao;
    private LocalDateTime dataDeCriacao;
    @EmbeddedId
    private InscricaoId id;
    @OneToOne(cascade = CascadeType.ALL)
    @MapsId(value = "usuarioId")
    private Usuario usuario;
    @OneToOne(cascade = CascadeType.ALL)
    @MapsId(value = "cursoId")
    private Curso curso;
}
