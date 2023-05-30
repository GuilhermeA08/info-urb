package com.dio.guilherme.info.urb.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.util.List;

@Getter
@Setter
@Entity
public class Cidadao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @CPF
    private String cpf;
    private String email;
    private String password;
    @OneToMany(mappedBy = "cidadao")
    private List<Report> reports;
}
