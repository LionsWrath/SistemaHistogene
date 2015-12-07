/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD.Resultados;
import CRUD.Exames.*;

/**
 *
 * @author Caio
 */


public class HLA_B27 extends Resultados {
    
    private String pesquisa;
    public HLA_B27(){
        super(-1, null, null, null, null, null, null);
    }
    public HLA_B27(Exame exame, String obs, String metodo, String pesquisa) {
        super(exame.getId(), obs, metodo, exame.getCodigo(), exame.getTipo(), exame.getNome(), exame.getMaterial());
        this.pesquisa = pesquisa;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    
}
