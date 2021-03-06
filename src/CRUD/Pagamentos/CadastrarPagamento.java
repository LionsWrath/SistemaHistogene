/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD.Pagamentos;

import CRUD.Exames.Exame;
import CRUD.Exames.ExameController;
import static CRUD.Pagamentos.PagamentoController.adicionarPagamento;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

/**
 *
 * @author Caio
 */
public class CadastrarPagamento extends javax.swing.JFrame {

    private boolean validoP = false;
    private Exame ex = null;
    
    public CadastrarPagamento() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        f_id_exame = new javax.swing.JTextField();
        b_validar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        f_nome_paciente = new javax.swing.JTextField();
        f_data_exame = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rb_avista = new javax.swing.JRadioButton();
        rb_aprazo = new javax.swing.JRadioButton();
        cb_parcelas = new javax.swing.JComboBox();
        b_cadastrar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        f_cod_exame = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        f_valor = new javax.swing.JTextField();
        b_limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Cadastrar Pagamento");

        jLabel2.setText("Selecionar Exame:");

        f_id_exame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_id_exameActionPerformed(evt);
            }
        });

        b_validar.setText("Validar");
        b_validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_validarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome Paciente:");

        jLabel4.setText("Data Exame:");

        f_nome_paciente.setEnabled(false);
        f_nome_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_nome_pacienteActionPerformed(evt);
            }
        });

        f_data_exame.setEnabled(false);
        f_data_exame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_data_exameActionPerformed(evt);
            }
        });

        jLabel5.setText("Forma de Pagamento");

        rb_avista.setText("A vista");
        rb_avista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_avistaActionPerformed(evt);
            }
        });

        rb_aprazo.setText("A prazo");
        rb_aprazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_aprazoActionPerformed(evt);
            }
        });

        cb_parcelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2x", "3x", "4x", "5x", "6x" }));
        cb_parcelas.setEnabled(false);
        cb_parcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_parcelasActionPerformed(evt);
            }
        });

        b_cadastrar.setText("Cadastrar");
        b_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cadastrarActionPerformed(evt);
            }
        });

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("Código Exame:");

        f_cod_exame.setEnabled(false);

        jLabel7.setText("Valor:");

        b_limpar.setText("Limpar");
        b_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(f_data_exame, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f_nome_paciente))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(f_cod_exame, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b_cancelar)
                                .addGap(68, 68, 68)
                                .addComponent(b_limpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b_cadastrar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb_aprazo)
                                        .addGap(18, 18, 18)
                                        .addComponent(cb_parcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(rb_avista))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f_id_exame, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b_validar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(f_id_exame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_validar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(f_nome_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(f_data_exame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(f_cod_exame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rb_avista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_aprazo)
                    .addComponent(cb_parcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(f_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cadastrar)
                    .addComponent(b_cancelar)
                    .addComponent(b_limpar))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void f_id_exameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_id_exameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f_id_exameActionPerformed

    private void f_data_exameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_data_exameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f_data_exameActionPerformed

    private void f_nome_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_nome_pacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f_nome_pacienteActionPerformed

    private void rb_aprazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_aprazoActionPerformed
        rb_avista.setSelected(false);
        cb_parcelas.setEnabled(true);
        if (!rb_aprazo.isSelected()){
            cb_parcelas.setEnabled(false);
        }
    }//GEN-LAST:event_rb_aprazoActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void rb_avistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_avistaActionPerformed
        rb_aprazo.setSelected(false);
        cb_parcelas.setEnabled(false);
    }//GEN-LAST:event_rb_avistaActionPerformed

    private void b_validarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_validarActionPerformed
        String idExame = f_id_exame.getText();
        Exame exame = null;
        try{
            ExameController controladora = new ExameController();
            exame = controladora.consultarExameID(Integer.parseInt(idExame));
            if (!exame.getConvenio().equals("SUS")){
                f_nome_paciente.setText(exame.getNome());
                f_data_exame.setText(exame.getDatacol());
                f_cod_exame.setText(exame.getCodigo());    
                validoP = true;
            } else{
                JOptionPane.showMessageDialog(rootPane, "Não é possível gerar pagamento \n para pacientes do SUS!");
            }
            if (exame.getPago() == true){
                JOptionPane.showMessageDialog(rootPane, "Não é possível criar mais de 1 \n pagamento para o mesmo exame!");
                f_id_exame.setText("");
            } else{
                ex = exame;
            }
        } catch(HibernateException e){
            JOptionPane.showMessageDialog(rootPane, "ID Exame inválido!");
        }
    }//GEN-LAST:event_b_validarActionPerformed

    private void b_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limparActionPerformed
        f_id_exame.setText("");
        f_nome_paciente.setText("");
        f_data_exame.setText("");
        f_cod_exame.setText("");
        f_valor.setText("");
        rb_aprazo.setSelected(false);
        rb_avista.setSelected(false);
        cb_parcelas.setEnabled(false);
        JOptionPane.showMessageDialog(rootPane, "Campos limpos com sucesso!", "Notificação",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_b_limparActionPerformed

    private void b_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cadastrarActionPerformed
        float valor = Float.parseFloat(f_valor.getText());
        boolean validoV = PagamentoController.validaValor(valor);
        boolean formaPag = false;
        short nParc = 1;
        boolean validoF = false;
        if (rb_aprazo.isSelected() || rb_avista.isSelected()){
            validoF = true;
        }
        if (validoV && validoP && validoF){
            try{
                if (rb_avista.isSelected()){
                    formaPag = true;
                } else{
                    nParc = (short) (cb_parcelas.getSelectedIndex() +2);
                }
                
                int idPag = Integer.parseInt(f_id_exame.getText());
                String codExame = f_cod_exame.getText();
                float valorF = Float.parseFloat(f_valor.getText());
                Pagamento pag = null;
                String data = PagamentoController.pegarDia();
                pag = new Pagamento(idPag, codExame, valorF, formaPag, nParc, data);
                
                adicionarPagamento(pag, ex);                
                JOptionPane.showMessageDialog(rootPane, "Pagamento cadastrado com sucesso!");
                this.dispose();
            } catch(HibernateException e){
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(rootPane, "Não foi possível cadastrar este pagamento!");
            }
        } else{
            if (!validoV){
                JOptionPane.showMessageDialog(rootPane, "Valor inválido para este exame!");
            } else if (!validoP){
                JOptionPane.showMessageDialog(rootPane, "Não é possível gerar pagamento para SUS!");
            } else if (!validoF){
                JOptionPane.showMessageDialog(rootPane, "Forma de pagamento não foi selecionado!");
            }
        }
    }//GEN-LAST:event_b_cadastrarActionPerformed

    private void cb_parcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_parcelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_parcelasActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cadastrar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_limpar;
    private javax.swing.JButton b_validar;
    private javax.swing.JComboBox cb_parcelas;
    private javax.swing.JTextField f_cod_exame;
    private javax.swing.JTextField f_data_exame;
    private javax.swing.JTextField f_id_exame;
    private javax.swing.JTextField f_nome_paciente;
    private javax.swing.JTextField f_valor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rb_aprazo;
    private javax.swing.JRadioButton rb_avista;
    // End of variables declaration//GEN-END:variables
}
