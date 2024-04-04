package com.atividadespring.atividadespring.Controller;

import com.atividadespring.atividadespring.Model.DTO.CursoCadastroDTO;
import com.atividadespring.atividadespring.Model.DTO.CursoEdicaoDTO;
import com.atividadespring.atividadespring.Model.DTO.UsuarioCadastroDTO;
import com.atividadespring.atividadespring.Model.DTO.UsuarioEdicaoDTO;
import com.atividadespring.atividadespring.Model.Entity.Curso;
import com.atividadespring.atividadespring.Model.Entity.Usuario;
import com.atividadespring.atividadespring.Service.CursoService;
import com.atividadespring.atividadespring.Service.UsuarioService;
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
@RequestMapping("/usuario")
public class UsuarioController {
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> cadastrar(@RequestBody UsuarioCadastroDTO usuarioCadastroDTO){
        try{
            usuarioService.cadastrar(usuarioCadastroDTO);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping
    public ResponseEntity<Usuario> editar(@RequestBody UsuarioEdicaoDTO usuarioEdicaoDTO){
        try{
            usuarioService.editar(usuarioEdicaoDTO);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping
    public List<Usuario> buscarTodos(){
        return usuarioService.buscarTodos();
    }
    @GetMapping("/{id}")
    public Usuario buscarUm(@PathVariable Long id){
        return usuarioService.buscarUm(id);
    }
}
