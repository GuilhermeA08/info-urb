package com.dio.guilherme.info.urb.controller;


import com.dio.guilherme.info.urb.entity.Report;
import com.dio.guilherme.info.urb.service.impl.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/report")
public class ReportRestController {
    @Autowired
    private ReportService reportService;

    @GetMapping
    public ResponseEntity<Iterable<Report>> buscarTodos(){
        return ResponseEntity.ok(reportService.buscarTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerPorId(@PathVariable Long id){
        reportService.removerPorId(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Report> salvar(@RequestBody Report report){
        return ResponseEntity.ok(reportService.save(report));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Report> atualizar(@PathVariable Long id, @RequestBody Report report){
        report.setId(id);
        return ResponseEntity.ok(reportService.save(report));
    }
}
