/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD.Pacientes;

import com.psw.conexao.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Caio
 */
public class ConsultarPaciente extends javax.swing.JFrame {
    private List listaIT = null;
    private Iterator iterador = null;
    /**
     * Creates new form ConsultarPaciente
     */
    public ConsultarPaciente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcao = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        rg = new javax.swing.JRadioButton();
        nome = new javax.swing.JRadioButton();
        rgpac = new javax.swing.JTextField();
        nomepac = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jScrollPane3.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Consultar Paciente");

        opcao.add(rg);
        rg.setText("RG");
        rg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgActionPerformed(evt);
            }
        });

        opcao.add(nome);
        nome.setText("Nome");
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        nomepac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomepacActionPerformed(evt);
            }
        });

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Visualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Excluir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("NOME");

        jLabel3.setText("CPF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nome)
                                .addGap(18, 18, 18)
                                .addComponent(nomepac, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rg)
                                .addGap(31, 31, 31)
                                .addComponent(rgpac, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton3)
                                    .addGap(64, 64, 64)
                                    .addComponent(jButton4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel3)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rg)
                    .addComponent(rgpac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(nomepac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Paciente paciente = null;
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            List lista = null;
            Iterator it = null;
            String primeironome2 = "";
            String meionome2 = "";
            String ultimonome2 = "";
            if (this.nome.isSelected()) {
                String[] nome = this.nomepac.getText().split(" ");
                if (nome.length == 2){
                    primeironome2 = nome[0];
                    meionome2 = "";
                    ultimonome2 = nome[1];
                }
                else if (nome.length >= 3){
                    primeironome2 = nome[0];
                    meionome2 = nome[1];
                    ultimonome2 = nome[2];
                }
                //setParameter("usuario", logintext.getText()).list();
                //setParameter("nome", primeironome2).list();
                lista = sessao.createQuery("from Paciente where primeironome = :primeironome").setParameter("primeironome", primeironome2).list();
                it = lista.iterator();
                transacao.commit();
            } else if (this.rg.isSelected()) {
                lista = sessao.createQuery("from Paciente where rg = :rg").setParameter("rg", this.rgpac.getText()).list();
                it = lista.iterator();
                transacao.commit();
            }
            DefaultListModel listModel = new DefaultListModel();
            listaIT = lista;
            
            //pacientex -> pac
            while (it.hasNext()) {
                Paciente pac = (Paciente) it.next();
                String nome = pac.getPrimeironome() + " " + pac.getMeionome() + " " + pac.getUltimonome() + " ";
                String cpf = pac.getCpf();
                listModel.addElement(nome + cpf);

            }

            this.jList1.setModel(listModel);
        } catch (HibernateException e) {
            System.out.println("Não foi possível encontrar o contato. Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    //EXCLUIR
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        iterador = listaIT.iterator();
        String[] campos = this.jList1.getSelectedValue().toString().split(" ");
        String primeironome = null;
        String meionome = null;
        String ultimonome = null;
        String cpf = null;
        
        if (campos.length == 3){

            primeironome = campos[0];
            meionome = "";
            ultimonome = campos[1];
            cpf = campos[2];
        }
        else{

            primeironome = campos[0];
            meionome = campos[1];
            ultimonome = campos[2];
            cpf = campos[3]; 

        }
        while (iterador.hasNext()){
            Paciente pac = (Paciente) iterador.next();
 
            if (pac.getPrimeironome().equals(primeironome) && pac.getMeionome().equals(meionome) && pac.getUltimonome().equals(ultimonome) && pac.getCpf().equals(cpf)){
                if (JOptionPane.showConfirmDialog(null,"Tem certeza que deseja excluir esse paciente?", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    Session sessao = null;
                    Transaction transacao = null;
                    try {

                        sessao = HibernateUtil.getSessionFactory().openSession();
                        transacao = sessao.beginTransaction();
                        sessao.delete(pac);
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
                    JOptionPane.showMessageDialog(null, "Paciente removido com sucesso", "Confirmacao", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                }
            }
        
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    //VISUALIZAR
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        iterador = listaIT.iterator();
        String[] campos = this.jList1.getSelectedValue().toString().split(" ");
        String primeironome = null;
        String meionome = null;
        String ultimonome = null;
        String cpf = null;
        
        if (campos.length == 3){

            primeironome = campos[0];
            meionome = "";
            ultimonome = campos[1];
            cpf = campos[2];
        }
        else{

            primeironome = campos[0];
            meionome = campos[1];
            ultimonome = campos[2];
            cpf = campos[3]; 

        }
                while (iterador.hasNext()){

            Paciente pac = (Paciente) iterador.next();
 
            if (pac.getPrimeironome().equals(primeironome) && pac.getMeionome().equals(meionome) && pac.getUltimonome().equals(ultimonome) && pac.getCpf().equals(cpf)){

                new VisualizarPaciente(pac).setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nomepacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomepacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomepacActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void rgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JRadioButton nome;
    private javax.swing.JTextField nomepac;
    private javax.swing.ButtonGroup opcao;
    private javax.swing.JRadioButton rg;
    private javax.swing.JTextField rgpac;
    // End of variables declaration//GEN-END:variables
}
