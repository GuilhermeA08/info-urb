package com.dio.guilherme.info.urb.service;

import com.dio.guilherme.info.urb.entity.Cidadao;


public interface ICidadaoService {

    Cidadao save(Cidadao cidadao);
    Cidadao buscarPorId(Long id);
    Iterable<Cidadao> buscarTodos();
    void removerPorId(Long id);
    void atualizar(Cidadao cidadao);
}
