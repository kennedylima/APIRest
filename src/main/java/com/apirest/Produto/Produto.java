package com.apirest.Produto;

import com.apirest.EntidadeBase;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Produto extends EntidadeBase {
    @Column
    @JsonView
    private  String descricao;

    @Column
    @JsonView
    private  double valor;

    public Produto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public Produto() { }
}

