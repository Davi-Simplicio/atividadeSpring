package com.atividadespring.atividadespring.Controller;

import com.atividadespring.atividadespring.Model.DTO.AulaCadastroDTO;
import com.atividadespring.atividadespring.Model.DTO.AulaEdicaoDTO;
import com.atividadespring.atividadespring.Model.Entity.Aula;
import com.atividadespring.atividadespring.Service.AulaService;
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
@RequestMapping("/aula")
public class AulaController {

    private AulaService aulaService;

    @PostMapping
    public ResponseEntity<Aula> cadastrar(@RequestBody AulaCadastroDTO aulaCadastroDTO){
        try{
            aulaService.cadastrar(aulaCadastroDTO);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping
    public ResponseEntity<Aula> editar(@RequestBody AulaEdicaoDTO aulaEdicaoDTO){
        try{
            aulaService.editar(aulaEdicaoDTO);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping
    public List<Aula> buscarTodos(){
        return aulaService.buscarTodos();
    }
    @GetMapping("/{id}")
    public Aula buscarUm(@PathVariable Long id){
        return aulaService.buscarUm(id);
    }
}
