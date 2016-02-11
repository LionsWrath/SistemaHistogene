/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD.Materiais;

import javax.swing.JOptionPane;

/**
 *
 * @author Juliano
 */
public class EditarMaterial extends javax.swing.JFrame {

    
    Materiais material = new Materiais();
    
    public EditarMaterial(Materiais mat) {
        initComponents();
        if (mat.isStatus()){
            this.b_excluir.setText("Excluir");
        } else{
            this.b_excluir.setText("Recuperar");
            this.b_alterar.setEnabled(false);
        }
        this.f_fabricante.setEnabled(false);
        this.f_nome.setEnabled(false);
        this.f_modelo.setEnabled(false);
        this.f_obs.setEnabled(false);
        this.s_quant.setEnabled(false);
        this.cb_tipo.setEnabled(false);
        this.f_fabricante.setText(mat.getFabricante());
        this.f_nome.setText(mat.getNome());
        this.f_modelo.setText(mat.getModelo());
        this.f_obs.setText(mat.getObs());
        this.s_quant.setValue(mat.getQuantidade());
        this.cb_tipo.setSelectedItem(mat.getTipo());
        material = mat;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t_modelo = new javax.swing.JLabel();
        t_nome = new javax.swing.JLabel();
        t_tipo = new javax.swing.JLabel();
        f_modelo = new javax.swing.JTextField();
        f_nome = new javax.swing.JTextField();
        t_obs = new javax.swing.JLabel();
        t_fabricante = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        f_obs = new javax.swing.JTextPane();
        f_fabricante = new javax.swing.JTextField();
        b_alterar = new javax.swing.JButton();
        t_header = new javax.swing.JLabel();
        t_quant = new javax.swing.JLabel();
        b_excluir = new javax.swing.JButton();
        s_quant = new javax.swing.JSpinner();
        b_cancelar = new javax.swing.JButton();
        cb_tipo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        t_modelo.setText("Modelo:");

        t_nome.setText("Nome:");

        t_tipo.setText("Tipo:");

        t_obs.setText("Observações:");

        t_fabricante.setText("Fabricante:");

        jScrollPane1.setViewportView(f_obs);

        b_alterar.setText("Alterar");
        b_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_alterarActionPerformed(evt);
            }
        });

        t_header.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        t_header.setText("Cadastrar Material");

        t_quant.setText("Quantidade:");

        b_excluir.setText("Excluir");
        b_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_excluirActionPerformed(evt);
            }
        });

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CrossMatch", "HLA B27", "PRA", "Tipificação - C I - C II (Baixa / Media Resolução)", "Tipificação - C I - C II (Alta Resolução)", "Tipificação - C I  (Baixa / Media Resolução)", "Tipificação - C I  (Alta Resolução)", "Tipificação - C II (Baixa / Media Resolução)", "Tipificação - C II (Alta Resolução)", "OUTROS" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_cancelar)
                        .addGap(98, 98, 98)
                        .addComponent(b_excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_alterar))
                    .addComponent(jScrollPane1)
                    .addComponent(t_obs)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t_nome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t_modelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f_modelo))
                            .addComponent(t_header))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(t_fabricante)
                            .addComponent(t_quant))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s_quant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t_tipo)
                        .addGap(18, 18, 18)
                        .addComponent(cb_tipo, 0, 351, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(t_header)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_modelo)
                    .addComponent(f_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_fabricante)
                    .addComponent(f_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_nome)
                    .addComponent(f_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_quant)
                    .addComponent(s_quant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_tipo)
                    .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(t_obs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_alterar)
                    .addComponent(b_excluir)
                    .addComponent(b_cancelar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_alterarActionPerformed
        String fabricante, nome, obs, tipo;
        MateriaisController cont = new MateriaisController();
        int quant;
        if (this.b_alterar.getText().equals("Alterar")){
            this.f_fabricante.setEnabled(true);
            this.f_nome.setEnabled(true);
            this.f_obs.setEnabled(true);
            this.s_quant.setEnabled(true);
            this.cb_tipo.setEnabled(true);    
            this.b_alterar.setText("Salvar");
            JOptionPane.showMessageDialog(rootPane, "Alteração habilitada!");
        } else if (this.b_alterar.getText().equals("Salvar")){
                fabricante = f_fabricante.getText();
                nome = f_nome.getText();
                obs = f_obs.getText();
                tipo = cb_tipo.getSelectedItem().toString();
                quant = (int) s_quant.getValue();
                material.setFabricante(fabricante);
                material.setNome(nome);
                material.setObs(obs);
                material.setTipo(tipo);
                material.setQuantidade(quant);
                try {
                    cont.atualizarMaterial(material);
                    JOptionPane.showMessageDialog(rootPane, "Material atualizado com sucesso!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "Erro! Nao foi possivel atualizar!");
                } 
            this.dispose();
        }
        
        
    }//GEN-LAST:event_b_alterarActionPerformed

    private void b_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_excluirActionPerformed
        MateriaisController cont = new MateriaisController();
        if (this.b_excluir.getText().equals("Excluir")){
            material.setStatus(false);
            cont.atualizarMaterial(material);     
            JOptionPane.showMessageDialog(rootPane, "Material EXCLUIDO com sucesso!");
        } else if (this.b_excluir.getText().equals("Recuperar")){
            material.setStatus(true);
            cont.atualizarMaterial(material);
            JOptionPane.showMessageDialog(rootPane, "Material RECUPERADO com sucesso!");
        }
        this.dispose();
    }//GEN-LAST:event_b_excluirActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_b_cancelarActionPerformed

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
//            java.util.logging.Logger.getLogger(EditarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EditarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EditarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EditarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EditarMaterial().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_alterar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_excluir;
    private javax.swing.JComboBox cb_tipo;
    private javax.swing.JTextField f_fabricante;
    private javax.swing.JTextField f_modelo;
    private javax.swing.JTextField f_nome;
    private javax.swing.JTextPane f_obs;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner s_quant;
    private javax.swing.JLabel t_fabricante;
    private javax.swing.JLabel t_header;
    private javax.swing.JLabel t_modelo;
    private javax.swing.JLabel t_nome;
    private javax.swing.JLabel t_obs;
    private javax.swing.JLabel t_quant;
    private javax.swing.JLabel t_tipo;
    // End of variables declaration//GEN-END:variables
}