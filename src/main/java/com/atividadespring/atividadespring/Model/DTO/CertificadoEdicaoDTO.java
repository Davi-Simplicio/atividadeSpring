package com.atividadespring.atividadespring.Model.DTO;

import com.atividadespring.atividadespring.Model.Entity.Usuario;
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
public class CertificadoEdicaoDTO {

    private Long id;
    private String nomeDoCurso;
    private LocalDateTime dataDeEmissao;
    private Usuario usuario;
}
