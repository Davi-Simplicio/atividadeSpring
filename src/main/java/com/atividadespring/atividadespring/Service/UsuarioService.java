package com.atividadespring.atividadespring.Service;

import com.atividadespring.atividadespring.Model.DTO.CertificadoEdicaoDTO;
import com.atividadespring.atividadespring.Model.DTO.CursoCadastroDTO;
import com.atividadespring.atividadespring.Model.DTO.UsuarioCadastroDTO;
import com.atividadespring.atividadespring.Model.DTO.UsuarioEdicaoDTO;
import com.atividadespring.atividadespring.Model.Entity.Curso;
import com.atividadespring.atividadespring.Model.Entity.Usuario;
import com.atividadespring.atividadespring.Repository.CursoRepository;
import com.atividadespring.atividadespring.Repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;
    public void cadastrar(UsuarioCadastroDTO usuarioCadastroDTO) throws Exception {
        try{
            Usuario usuario = new Usuario();
            BeanUtils.copyProperties(usuarioCadastroDTO,usuario);
            usuarioRepository.save(usuario);
        }catch (Exception exception){
            throw new Exception();
        }
    }
    public void editar(UsuarioEdicaoDTO usuarioEdicaoDTO) throws Exception {
        try{
            Usuario usuario = new Usuario();
            BeanUtils.copyProperties(usuarioEdicaoDTO,usuario);
            usuarioRepository.save(usuario);
        }catch (Exception exception){
            throw new Exception();
        }
    }
    public List<Usuario> buscarTodos(){
        return usuarioRepository.findAll();
    }
    public Usuario buscarUm(Long id){
        return usuarioRepository.findById(id).get();
    }
}
