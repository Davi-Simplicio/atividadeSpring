package com.atividadespring.atividadespring.Service;

import com.atividadespring.atividadespring.Model.DTO.CertificadoCadastroDTO;
import com.atividadespring.atividadespring.Model.DTO.CertificadoEdicaoDTO;
import com.atividadespring.atividadespring.Model.DTO.CursoCadastroDTO;
import com.atividadespring.atividadespring.Model.DTO.CursoEdicaoDTO;
import com.atividadespring.atividadespring.Model.Entity.Certificado;
import com.atividadespring.atividadespring.Model.Entity.Curso;
import com.atividadespring.atividadespring.Repository.CertificadoRepository;
import com.atividadespring.atividadespring.Repository.CursoRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CursoService {
    private CursoRepository cursoRepository;
    private ModelMapper modelMapper;

    public Curso cadastrar(CursoCadastroDTO cursoCadastroDTO) throws Exception {
        try{
            Curso curso = new Curso();
            modelMapper.map(cursoCadastroDTO,curso);
            return cursoRepository.save(curso);
        }catch (Exception exception){
            throw new Exception();
        }
    }
    public Curso editar(CursoEdicaoDTO cursoEdicaoDTO,Long id) throws Exception {
        try{
            Curso curso = buscarUm(id);
            modelMapper.map(cursoEdicaoDTO,curso);
            return cursoRepository.save(curso);
        }catch (Exception exception){
            throw new Exception();
        }
    }
    public List<Curso> buscarTodos(){
        return cursoRepository.findAll();
    }
    public Curso buscarUm(Long id){
        return cursoRepository.findById(id).get();
    }
}
