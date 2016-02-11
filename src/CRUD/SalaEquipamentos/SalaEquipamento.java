/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD.SalaEquipamentos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Carlos
 */
public class SalaEquipamento {
    private String item;
    private int temperatura;
    private Date datamedicao;


    public SalaEquipamento() {
    }

    public SalaEquipamento(String item, int temperatura) {
        this.item = item;
        this.temperatura = temperatura;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        this.datamedicao = date;

    }
    
    

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public Date getDatamedicao() {
        return datamedicao;
    }

    public void setDatamedicao(Date datamedicao) {
        this.datamedicao = datamedicao;
    }


    
    
}
