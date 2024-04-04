package com.atividadespring.atividadespring.Model.DTO;

import com.atividadespring.atividadespring.Model.Entity.Aula;
import com.atividadespring.atividadespring.Model.Entity.Inscricao;
import com.atividadespring.atividadespring.Model.Entity.Instrutor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoCadastroDTO {

    private String titulo;
    private String descricao;
    private LocalDateTime dataDeCriacao = LocalDateTime.now();
    private Instrutor instrutor;
    private List<Aula> aulas;
    private List<Inscricao> inscricoes;
}
