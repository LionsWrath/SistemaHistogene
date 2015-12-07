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

public class CrossMatch extends Resultados {
    private String linft;
    private String linft_agh;
    private String linft_dtt;
    private String linft_agh_dtt;
    private String ac_linft;
    private String linfb;
    private String linfb_dtt;
    private String ac_linfb;
    
    public CrossMatch(){
        super(-1, null, null, null, null, null, null);
    }

    public CrossMatch(Exame exame, String conclusao, String metodo, String linft, String linft_agh, String linft_dtt, String linft_agh_dtt, String ac_linft, String linfb, String linfb_dtt, String ac_linfb) {
        super(exame.getId(), conclusao, metodo, exame.getCodigo(), exame.getTipo(), exame.getNome(), exame.getMaterial());
        this.linft = linft;
        this.linft_agh = linft_agh;
        this.linft_dtt = linft_dtt;
        this.linft_agh_dtt = linft_agh_dtt;
        this.ac_linft = ac_linft;
        this.linfb = linfb;
        this.linfb_dtt = linfb_dtt;
        this.ac_linfb = ac_linfb;

    }

    public String getLinft() {
        return linft;
    }

    public void setLinft(String linft) {
        this.linft = linft;
    }

    public String getLinft_agh() {
        return linft_agh;
    }

    public void setLinft_agh(String linft_agh) {
        this.linft_agh = linft_agh;
    }

    public String getLinft_dtt() {
        return linft_dtt;
    }

    public void setLinft_dtt(String linft_dtt) {
        this.linft_dtt = linft_dtt;
    }

    public String getLinft_agh_dtt() {
        return linft_agh_dtt;
    }

    public void setLinft_agh_dtt(String linft_agh_dtt) {
        this.linft_agh_dtt = linft_agh_dtt;
    }

    public String getAc_linft() {
        return ac_linft;
    }

    public void setAc_linft(String ac_linft) {
        this.ac_linft = ac_linft;
    }

    public String getLinfb() {
        return linfb;
    }

    public void setLinfb(String linfb) {
        this.linfb = linfb;
    }

    public String getLinfb_dtt() {
        return linfb_dtt;
    }

    public void setLinfb_dtt(String linfb_dtt) {
        this.linfb_dtt = linfb_dtt;
    }

    public String getAc_linfb() {
        return ac_linfb;
    }

    public void setAc_linfb(String ac_linfb) {
        this.ac_linfb = ac_linfb;
    }
    


    
    
}
