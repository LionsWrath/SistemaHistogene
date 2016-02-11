/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD.Pacientes;

import com.psw.conexao.HibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.*;
/**
 *
 * @author Caio
 */
public class VisualizarPaciente extends CadastrarPaciente2{
    private final Paciente paciente;
    public VisualizarPaciente(Paciente pac){
        paciente = pac;        
        jLabel1.setText("Editar Paciente");
        jButton1.setText("Editar");
        this.nome.setText(pac.getPrimeironome() + " " + pac.getMeionome() + " " + pac.getUltimonome());
        String[] datanascimento = pac.getDatanasc().split("/");
        this.dia.setText(datanascimento[0]);
        this.mes.setText(datanascimento[1]);
        this.ano.setText(datanascimento[2]);
        this.rg.setText(pac.getRg());
        this.cpf.setText(pac.getCpf());
        this.cep.setText(pac.getCep());
        this.obs.setText(pac.getObs());
        this.endereco.setText(pac.getEndereco());
        this.cidade.setText(pac.getCidade());
        this.estado.setSelectedItem(pac.getEstado());
        this.telres.setText(pac.getTelres());
        this.telcom.setText(pac.getTelcom());
        this.telcel.setText(pac.getTelcel());
        String sexoo = pac.getSex();
        if (sexoo.equals("Masculino")){
            this.masculino.setSelected(true);
        }
        else{
            this.feminino.setSelected(true);
            
        }
        //if (user.isAdm()){
            //this.administrador.setSelected(true);
        //}
        
        this.nome.setEnabled(false);
        this.dia.setEnabled(false);
        this.mes.setEnabled(false);
        this.ano.setEnabled(false);
        this.endereco.setEnabled(false);
        this.rg.setEnabled(false);
        this.cpf.setEnabled(false);
        this.cep.setEnabled(false);
        this.estado.setEnabled(false);
        this.cidade.setEnabled(false);
        this.masculino.setEnabled(false);
        this.feminino.setEnabled(false);
        this.login.setEnabled(false);
        this.senha.setEnabled(false);
        this.telres.setEnabled(false);
        this.telcom.setEnabled(false);
        this.telcel.setEnabled(false);
        this.obs.setEnabled(false);
                }
    @Override
    public void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jButton1.getText().equals("Editar")) {
                this.nome.setEnabled(true);
                this.dia.setEnabled(true);
                this.mes.setEnabled(true);
                this.ano.setEnabled(true);
                this.endereco.setEnabled(true);
                this.rg.setEnabled(true);
                this.cpf.setEnabled(true);
                this.cep.setEnabled(true);
                this.estado.setEnabled(true);
                this.cidade.setEnabled(true);
                this.masculino.setEnabled(true);
                this.feminino.setEnabled(true);
                this.senha.setEnabled(true);
                this.telres.setEnabled(true);
                this.telcom.setEnabled(true);
                this.telcel.setEnabled(true);
                this.obs.setEnabled(true);
                jButton1.setText("Atualizar");
        }
        else if (jButton1.getText().equals("Atualizar")){
                if (checkfield()) {
                    
                    boolean erros = false;
                    
                    String nomestr = this.nome.getText();
                    String[] array = nomestr.split(" ");
                    if (array.length == 1) {
                        
                        JOptionPane.showMessageDialog(null, "Nome deve ser composto de no minimo NOME e SOBRENOME");
                        erros = true;
                    } else if (checkcpf(this.cpf.getText())) {
                        JOptionPane.showMessageDialog(null, "Esse CPF ja esta cadastrado!");
                        erros = true;
                    } else if (!erros) {
                        String primeironome = "";
                        String meionome = "";
                        String ultimonome = "";
                        if (array.length == 2) {
                            
                            primeironome = array[0];
                            ultimonome = array[1];
                        } else {
                            
                            primeironome = array[0];
                            meionome = array[1];
                            ultimonome = array[array.length - 1];
                        }
                        
                        paciente.setCep(this.cep.getText());
                        paciente.setCidade(this.cidade.getText());
                        paciente.setCpf(this.cpf.getText());
                        paciente.setEndereco(this.endereco.getText());
                        
                        paciente.setEstado(this.estado.getSelectedItem().toString());
                        paciente.setObs(this.obs.getText());
                        
                        paciente.setRg(this.rg.getText());
                        paciente.setSex(this.sexo.getSelection().getActionCommand());
                        paciente.setTelcel(this.telcel.getText());
                        paciente.setTelres(this.telres.getText());
                        paciente.setTelcom(this.telcom.getText());
                        paciente.setPrimeironome(primeironome);
                        paciente.setMeionome(meionome);
                        paciente.setUltimonome(ultimonome);
                        
                        String datanascimento = dia.getText() + "/" + mes.getText() + "/" + ano.getText();
                        paciente.setDatanasc(datanascimento);
                        Session sessao = null;
                        Transaction transacao = null;
                        try {
                            
                            sessao = HibernateUtil.getSessionFactory().openSession();
                            transacao = sessao.beginTransaction();
                            sessao.update(paciente);
                            transacao.commit();
                        } catch (HibernateException e) {
                            System.out.println("Não foi possível inserir o contato. Erro: " + e.getMessage());
                        } finally {
                            try {
                                sessao.close();
                            } catch (Throwable e) {
                                System.out.println("Erro ao fechar operação de inserção, Mensagem: " + e.getMessage());
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Cadastro Realizado com sucesso!");
                        this.dispose();
                        
                    }
                }   
        }
    }
}

    

