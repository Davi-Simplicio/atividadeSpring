package com.atividadespring.atividadespring.Service;

import com.atividadespring.atividadespring.Model.DTO.AulaCadastroDTO;
import com.atividadespring.atividadespring.Model.DTO.AulaEdicaoDTO;
import com.atividadespring.atividadespring.Model.DTO.CertificadoCadastroDTO;
import com.atividadespring.atividadespring.Model.DTO.CertificadoEdicaoDTO;
import com.atividadespring.atividadespring.Model.Entity.Aula;
import com.atividadespring.atividadespring.Model.Entity.Certificado;
import com.atividadespring.atividadespring.Repository.CertificadoRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CertificadoService {
    private CertificadoRepository certificadoRepository;
    private ModelMapper modelMapper;

    public void cadastrar(CertificadoCadastroDTO certificadoCadastroDTO) throws Exception {
        try{
            Certificado certificado = new Certificado();
            modelMapper.map(certificadoCadastroDTO,certificado);
            certificadoRepository.save(certificado);
        }catch (Exception exception){
            throw new Exception();
        }
    }
    public void editar(CertificadoEdicaoDTO certificadoEdicaoDTO,Long id) throws Exception {
        try{
            Certificado certificado = buscarUm(id);
            modelMapper.map(certificadoEdicaoDTO,certificado);
            certificadoRepository.save(certificado);
        }catch (Exception exception){
            throw new Exception();
        }
    }
    public List<Certificado> buscarTodos(Long userId){

        return certificadoRepository.findCertificadosByUsuario_Id(userId);
    }
    public Certificado buscarUm(Long id){
        return certificadoRepository.findById(id).get();
    }
}
