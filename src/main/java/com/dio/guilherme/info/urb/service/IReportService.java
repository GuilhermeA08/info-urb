package com.dio.guilherme.info.urb.service;


import com.dio.guilherme.info.urb.entity.Report;

public interface IReportService {

    Iterable<Report> buscarTodos();

    void removerPorId(Long id);

    Report save(Report report);

    void atualizar(Report report);
}
