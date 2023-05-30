package com.dio.guilherme.info.urb.service.impl;

import com.dio.guilherme.info.urb.entity.Report;
import com.dio.guilherme.info.urb.repository.ReportRepository;
import com.dio.guilherme.info.urb.service.IReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService implements IReportService {

    @Autowired
    private ReportRepository reportRepository;

    @Override
    public Iterable<Report> buscarTodos() {
        return reportRepository.findAll();
    }

    @Override
    public void removerPorId(Long id) {
        reportRepository.deleteById(id);
    }

    @Override
    public Report save(Report report) {
        reportRepository.save(report);
        return report;
    }

    @Override
    public void atualizar(Report report) {
        reportRepository.save(report);
    }
}
