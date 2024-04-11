package com.atividadespring.atividadespring.Repository;

import com.atividadespring.atividadespring.Model.Entity.Certificado;
import com.atividadespring.atividadespring.Model.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CertificadoRepository extends JpaRepository<Certificado,Long> {
    List<Certificado> findCertificadosByUsuario_Id(Long id);
}
