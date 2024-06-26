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
public class Certificado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDoCurso;
    private LocalDateTime dataDeEmissao;
    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    private Usuario usuario;
}
