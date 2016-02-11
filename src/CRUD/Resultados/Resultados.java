/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD.Resultados;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Caio
 */

public class Resultados {
    

    private int id;
    private String obs;
    private String metodo;
    private Date data;
    
    public Resultados(){};

    public Resultados(int id, String obs, String metodo, String codigo, String exame, String nome, String material) {

        this.id = id;
        this.obs = obs;
        this.metodo = metodo;
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
    
    public static void ConsultaResultados(String idbusca){
        
    }
    
    public static void CadastrarResultados(String idbusca){
    
    }
    
    public int getId() {
        return id;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public void setId(int id) {
        this.id = id;
    }
}
