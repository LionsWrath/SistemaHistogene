/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD.Pacientes;

import com.psw.conexao.HibernateUtil;
import Principal.CadastrarTemplate;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ricardo
 */
public class CadastrarPaciente2 extends CadastrarTemplate {
    
    public boolean checkfield(){
        if (this.cpf.getText().equals("") || this.nome.getText().equals("") || this.rg.getText().equals("") || this.cidade.getText().equals("") || this.endereco.getText().equals("")  || this.cep.getText().equals("") || this.dia.getText().equals("") || this.mes.getText().equals("") || this.ano.getText().equals("") || this.telres.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Os campos obrigatorios nao foram preenchidos!");
            return false;
        }
        else {
            return true;
        }
    }
    
    @Override
    public void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {  
         if (checkfield()){
            
            boolean erros = false;
            
            String nomestr = this.nome.getText();
            String[] array = nomestr.split(" ");
            if (array.length == 1){
                
                JOptionPane.showMessageDialog(null, "Nome deve ser composto de no minimo NOME e SOBRENOME");
                erros = true;
            }
            else if(checkcpf(this.cpf.getText())){
                JOptionPane.showMessageDialog(null, "Esse CPF ja esta cadastrado!");
                erros = true;
            }
            else if (!erros){
                String primeironome = "";
                String meionome = "";
                String ultimonome = "";
                if (array.length == 2){
                    
                    primeironome = array[0];
                    ultimonome = array[1];
                }
                else{
                    
                    primeironome = array[0];
                    meionome = array[1];
                    ultimonome = array[array.length-1];
                }
                String datanascimento = dia.getText() + "/" + mes.getText() + "/" + ano.getText();
                String sex = sexo.getSelection().getActionCommand();


                String cpf = this.cpf.getText();
                String rg = this.rg.getText();
                String endereco = this.endereco.getText();
                String cep = this.cep.getText();
                String cidade = this.cidade.getText();
                String estado = this.estado.getSelectedItem().toString();
                String telres = this.telres.getText();
                String telcom = this.telcom.getText();
                String telcel = this.telcel.getText();
                String obs = this.obs.getText();
                
                Paciente paciente = new Paciente(primeironome, meionome, ultimonome, datanascimento, sex, cpf, rg, endereco, cep, cidade, estado, telres, telcom, telcel, obs);
                Session sessao = null;
                Transaction transacao = null;
                try{

                    sessao = HibernateUtil.getSessionFactory().openSession();
                    transacao = sessao.beginTransaction();
                    sessao.save(paciente);
                    transacao.commit();
                }
                catch (HibernateException e) {
                    System.out.println("Não foi possível inserir o contato. Erro: "+ e.getMessage());
                } finally {
                        try {
                            sessao.close();
                        } catch (Throwable e) {
                            System.out.println("Erro ao fechar operação de inserção, Mensagem: "+ e.getMessage());
                            }
                    }
                
                
                JOptionPane.showMessageDialog(null, "Cadastro Realizado com sucesso!");
                this.dispose();
            }
        }
            
            
    }
    

}
