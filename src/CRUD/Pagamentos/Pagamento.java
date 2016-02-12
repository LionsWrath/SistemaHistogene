/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD.Pagamentos;

/**
 *
 * @author Caio
 */
public class Pagamento {
    private int idPagamento;
    private int numNF;
    private String codExame;
    private float valor;
    private boolean formaPagamento; // 0 = a prazo e 1 = a vista
    private short nParcelas;
    private String dataPagamento;
    private boolean ativo; // 1 = pago e 0 = !pago
    private short parcelasPago;
    
    
    
    public Pagamento(){
        
    }
    
    public Pagamento(int idPag, String codigo, float valor, boolean formaPag, short nParc, String dataPag){
        this.idPagamento = idPag;
        this.codExame = codigo;
        this.valor = valor;
        this.formaPagamento = formaPag;
        this.nParcelas = nParc;
        this.dataPagamento = dataPag;
        this.ativo = true;
        this.parcelasPago = 1;
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public int getNumNF() {
        return numNF;
    }

    public void setNumNF(int numNF) {
        this.numNF = numNF;
    }

    public String getCodExame() {
        return codExame;
    }

    public void setCodExame(String codExame) {
        this.codExame = codExame;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(boolean formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public short getnParcelas() {
        return nParcelas;
    }

    public void setnParcelas(short nParcelas) {
        this.nParcelas = nParcelas;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public short getParcelasPago() {
        return parcelasPago;
    }

    public void setParcelasPago(short parcelasPago) {
        this.parcelasPago = parcelasPago;
    }
    
    
}
