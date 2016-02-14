/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD.Pagamentos;
import CRUD.Exames.Exame;
import CRUD.Pagamentos.Pagamento;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

/**
 *
 * @author Caio
 */
public class EditarPagamento extends javax.swing.JFrame {

    private Pagamento pagamento;
    private Exame exame;
    
    public EditarPagamento(Pagamento pag, Exame ex) {
        initComponents();
        f_id_exame.setText(String.valueOf(pag.getIdPagamento()));
        f_codigo_exame.setText(pag.getCodExame());
        f_nome_paciente.setText(ex.getNome());
        f_data_coleta.setText(ex.getDatacol());
        if (pag.getFormaPagamento() == true){
            f_pagamento.setText("a vista");
        } else{
          f_pagamento.setText("a prazo -> " + pag.getnParcelas() + "x" );
        }
        f_valor.setText(String.valueOf(pag.getValor()));
        f_data_pagamento.setText(pag.getDataPagamento());
        f_num_nf.setText(String.valueOf(pag.getNumNF()));
        f_num_parcelas.setText(String.valueOf(pag.getnParcelas()));
        f_pagas.setText(String.valueOf(pag.getParcelasPago()));
        
        if (pag.getnParcelas() == pag.getParcelasPago()){
            b_atualizar.setEnabled(false);
            f_pagas.setEnabled(false);
        }
        if (pag.getAtivo() == false){
            b_excluir.setEnabled(false);
            f_estado.setText("inativo");
            f_pagas.setEnabled(false);
            b_atualizar.setEnabled(false);
        } else{
            f_estado.setText("ativo");
        }
        this.pagamento = pag;
        this.exame = ex;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        f_id_exame = new javax.swing.JTextField();
        f_nome_paciente = new javax.swing.JTextField();
        f_codigo_exame = new javax.swing.JTextField();
        f_data_coleta = new javax.swing.JTextField();
        f_pagamento = new javax.swing.JTextField();
        f_data_pagamento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        f_valor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        f_num_nf = new javax.swing.JTextField();
        b_fechar = new javax.swing.JButton();
        b_excluir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        f_num_parcelas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        f_pagas = new javax.swing.JTextField();
        b_atualizar = new javax.swing.JButton();
        f_estado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Editar Pagamento");

        jLabel2.setText("ID Exame:");

        jLabel3.setText("Paciente:");

        jLabel4.setText("Codigo:");

        jLabel5.setText("Data Coleta:");

        jLabel6.setText("Forma Pagamento:");

        jLabel7.setText("Data Pagamento:");

        f_id_exame.setEnabled(false);

        f_nome_paciente.setEnabled(false);

        f_codigo_exame.setEnabled(false);

        f_data_coleta.setEnabled(false);

        f_pagamento.setEnabled(false);

        f_data_pagamento.setEnabled(false);
        f_data_pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_data_pagamentoActionPerformed(evt);
            }
        });

        jLabel8.setText("Valor:");

        f_valor.setEnabled(false);

        jLabel9.setText("Numero NF:");

        f_num_nf.setEnabled(false);

        b_fechar.setText("Fechar");
        b_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_fecharActionPerformed(evt);
            }
        });

        b_excluir.setText("Excluir");
        b_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_excluirActionPerformed(evt);
            }
        });

        jLabel10.setText("Nº Parcelas:");

        f_num_parcelas.setEnabled(false);

        jLabel11.setText("Parcelas Pagas:");

        b_atualizar.setText("Atualizar");
        b_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_atualizarActionPerformed(evt);
            }
        });

        f_estado.setEnabled(false);

        jLabel12.setText("Estado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(f_id_exame))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(f_codigo_exame)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f_num_parcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b_fechar)
                                .addGap(167, 167, 167)
                                .addComponent(b_excluir)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(8, 8, 8)
                                    .addComponent(f_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(f_data_coleta, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(f_num_nf, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b_atualizar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f_data_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f_nome_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f_pagas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(f_id_exame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(f_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(f_nome_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(f_codigo_exame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_data_coleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(f_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(f_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(f_num_nf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(f_num_parcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(f_pagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(f_data_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_fechar)
                    .addComponent(b_excluir)
                    .addComponent(b_atualizar))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_fecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_b_fecharActionPerformed

    private void b_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_excluirActionPerformed
        try{
            this.pagamento.setAtivo(false);
            this.exame.setPago(false);
            
            PagamentoController.removerPagamento(pagamento, exame);
            
            JOptionPane.showMessageDialog(null, "Exame ecluído com sucesso!");
        } catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Não foi possível excluir este exame!");
        }
    }//GEN-LAST:event_b_excluirActionPerformed

    private void b_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_atualizarActionPerformed
        int parcela = Integer.parseInt(f_pagas.getText());
        if ((this.pagamento.getnParcelas() >= parcela) && (parcela > this.pagamento.getParcelasPago())){
            try{
                this.pagamento.setParcelasPago(Short.parseShort(f_pagas.getText()));
                
                PagamentoController.atualizarPagamento(pagamento);
                
                JOptionPane.showMessageDialog(null, "Exame atualizado com sucesso!");
                this.dispose();
            } catch(HibernateException e){
                JOptionPane.showMessageDialog(null, "Não foi possível atualizar este exame!");
            }   
        } else{
            if (parcela < this.pagamento.getParcelasPago()){
                JOptionPane.showMessageDialog(null, "Valor inválido para ser atualizado!");
            } else if (this.pagamento.getnParcelas() < parcela){
                JOptionPane.showMessageDialog(null, "Nº de parcelas não pode ser menor que \n o número de parcelas pagas!");
            }
        }
        
    }//GEN-LAST:event_b_atualizarActionPerformed

    private void f_data_pagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_data_pagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f_data_pagamentoActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EditarPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EditarPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EditarPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EditarPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EditarPagamento().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_atualizar;
    private javax.swing.JButton b_excluir;
    private javax.swing.JButton b_fechar;
    private javax.swing.JTextField f_codigo_exame;
    private javax.swing.JTextField f_data_coleta;
    private javax.swing.JTextField f_data_pagamento;
    private javax.swing.JTextField f_estado;
    private javax.swing.JTextField f_id_exame;
    private javax.swing.JTextField f_nome_paciente;
    private javax.swing.JTextField f_num_nf;
    private javax.swing.JTextField f_num_parcelas;
    private javax.swing.JTextField f_pagamento;
    private javax.swing.JTextField f_pagas;
    private javax.swing.JTextField f_valor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}