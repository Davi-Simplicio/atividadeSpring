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
@RequestMapping("/api/courses/{courseid}/lessons")
public class AulaController {

    private AulaService aulaService;

    @PostMapping
    public ResponseEntity<Aula> cadastrar(@RequestBody AulaCadastroDTO aulaCadastroDTO, @PathVariable Long courseid){
        try{
            return new ResponseEntity<>(aulaService.cadastrar(aulaCadastroDTO,courseid),HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping("{id}")
    public ResponseEntity<Aula> editar(@RequestBody AulaEdicaoDTO aulaEdicaoDTO, @PathVariable Long id, @PathVariable Long courseid){
        try{
            return new ResponseEntity<>(aulaService.editar(aulaEdicaoDTO,id,courseid),HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
