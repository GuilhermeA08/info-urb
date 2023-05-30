package com.dio.guilherme.info.urb.controller;


import com.dio.guilherme.info.urb.entity.Cidadao;
import com.dio.guilherme.info.urb.service.impl.CidadaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cidadao")
public class CidadaoRestController {

    @Autowired
    private CidadaoService cidadaoService;

    @GetMapping
    public ResponseEntity<Iterable<Cidadao>> buscarTodos(){
        return ResponseEntity.ok(cidadaoService.buscarTodos());
    }

    @GetMapping("{id}")
    public ResponseEntity<Cidadao> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(cidadaoService.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerPorId(@PathVariable Long id){
        cidadaoService.removerPorId(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Cidadao> salvar(@RequestBody Cidadao cidadao){
        return ResponseEntity.ok(cidadaoService.save(cidadao));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cidadao> atualizar(@PathVariable Long id, @RequestBody Cidadao cidadao){
        cidadao.setId(id);
        return ResponseEntity.ok(cidadaoService.save(cidadao));
    }
}
