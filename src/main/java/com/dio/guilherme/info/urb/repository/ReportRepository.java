package com.dio.guilherme.info.urb.repository;

import com.dio.guilherme.info.urb.entity.Report;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends CrudRepository<Report, Long>{
}
