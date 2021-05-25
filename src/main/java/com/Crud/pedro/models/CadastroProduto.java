package com.Crud.pedro.models;


import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class CadastroProduto {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @NotBlank(message = "{nome.not.blank}")
    private String nome;
    @NotBlank(message = "{descricao.not.blank}")
    private String descricao;
    @Range(min = 1, max = 200)
    private int valor;
    @Range(min = 1, max = 200)
    private int quantidade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }





}
