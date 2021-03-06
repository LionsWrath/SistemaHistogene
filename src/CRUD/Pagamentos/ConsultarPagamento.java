/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD.Pagamentos;

import CRUD.Exames.Exame;
import CRUD.Exames.ExameController;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Caio
 */
public class ConsultarPagamento extends javax.swing.JFrame {

    private List listaIt = null;
    
    public ConsultarPagamento() {
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
        f_id_exame = new javax.swing.JTextField();
        b_pesquisar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        b_visualizar = new javax.swing.JButton();
        t_painel = new javax.swing.JScrollPane();
        t_resultado = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Consultar Pagamento");

        b_pesquisar.setText("Pesquisar");
        b_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_pesquisarActionPerformed(evt);
            }
        });

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        b_visualizar.setText("Visualizar");
        b_visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_visualizarActionPerformed(evt);
            }
        });

        t_resultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Codigo Exame", "Numero NF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_resultado.setColumnSelectionAllowed(true);
        t_resultado.setRowSelectionAllowed(false);
        t_resultado.getTableHeader().setReorderingAllowed(false);
        t_painel.setViewportView(t_resultado);
        t_resultado.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel2.setText("ID Exame:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f_id_exame, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_pesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(b_cancelar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b_visualizar))
                                .addComponent(t_painel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f_id_exame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_pesquisar)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addComponent(t_painel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_visualizar)
                    .addComponent(b_cancelar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_pesquisarActionPerformed
        DefaultTableModel model = (DefaultTableModel) this.t_resultado.getModel();
        if (!this.f_id_exame.getText().equals("")){
            Pagamento resultado = PagamentoController.consultarPagamentoID(Integer.parseInt(f_id_exame.getText()));
            if (resultado != null){
                limparTabela();
                model.addRow(new Object[]{resultado.getIdPagamento(), resultado.getCodExame(), resultado.getNumNF()});
            }

        }
    }//GEN-LAST:event_b_pesquisarActionPerformed
   
    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_visualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_visualizarActionPerformed
        int id = Integer.parseInt(this.t_resultado.getValueAt(0, this.t_resultado.getSelectedRow()).toString());
        Pagamento pag = PagamentoController.consultarPagamentoID(id);
        Exame ex = ExameController.consultarExameID(id);
        if (pag != null){
            new EditarPagamento(pag, ex).setVisible(true);
        }        
    }//GEN-LAST:event_b_visualizarActionPerformed

    private void limparTabela(){
        DefaultTableModel model = (DefaultTableModel) t_resultado.getModel();
        int qtde = this.t_resultado.getRowCount();
        for (int a = 0; a < qtde; a++) {
            model.removeRow(0);
            this.f_id_exame.setText("");
        }
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_pesquisar;
    private javax.swing.JButton b_visualizar;
    private javax.swing.JTextField f_id_exame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane t_painel;
    private javax.swing.JTable t_resultado;
    // End of variables declaration//GEN-END:variables
}
