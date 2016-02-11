/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD.SalaEquipamentos.Itens;

import CRUD.SalaEquipamentos.ManutencaoSalaEquipamentoInterface;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Carlos
 */
public class CadastrarItemInterface extends javax.swing.JFrame {
    private Item itematual;
    public CadastrarItemInterface(Item itemx) {
        initComponents();
        this.edit.setVisible(true);
        this.item.setText(itemx.getNome());
        this.localizacao.setText(itemx.getLocalizacao());
        if (itemx.getClassificacao() == 1){
            this.freezer.setSelected(true);
        }
        else if (itemx.getClassificacao() == 2){
            this.sala.setSelected(true);
        }
        else if (itemx.getClassificacao() == 3){
            this.equipamento.setSelected(true);
        }
        this.localizacao.setEnabled(false);
        this.item.setEnabled(false);
        this.freezer.setEnabled(false);
        this.sala.setEnabled(false);
        this.equipamento.setEnabled(false);
        this.itematual = itemx;
        this.datamanutencao.setEnabled(false);
        String[] datax = itemx.getDatamanutencao().toString().split("-");
        this.datamanutencao.setText(datax[2]+"/"+datax[1]+"/"+datax[0]);
    }

    /**
     * Creates new form CadastrarItemInterface
     */
    public CadastrarItemInterface() {
        initComponents();
        this.edit.setVisible(false);
    }
    
    
    public boolean checkfields(){
        if((this.item.getText().equals("")) || this.localizacao.getText().equals("") || this.datamanutencao.getText().equals("")){
            return false;
        }
        
        if((!(this.freezer.isSelected())) && (!(this.sala.isSelected())) && (!(this.equipamento.isSelected()))){
            return false;
        }
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
           dateFormat.parse(this.datamanutencao.getText());
        }
        catch (ParseException ex) {
                    Logger.getLogger(ManutencaoSalaEquipamentoInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
        return true;
    }

    public JTextField getDatamanutencao() {
        return datamanutencao;
    }

    public void setDatamanutencao(JTextField datamanutencao) {
        this.datamanutencao = datamanutencao;
    }

    public JRadioButton getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(JRadioButton equipamento) {
        this.equipamento = equipamento;
    }

    public JRadioButton getFreezer() {
        return freezer;
    }

    public void setFreezer(JRadioButton freezer) {
        this.freezer = freezer;
    }

    public JTextField getItem() {
        return item;
    }

    public void setItem(JTextField item) {
        this.item = item;
    }

    public JTextField getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(JTextField localizacao) {
        this.localizacao = localizacao;
    }

    public JRadioButton getSala() {
        return sala;
    }

    public void setSala(JRadioButton sala) {
        this.sala = sala;
    }

    public JButton getCadastrar() {
        return cadastrar;
    }

    public void setCadastrar(JButton cadastrar) {
        this.cadastrar = cadastrar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        classificacao = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        item = new javax.swing.JTextField();
        localizacao = new javax.swing.JTextField();
        freezer = new javax.swing.JRadioButton();
        sala = new javax.swing.JRadioButton();
        equipamento = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        datamanutencao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Cadastrar Item");

        jLabel2.setText("Nome do Item:");

        jLabel3.setText("Localização:");

        jLabel4.setText("Classificação:");

        classificacao.add(freezer);
        freezer.setText("Freezer");

        classificacao.add(sala);
        sala.setText("Sala");

        classificacao.add(equipamento);
        equipamento.setText("Outro Equipamento");

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        edit.setText("Editar");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        jLabel5.setText("Data Manutenção:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(item)
                                    .addComponent(localizacao, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sala)
                                    .addComponent(freezer)
                                    .addComponent(equipamento)
                                    .addComponent(datamanutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(edit)
                                .addGap(36, 36, 36)
                                .addComponent(cadastrar)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(freezer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sala)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(equipamento)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(datamanutencao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cadastrar)
                    .addComponent(edit))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        Date datamanutencao;
        if (checkfields()){
            if (this.cadastrar.getText().equals("Cadastrar")){
                Item itemx = null;
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    datamanutencao  = (Date)dateFormat.parse(this.datamanutencao.getText());
                    if (this.freezer.isSelected()){
                        itemx = new Item(this.item.getText(), this.localizacao.getText(), 1, datamanutencao);
                    }
                    else if(this.sala.isSelected()){
                        itemx = new Item(this.item.getText(), this.localizacao.getText(), 2, datamanutencao);
                    }
                    else{
                        itemx = new Item(this.item.getText(), this.localizacao.getText(), 3, datamanutencao);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(ManutencaoSalaEquipamentoInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(ItemController.CadastrarItem(itemx)){
                    JOptionPane.showMessageDialog(null, "Item cadastrado!");
                    this.dispose();
                }

            }
        

            else if (this.cadastrar.getText().equals("Salvar")){
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    datamanutencao  = (Date)dateFormat.parse(this.datamanutencao.getText());
                    if(this.freezer.isSelected()){
                        Item atualizado = new Item(this.item.getText(), this.localizacao.getText(), 1, datamanutencao);
                        if (ItemController.UpdateItem(atualizado)){
                            JOptionPane.showMessageDialog(null, "Item atualizado com sucesso!");
                        }
                    }
                    else if(this.sala.isSelected()){
                        Item atualizado = new Item(this.item.getText(), this.localizacao.getText(), 2, datamanutencao);
                        if (ItemController.UpdateItem(atualizado)){
                            JOptionPane.showMessageDialog(null, "Item atualizado com sucesso!");
                        }
                    }
                    else if(this.equipamento.isSelected()){
                        Item atualizado = new Item(this.item.getText(), this.localizacao.getText(), 3, datamanutencao);
                        if (ItemController.UpdateItem(atualizado)){
                            JOptionPane.showMessageDialog(null, "Item atualizado com sucesso!");
                        }
                    }
                }
                catch (ParseException ex) {
                    Logger.getLogger(ManutencaoSalaEquipamentoInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Campos obbrigatorios em branco!");
        }
        
        
    }//GEN-LAST:event_cadastrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed

        if (this.edit.getText().equals("Editar")){
            this.freezer.setEnabled(true);
            this.sala.setEnabled(true);
            this.equipamento.setEnabled(true);
            this.localizacao.setEnabled(true);
            this.cadastrar.setText("Salvar");
            this.edit.setText("Excluir");
            this.datamanutencao.setEnabled(true);
        }
        
    }//GEN-LAST:event_editActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarItemInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarItemInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarItemInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarItemInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarItemInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.ButtonGroup classificacao;
    private javax.swing.JTextField datamanutencao;
    private javax.swing.JButton edit;
    private javax.swing.JRadioButton equipamento;
    private javax.swing.JRadioButton freezer;
    private javax.swing.JTextField item;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField localizacao;
    private javax.swing.JRadioButton sala;
    // End of variables declaration//GEN-END:variables
}