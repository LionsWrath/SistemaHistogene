/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD.Materiais;

/**
 *
 * @author Juliano
 */
public class Materiais {
    private String modelo;
    private String fabricante;
    private String nome;
    private String tipo;
    private int quantidade;
    private String obs;
    private boolean status;
    
    public Materiais(){
        
    }
    
    public Materiais(String fabricante, String nome, String modelo, String tipo, int quantidade, String obs, boolean status){
        this.fabricante = fabricante;
        this.nome = nome;
        this.modelo = modelo;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.obs = obs;
        this.status = status;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
