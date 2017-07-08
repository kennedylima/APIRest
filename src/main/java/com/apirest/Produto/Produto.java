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

    @Column
    @JsonView
    private  String url;

    public Produto(String descricao, double valor, String url) {
        this.descricao = descricao;
        this.valor = valor;
        this.url = url;
    }

    public Produto() { }
}

