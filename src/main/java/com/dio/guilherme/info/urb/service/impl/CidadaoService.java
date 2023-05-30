package com.dio.guilherme.info.urb.service.impl;

import com.dio.guilherme.info.urb.entity.Cidadao;
import com.dio.guilherme.info.urb.repository.CidadaoRepository;
import com.dio.guilherme.info.urb.service.ICidadaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CidadaoService implements ICidadaoService {
    @Autowired
    private CidadaoRepository cidadaoRepository;


    @Override
    public Cidadao save(Cidadao cidadao) {
        cidadaoRepository.save(cidadao);
        return cidadao;
    }

    @Override
    public Cidadao buscarPorId(Long id) {
        Optional<Cidadao> cidadao = cidadaoRepository.findById(id);
        return cidadao.orElse(null);
    }

    @Override
    public Iterable<Cidadao> buscarTodos() {
         return cidadaoRepository.findAll();
    }

    @Override
    public void removerPorId(Long id) {
        cidadaoRepository.deleteById(id);
    }

    @Override
    public void atualizar(Cidadao cidadao) {
        cidadaoRepository.save(cidadao);
    }
}
