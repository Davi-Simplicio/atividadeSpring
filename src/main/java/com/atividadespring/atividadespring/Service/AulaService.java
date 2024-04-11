package com.atividadespring.atividadespring.Service;

import com.atividadespring.atividadespring.Model.DTO.AulaCadastroDTO;
import com.atividadespring.atividadespring.Model.DTO.AulaEdicaoDTO;
import com.atividadespring.atividadespring.Model.Entity.Aula;
import com.atividadespring.atividadespring.Model.Entity.Curso;
import com.atividadespring.atividadespring.Repository.AulaRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AulaService {
    private AulaRepository aulaRepository;
    private ModelMapper modelMapper;
    private CursoService cursoService;
    public Aula cadastrar(AulaCadastroDTO aulaCadastroDTO,Long courseId) throws Exception {
        try{
            Aula aula = new Aula();
            modelMapper.map(aulaCadastroDTO,aula);
            Curso curso = cursoService.buscarUm(courseId);
            aula.setCurso(curso);
            return aulaRepository.save(aula);
        }catch (Exception exception){
            throw new Exception();
        }
    }
    public Aula editar(AulaEdicaoDTO aulaEdicaoDTO,Long id,Long courseId) throws Exception {
        try{
            Aula aula = buscarUm(id);
            modelMapper.map(aulaEdicaoDTO,aula);
            Curso curso = cursoService.buscarUm(courseId);
            return aulaRepository.save(aula);
        }catch (Exception exception){
            throw new Exception();
        }
    }
    public List<Aula> buscarTodos(){
        return aulaRepository.findAll();
    }
    public Aula buscarUm(Long id){
        return aulaRepository.findById(id).get();
    }

}
