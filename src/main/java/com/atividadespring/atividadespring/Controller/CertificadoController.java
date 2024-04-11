package com.atividadespring.atividadespring.Controller;

import com.atividadespring.atividadespring.Model.DTO.AulaCadastroDTO;
import com.atividadespring.atividadespring.Model.DTO.AulaEdicaoDTO;
import com.atividadespring.atividadespring.Model.DTO.CertificadoCadastroDTO;
import com.atividadespring.atividadespring.Model.DTO.CertificadoEdicaoDTO;
import com.atividadespring.atividadespring.Model.Entity.Aula;
import com.atividadespring.atividadespring.Model.Entity.Certificado;
import com.atividadespring.atividadespring.Service.AulaService;
import com.atividadespring.atividadespring.Service.CertificadoService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@Controller
@RequestMapping("/api/users/{userId}/certificates")
public class CertificadoController {
    private CertificadoService certificadoService;

    @GetMapping
    public List<Certificado> buscarTodos(@PathVariable Long userId){
        return certificadoService.buscarTodos(userId);
    }

}
