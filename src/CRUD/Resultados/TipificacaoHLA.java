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

public class TipificacaoHLA extends Resultados {
    private String compatibilidade;
    private String a1, a2, a3, a4, b1, b2, b3, b4, c1, c2, c3, c4, dr1, dr2, dr3, dr4, dq1, dq2, dq3, dq4;
    
    public TipificacaoHLA(){
        super(-1, null, null, null, null, null, null);
    }
    
    public TipificacaoHLA(Exame exame, String obs, String metodo, String compatibilidade, String a1, String a2, String a3, String a4, String b1, String b2, String b3, String b4, String c1, String c2, String c3, String c4, String dr1, String dr2, String dr3, String dr4, String dq1, String dq2, String dq3, String dq4){
        super(exame.getId(), obs, metodo, exame.getCodigo(), exame.getTipo(), exame.getNome(), exame.getMaterial());
        this.compatibilidade = compatibilidade;;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b4 = b4;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.dr1 = dr1;
        this.dr2 = dr2;
        this.dr3 = dr3;
        this.dr4 = dr4;
        this.dq1 = dq1;
        this.dq2 = dq2;
        this.dq3 = dq3;
        this.dq4 = dq4;
    }




    public String getCompatibilidade() {
        return compatibilidade;
    }

    public void setCompatibilidade(String compatibilidade) {
        this.compatibilidade = compatibilidade;
    }



    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    public String getB1() {
        return b1;
    }

    public void setB1(String b1) {
        this.b1 = b1;
    }

    public String getB2() {
        return b2;
    }

    public void setB2(String b2) {
        this.b2 = b2;
    }

    public String getB3() {
        return b3;
    }

    public void setB3(String b3) {
        this.b3 = b3;
    }

    public String getB4() {
        return b4;
    }

    public void setB4(String b4) {
        this.b4 = b4;
    }

    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public String getC2() {
        return c2;
    }

    public void setC2(String c2) {
        this.c2 = c2;
    }

    public String getC3() {
        return c3;
    }

    public void setC3(String c3) {
        this.c3 = c3;
    }

    public String getC4() {
        return c4;
    }

    public void setC4(String c4) {
        this.c4 = c4;
    }

    public String getDr1() {
        return dr1;
    }

    public void setDr1(String dr1) {
        this.dr1 = dr1;
    }

    public String getDr2() {
        return dr2;
    }

    public void setDr2(String dr2) {
        this.dr2 = dr2;
    }

    public String getDr3() {
        return dr3;
    }

    public void setDr3(String dr3) {
        this.dr3 = dr3;
    }

    public String getDr4() {
        return dr4;
    }

    public void setDr4(String dr4) {
        this.dr4 = dr4;
    }

    public String getDq1() {
        return dq1;
    }

    public void setDq1(String dq1) {
        this.dq1 = dq1;
    }

    public String getDq2() {
        return dq2;
    }

    public void setDq2(String dq2) {
        this.dq2 = dq2;
    }

    public String getDq3() {
        return dq3;
    }

    public void setDq3(String dq3) {
        this.dq3 = dq3;
    }

    public String getDq4() {
        return dq4;
    }

    public void setDq4(String dq4) {
        this.dq4 = dq4;
    }
    
}
