package com.dio.guilherme.info.urb.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message = "A descrição é obrigatória")
    private String descricao;
    @NotNull(message = "O endereço é obrigatório")
    private String endereco;
    @NotNull(message = "A foto é obrigatória")
    private String foto;

    @ManyToOne
    @JoinColumn(name = "cidadao_id")
    private Cidadao cidadao;

}
