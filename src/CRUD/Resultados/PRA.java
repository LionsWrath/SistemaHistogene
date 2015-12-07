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

public class PRA extends Resultados {
    private String ci;
    private String cii;

    public PRA(int id, String obs, String metodo, String codigo, String exame, String nome, String material) {
        super(id, obs, metodo, codigo, exame, nome, material);
    }
    
    public PRA(){super(-1, null, null, null, null, null, null);
    }

    public PRA(Exame exame, String obs, String metodo, String ci, String cii) {
        super(exame.getId(), obs, metodo, exame.getCodigo(), exame.getTipo(), exame.getNome(), exame.getMaterial());
        this.ci = ci;
        this.cii = cii;
    }


    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCii() {
        return cii;
    }

    public void setCii(String cii) {
        this.cii = cii;
    }
    
}
