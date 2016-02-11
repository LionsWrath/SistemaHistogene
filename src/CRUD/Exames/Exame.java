/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD.Exames;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Carlos
 */

public class Exame {

    private int id;
    private String nome;
    private String datacol;
    private Date data;
    private String codigo;
    private String tipo;
    private String material;
    private String convenio;
    private String centro;
    private boolean pago;
    
    public Exame(){}

    public Exame(String nome, String data, String codigo, String tipo, String material, String convenio, String centro, boolean pago) {
        this.nome = nome;
        this.datacol = data;
        this.codigo = codigo;
        this.tipo = tipo;
        this.material = material;
        this.convenio = convenio;
        this.centro = centro;
        this.pago = pago;
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        this.data = date;
    }
    

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean getPago() {
        return this.pago;
    }

    public void setPago(boolean pagamento) {
        this.pago = pagamento;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatacol() {
        return datacol;
    }

    public void setDatacol(String data) {
        this.datacol = data;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
}
