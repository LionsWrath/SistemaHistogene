/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD.Pacientes;

/**
 *
 * @author Ricardo
 */
public class Paciente {
    private String primeironome;
    private String meionome;
    private String ultimonome;
    private String datanasc;
    private String sex;
    private String cpf;
    private String rg;
    private String endereco;
    private String cep;
    private String cidade;
    private String estado;
    private String telres;
    private String telcom;
    private String telcel;
    private String obs;

    public Paciente() {
    }

    public Paciente(String primeironome, String meionome, String ultimonome, String datanasc, String sex, String cpf, String rg, String endereco, String cep, String cidade, String estado, String telres, String telcom, String telcel, String obs) {
        this.primeironome = primeironome;
        this.meionome = meionome;
        this.ultimonome = ultimonome;
        this.datanasc = datanasc;
        this.sex = sex;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.telres = telres;
        this.telcom = telcom;
        this.telcel = telcel;
        this.obs = obs;
    }

    public String getPrimeironome() {
        return primeironome;
    }

    public void setPrimeironome(String primeironome) {
        this.primeironome = primeironome;
    }

    public String getMeionome() {
        return meionome;
    }

    public void setMeionome(String meionome) {
        this.meionome = meionome;
    }

    public String getUltimonome() {
        return ultimonome;
    }

    public void setUltimonome(String ultimonome) {
        this.ultimonome = ultimonome;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelres() {
        return telres;
    }

    public void setTelres(String telres) {
        this.telres = telres;
    }

    public String getTelcom() {
        return telcom;
    }

    public void setTelcom(String telcom) {
        this.telcom = telcom;
    }

    public String getTelcel() {
        return telcel;
    }

    public void setTelcel(String telcel) {
        this.telcel = telcel;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
}
