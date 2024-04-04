package com.atividadespring.atividadespring.Model.Entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class InscricaoId implements Serializable {
    private Long usuarioId;
    private Long cursoId;
}
