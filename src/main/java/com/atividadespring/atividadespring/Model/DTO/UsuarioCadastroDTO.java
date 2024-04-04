package com.atividadespring.atividadespring.Model.DTO;

import com.atividadespring.atividadespring.Model.Entity.Certificado;
import com.atividadespring.atividadespring.Model.Entity.Curso;
import com.atividadespring.atividadespring.Model.Entity.Inscricao;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioCadastroDTO {

    private String nome;
    private String email;
    private String senha;
    private LocalDateTime dataDeCadastro = LocalDateTime.now();
    private List<Curso> cursos;
    private List<Certificado> certificados;
    private List<Inscricao> inscricoes;
}
