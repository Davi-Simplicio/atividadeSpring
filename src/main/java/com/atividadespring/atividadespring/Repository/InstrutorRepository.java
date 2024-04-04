package com.atividadespring.atividadespring.Repository;

import com.atividadespring.atividadespring.Model.Entity.Instrutor;
import com.atividadespring.atividadespring.Model.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstrutorRepository extends JpaRepository<Instrutor,Long> {
}
