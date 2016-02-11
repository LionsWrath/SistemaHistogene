/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD.SalaEquipamentos.Itens;

import java.util.Date;



/**
 *
 * @author Carlos
 */
public class Item {
    private String nome;
    private String localizacao;
    private int classificacao;
    private Date datamanutencao;

    public Item() {
    }

    public Item(String nome, String localizacao, int classificacao, Date datamanutencao) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.classificacao = classificacao;
        this.datamanutencao = datamanutencao;
    }

    public Date getDatamanutencao() {
        return datamanutencao;
    }

    public void setDatamanutencao(Date datamanutencao) {
        this.datamanutencao = datamanutencao;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
    
    
}
