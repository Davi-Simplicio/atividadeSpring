package com.atividadespring.atividadespring.Service;

import com.atividadespring.atividadespring.Model.DTO.AulaCadastroDTO;
import com.atividadespring.atividadespring.Model.DTO.AulaEdicaoDTO;
import com.atividadespring.atividadespring.Model.Entity.Aula;
import com.atividadespring.atividadespring.Repository.AulaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AulaService {
    private AulaRepository aulaRepository;

    public void cadastrar(AulaCadastroDTO aulaCadastroDTO) throws Exception {
        try{
            Aula aula = new Aula();
            BeanUtils.copyProperties(aulaCadastroDTO,aula);
            aulaRepository.save(aula);
        }catch (Exception exception){
            throw new Exception();
        }
    }
    public void editar(AulaEdicaoDTO aulaEdicaoDTO) throws Exception {
        try{
            Aula aula = new Aula();
            BeanUtils.copyProperties(aulaEdicaoDTO,aula);
            aulaRepository.save(aula);
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
