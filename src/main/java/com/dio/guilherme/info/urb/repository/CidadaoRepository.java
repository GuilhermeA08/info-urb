package com.dio.guilherme.info.urb.repository;


import com.dio.guilherme.info.urb.entity.Cidadao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  CidadaoRepository extends CrudRepository<Cidadao, Long> {
}
