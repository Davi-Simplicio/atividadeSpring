package com.atividadespring.atividadespring.Repository;

import com.atividadespring.atividadespring.Model.Entity.Aula;
import com.atividadespring.atividadespring.Model.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AulaRepository extends JpaRepository<Aula,Long> {
}
