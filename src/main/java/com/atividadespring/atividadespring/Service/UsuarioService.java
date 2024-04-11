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
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;
    private ModelMapper modelMapper;

    public Usuario cadastrar(UsuarioCadastroDTO usuarioCadastroDTO) throws Exception {
        try{
            Usuario usuario = new Usuario();
            modelMapper.map(usuarioCadastroDTO,usuario);
            return usuarioRepository.save(usuario);
        }catch (Exception exception){
            throw new Exception();
        }
    }
    public Usuario editar(UsuarioEdicaoDTO usuarioEdicaoDTO, Long id) throws Exception {
        try{
            Usuario usuario = buscarUm(id);
            modelMapper.map(usuarioEdicaoDTO,usuario);
            return usuarioRepository.save(usuario);
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
