package com.atividadespring.atividadespring.Service;

import com.atividadespring.atividadespring.Model.DTO.AulaCadastroDTO;
import com.atividadespring.atividadespring.Model.DTO.AulaEdicaoDTO;
import com.atividadespring.atividadespring.Model.DTO.CertificadoCadastroDTO;
import com.atividadespring.atividadespring.Model.DTO.CertificadoEdicaoDTO;
import com.atividadespring.atividadespring.Model.Entity.Aula;
import com.atividadespring.atividadespring.Model.Entity.Certificado;
import com.atividadespring.atividadespring.Repository.CertificadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CertificadoService {
    private CertificadoRepository certificadoRepository;
    public void cadastrar(CertificadoCadastroDTO certificadoCadastroDTO) throws Exception {
        try{
            Certificado certificado = new Certificado();
            BeanUtils.copyProperties(certificadoCadastroDTO,certificado);
            certificadoRepository.save(certificado);
        }catch (Exception exception){
            throw new Exception();
        }
    }
    public void editar(CertificadoEdicaoDTO certificadoEdicaoDTO) throws Exception {
        try{
            Certificado certificado = new Certificado();
            BeanUtils.copyProperties(certificadoEdicaoDTO,certificado);
            certificadoRepository.save(certificado);
        }catch (Exception exception){
            throw new Exception();
        }
    }
    public List<Certificado> buscarTodos(){
        return certificadoRepository.findAll();
    }
    public Certificado buscarUm(Long id){
        return certificadoRepository.findById(id).get();
    }
}
