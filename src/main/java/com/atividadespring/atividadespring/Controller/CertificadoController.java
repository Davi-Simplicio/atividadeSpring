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
@RequestMapping("/certificado")
public class CertificadoController {
    private CertificadoService certificadoService;

    @PostMapping
    public ResponseEntity<Certificado> cadastrar(@RequestBody CertificadoCadastroDTO certificadoCadastroDTO){
        try{
            certificadoService.cadastrar(certificadoCadastroDTO);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping
    public ResponseEntity<Certificado> editar(@RequestBody CertificadoEdicaoDTO certificadoEdicaoDTO){
        try{
            certificadoService.editar(certificadoEdicaoDTO);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping
    public List<Certificado> buscarTodos(){
        return certificadoService.buscarTodos();
    }
    @GetMapping("/{id}")
    public Certificado buscarUm(@PathVariable Long id){
        return certificadoService.buscarUm(id);
    }
}
