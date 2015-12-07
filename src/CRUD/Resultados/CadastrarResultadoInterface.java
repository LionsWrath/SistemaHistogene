/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD.Resultados;

import CRUD.Exames.*;
import Principal.CaracteresApenas;
import Principal.IntegersOnlyDocument;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Caio
 */
public class CadastrarResultadoInterface extends javax.swing.JFrame {
    

    public JTextField getCampoid() {
        return campoid;
    }

    public void setCampoid(String campoid) {
        this.campoid.setText(campoid);
    }

    public JTextField getCamponome() {
        return camponome;
    }

    public void setCamponome(String camponome) {
        this.camponome.setText(camponome);
    }

    public JRadioButton getOptid() {
        return optid;
    }

    public void setOptid(boolean optid) {
        this.optid.setSelected(optid);
    }

    public JRadioButton getOptnome() {
        return optnome;
    }

    public void setOptnome(boolean optid) {
        this.optnome.setSelected(optid);
    }


    public boolean setPesquisar() {
        try{
            this.pesquisar.doClick();
            return true;
        }
        catch(Exception ex){
            return false;
        }
    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }
    
    public boolean checkfields(){
        if(this.optid.isSelected()){
            if (this.campoid.getText().equals("")){
                return false;
            }
            return true;
        }
        else if(this.optnome.isSelected()){
            if (this.camponome.getText().equals("")){
                return false;
            }
            return true;
        }
        return false;
    }
    
    public static void cadastrar(){
        
    }
    
    
    public CadastrarResultadoInterface() {
        initComponents();
        this.campoid.setDocument(new IntegersOnlyDocument(11));
        this.camponome.setDocument(new CaracteresApenas(40));
        this.table.getColumnModel().getColumn(0).setPreferredWidth(30);
        this.table.getColumnModel().getColumn(1).setPreferredWidth(190);
        this.table.getColumnModel().getColumn(2).setPreferredWidth(120);
        this.table.getColumnModel().getColumn(3).setPreferredWidth(80);
        this.table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.campoid.setEnabled(false);
        this.camponome.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        campoid = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        optnome = new javax.swing.JRadioButton();
        optid = new javax.swing.JRadioButton();
        camponome = new javax.swing.JTextField();
        pesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        result = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campoid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoidActionPerformed(evt);
            }
        });

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Cadastrar Resultado");

        buttonGroup1.add(optnome);
        optnome.setText("Nome");
        optnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optnomeActionPerformed(evt);
            }
        });

        buttonGroup1.add(optid);
        optid.setText("ID");
        optid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optidActionPerformed(evt);
            }
        });

        camponome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponomeActionPerformed(evt);
            }
        });

        pesquisar.setText("Pesquisar Exame");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Exame", "Data Coleta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        result.setText("Cadastrar Resultado");
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(result))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optid)
                            .addComponent(optnome))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoid, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(camponome, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pesquisar)))))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optnome)
                    .addComponent(camponome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optid)
                    .addComponent(campoid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(result))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void optnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optnomeActionPerformed
        if (this.optnome.isSelected()){
            this.campoid.setText("");
            this.camponome.setEnabled(true);
            this.campoid.setEnabled(false);
        }
    }//GEN-LAST:event_optnomeActionPerformed

    private void optidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optidActionPerformed
        if (this.optid.isSelected()){
            this.camponome.setText("");
            this.campoid.setEnabled(true);
            this.camponome.setEnabled(false);
        }
    }//GEN-LAST:event_optidActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
            if(checkfields()){
                if (optid.isSelected()) {

                    ExameController controladora = new ExameController();
                    Exame examebusca = controladora.consultarExameID(Integer.parseInt(this.campoid.getText()));
                    if (examebusca != null) {
                        DefaultTableModel model = (DefaultTableModel) this.table.getModel();
                        limparTabela();
                        model.addRow(new Object[]{examebusca.getId(), examebusca.getNome(), examebusca.getTipo(), examebusca.getDatacol()});
                    } 

                }
                else if (optnome.isSelected()){

                        ExameController controladora = new ExameController();
                        List exames = controladora.consultarExameNome(this.camponome.getText());
                        Iterator examesit = exames.iterator();
                        DefaultTableModel model = (DefaultTableModel) this.table.getModel();
                        limparTabela();
                        while (examesit.hasNext()){
                            Exame examebusca = (Exame) examesit.next();
                            model.addRow(new Object[]{examebusca.getId(), examebusca.getNome(), examebusca.getTipo(), examebusca.getDatacol()});
                        }
                    }

            }
            else{
                JOptionPane.showMessageDialog(null, "Campo Vazio");
            }
            
        
    }//GEN-LAST:event_pesquisarActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        if (this.table.getSelectedRow() != -1){
            String id = this.table.getValueAt(this.table.getSelectedRow(), 0).toString();
            ResultadosController.CadastrarResultado(id);
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Nenhum exame foi selecionado");
        }
        
    }//GEN-LAST:event_resultActionPerformed

    private void campoidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoidActionPerformed

    private void camponomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camponomeActionPerformed
    
    private void limparTabela(){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int qtde = this.table.getRowCount();
        for (int a = 0; a < qtde; a++) {
            model.removeRow(0);
            this.campoid.setText("");
        }
    }
    
    



    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoid;
    private javax.swing.JTextField camponome;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton optid;
    private javax.swing.JRadioButton optnome;
    private javax.swing.JButton pesquisar;
    private javax.swing.JButton result;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}