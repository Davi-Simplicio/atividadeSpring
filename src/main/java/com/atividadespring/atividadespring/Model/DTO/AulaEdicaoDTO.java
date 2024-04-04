package com.atividadespring.atividadespring.Model.DTO;

import com.atividadespring.atividadespring.Model.Entity.Curso;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AulaEdicaoDTO {

    private Long id;
    private String titulo;
    private String conteudo;
    private LocalDateTime dataDePublicacao;
    private Curso curso;
}
