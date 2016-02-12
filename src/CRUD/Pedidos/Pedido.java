/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD.Pedidos;

/**
 *
 * @author Ricardo
 */
public class Pedido {
    private int pedido_id;
    private String nomeproduto;
    private String nomefabricante;
    private String modelo;
    private String quantidade;
    private String valor;
    private String datapedido;
    private String obs;
  
    public Pedido(){
        
    }
    
    public Pedido(String nomeproduto, String nomefabricante, String modelo, String quantidade, String valor, String datapedido, String obs){
        
        this.nomeproduto = nomeproduto;
        this.nomefabricante = nomefabricante;
        this.modelo = modelo;
        this.quantidade = quantidade;
        this.valor = valor;
        this.obs = obs;
        this.datapedido = datapedido;

}

    public int getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(int pedido_id) {
        this.pedido_id = pedido_id;
    }


    public String getDatapedido() {
        return datapedido;
    }

    public void setDatapedido(String datapedido) {
        this.datapedido = datapedido;
    }

    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public String getNomefabricante() {
        return nomefabricante;
    }

    public void setNomefabricante(String nomefabricante) {
        this.nomefabricante = nomefabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    
}

