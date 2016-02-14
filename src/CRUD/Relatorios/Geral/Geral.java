/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD.Relatorios.Geral;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ricardo
 */
public class Geral {
    private int qtdecrossmatch;
    private int qtdetipificacao;
    private int qtdepra;
    private int qtdeb27;
    private int qtderesultadoscrossmatch;
    private int qtderesultadostipificacao;
    private int qtderesultadospra;
    private int qtderesultadosb27;
    private float valorbruto;
    private float valorcompras;
    private float mediacrossmatch;
    private float mediatipificacao;
    private float mediapra;
    private float mediab27;

    public Geral(int qtdecrossmatch, int qtdetipificacao, int qtdepra, int qtdeb27, int qtderesultadoscrossmatch, int qtderesultadostipificacao, int qtderesultadospra, int qtderesultadosb27, float valorbruto, float valorcompras, float mediacrossmatch, float mediatipificacao, float mediapra, float mediab27, Date inicio, Date fim) {
        this.qtdecrossmatch = qtdecrossmatch;
        this.qtdetipificacao = qtdetipificacao;
        this.qtdepra = qtdepra;
        this.qtdeb27 = qtdeb27;
        this.qtderesultadoscrossmatch = qtderesultadoscrossmatch;
        this.qtderesultadostipificacao = qtderesultadostipificacao;
        this.qtderesultadospra = qtderesultadospra;
        this.qtderesultadosb27 = qtderesultadosb27;
        this.valorbruto = valorbruto;
        this.valorcompras = valorcompras;
        this.mediacrossmatch = mediacrossmatch;
        this.mediatipificacao = mediatipificacao;
        this.mediapra = mediapra;
        this.mediab27 = mediab27;
        this.inicio = inicio;
        this.fim = fim;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        this.datarelatorio = date;
    }
    
    

    public int getQtdecrossmatch() {
        return qtdecrossmatch;
    }

    public void setQtdecrossmatch(int qtdecrossmatch) {
        this.qtdecrossmatch = qtdecrossmatch;
    }

    public int getQtdetipificacao() {
        return qtdetipificacao;
    }

    public void setQtdetipificacao(int qtdetipificacao) {
        this.qtdetipificacao = qtdetipificacao;
    }

    public int getQtdepra() {
        return qtdepra;
    }

    public void setQtdepra(int qtdepra) {
        this.qtdepra = qtdepra;
    }

    public int getQtdeb27() {
        return qtdeb27;
    }

    public void setQtdeb27(int qtdeb27) {
        this.qtdeb27 = qtdeb27;
    }

    public int getQtderesultadoscrossmatch() {
        return qtderesultadoscrossmatch;
    }

    public void setQtderesultadoscrossmatch(int qtderesultadoscrossmatch) {
        this.qtderesultadoscrossmatch = qtderesultadoscrossmatch;
    }

    public int getQtderesultadostipificacao() {
        return qtderesultadostipificacao;
    }

    public void setQtderesultadostipificacao(int qtderesultadostipificacao) {
        this.qtderesultadostipificacao = qtderesultadostipificacao;
    }

    public int getQtderesultadospra() {
        return qtderesultadospra;
    }

    public void setQtderesultadospra(int qtderesultadospra) {
        this.qtderesultadospra = qtderesultadospra;
    }

    public int getQtderesultadosb27() {
        return qtderesultadosb27;
    }

    public void setQtderesultadosb27(int qtderesultadosb27) {
        this.qtderesultadosb27 = qtderesultadosb27;
    }

    public float getValorbruto() {
        return valorbruto;
    }

    public void setValorbruto(float valorbruto) {
        this.valorbruto = valorbruto;
    }

    public float getValorcompras() {
        return valorcompras;
    }

    public void setValorcompras(float valorcompras) {
        this.valorcompras = valorcompras;
    }

    public float getMediacrossmatch() {
        return mediacrossmatch;
    }

    public void setMediacrossmatch(float mediacrossmatch) {
        this.mediacrossmatch = mediacrossmatch;
    }

    public float getMediatipificacao() {
        return mediatipificacao;
    }

    public void setMediatipificacao(float mediatipificacao) {
        this.mediatipificacao = mediatipificacao;
    }

    public float getMediapra() {
        return mediapra;
    }

    public void setMediapra(float mediapra) {
        this.mediapra = mediapra;
    }

    public float getMediab27() {
        return mediab27;
    }

    public void setMediab27(float mediab27) {
        this.mediab27 = mediab27;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public Date getDatarelatorio() {
        return datarelatorio;
    }

    public void setDatarelatorio(Date datarelatorio) {
        this.datarelatorio = datarelatorio;
    }
    private Date inicio;
    private Date fim;
    private Date datarelatorio;
    
}
