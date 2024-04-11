package com.atividadespring.atividadespring.Controller;

import com.atividadespring.atividadespring.Model.DTO.CertificadoCadastroDTO;
import com.atividadespring.atividadespring.Model.DTO.CertificadoEdicaoDTO;
import com.atividadespring.atividadespring.Model.DTO.CursoCadastroDTO;
import com.atividadespring.atividadespring.Model.DTO.CursoEdicaoDTO;
import com.atividadespring.atividadespring.Model.Entity.Certificado;
import com.atividadespring.atividadespring.Model.Entity.Curso;
import com.atividadespring.atividadespring.Service.CertificadoService;
import com.atividadespring.atividadespring.Service.CursoService;
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
@RequestMapping("/api/courses")
public class CursoController {
    private CursoService cursoService;

    @PostMapping
    public ResponseEntity<Curso> cadastrar(@RequestBody CursoCadastroDTO cursoCadastroDTO){
        try{
            return new ResponseEntity<>(cursoService.cadastrar(cursoCadastroDTO), HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping("{id}")
    public ResponseEntity<Curso> editar(@RequestBody CursoEdicaoDTO cursoEdicaoDTO,@PathVariable Long id){
        try{

            return new ResponseEntity<>(cursoService.editar(cursoEdicaoDTO,id), HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping
    public List<Curso> buscarTodos(){
        return cursoService.buscarTodos();
    }
    @GetMapping("/{id}")
    public Curso buscarUm(@PathVariable Long id){
        return cursoService.buscarUm(id);
    }
}
