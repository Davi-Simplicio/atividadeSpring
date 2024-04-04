package com.atividadespring.atividadespring.Repository;

import com.atividadespring.atividadespring.Model.Entity.Inscricao;
import com.atividadespring.atividadespring.Model.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscricaoRepository extends JpaRepository<Inscricao,Long> {
}
