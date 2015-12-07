/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD.Resultados;

import CRUD.Exames.*;
import javax.swing.JOptionPane;
public class CrossMatchInterface extends javax.swing.JFrame {

    private Exame examex;
    private CrossMatch crossmatch;
    
    public CrossMatchInterface(Exame exame) {
        this.examex = exame;
        initComponents();
        this.edit.setVisible(false);
        this.datacol.setText(exame.getDatacol());
        this.nome.setText(exame.getNome());
        this.material.setText(exame.getMaterial());
        this.codigo.setText(exame.getCodigo());
        this.examesol.setText(exame.getTipo());
        this.examex = exame;
        this.nome.setEnabled(false);
        this.centro.setEnabled(false);
        this.material.setEnabled(false);
        this.codigo.setEnabled(false);
        this.datacol.setEnabled(false);
        this.examesol.setEnabled(false);
    }
    
    public CrossMatchInterface(Exame exame, CrossMatch resultado) {
        
        initComponents();
        this.nome.setEnabled(false);
        this.material.setEnabled(false);
        this.codigo.setEnabled(false);
        this.examesol.setEnabled(false);
        this.metodo.setEnabled(false);
        this.crossmatch = resultado;
        this.linfb.setEnabled(false);
        this.linft.setEnabled(false);
        this.ac_linfb.setEnabled(false);
        this.ac_linft.setEnabled(false);
        this.linft_agh.setEnabled(false);
        this.linft_dtt.setEnabled(false);
        this.linft_agh_dtt.setEnabled(false);
        this.linfb_dtt.setEnabled(false);
        this.edit.setVisible(true);
        this.cadastrar.setText("Excluir");
        this.datacol.setText(exame.getDatacol());
        this.nome.setText(exame.getNome());
        this.material.setText(exame.getMaterial());
        this.codigo.setText(exame.getCodigo());
        this.examesol.setText(exame.getTipo());
        this.examex = exame;
        this.linfb.setSelectedItem(resultado.getLinfb());
        this.linft.setSelectedItem(resultado.getLinft());
        this.ac_linfb.setSelectedItem(resultado.getAc_linfb());
        this.ac_linft.setSelectedItem(resultado.getAc_linft());
        this.linft_agh.setSelectedItem(resultado.getLinft_agh());
        this.linft_dtt.setSelectedItem(resultado.getLinft_dtt());
        this.linft_agh_dtt.setSelectedItem(resultado.getLinft_agh_dtt());
        this.linfb_dtt.setSelectedItem(resultado.getLinfb_dtt());
        this.obs.setText(resultado.getObs());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox6 = new javax.swing.JComboBox();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox12 = new javax.swing.JComboBox();
        jComboBox15 = new javax.swing.JComboBox();
        jComboBox17 = new javax.swing.JComboBox();
        jComboBox19 = new javax.swing.JComboBox();
        jComboBox21 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        datacol = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        examesol = new javax.swing.JTextField();
        metodo = new javax.swing.JTextField();
        material = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        linft = new javax.swing.JComboBox();
        linft_agh = new javax.swing.JComboBox();
        linft_dtt = new javax.swing.JComboBox();
        ac_linft = new javax.swing.JComboBox();
        jComboBox14 = new javax.swing.JComboBox();
        linfb = new javax.swing.JComboBox();
        linfb_dtt = new javax.swing.JComboBox();
        linft_agh_dtt = new javax.swing.JComboBox();
        ac_linfb = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        obs = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        centro = new javax.swing.JTextField();
        edit = new javax.swing.JButton();

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negativo", "Fraco Positivo", "Positivo", "Inconclusivo" }));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negativo", "Fraco Positivo", "Positivo", "Inconclusivo" }));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negativo", "Fraco Positivo", "Positivo", "Inconclusivo" }));

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negativo", "Fraco Positivo", "Positivo", "Inconclusivo" }));

        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negativo", "Fraco Positivo", "Positivo", "Inconclusivo" }));

        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negativo", "Fraco Positivo", "Positivo", "Inconclusivo" }));

        jComboBox21.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negativo", "Fraco Positivo", "Positivo", "Inconclusivo" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("CrossMatch");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Paciente:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Data Coleta:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Codigo do Exame:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Metodologia:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Exame Solicitados:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Material Biologico:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("CroosMatch (Prova Cruzada)");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Data de Analise dos soros");

        jLabel10.setText("Linfocitos T");

        jLabel11.setText("Linfocitos T com AGH");

        jLabel12.setText("Linfocitos T dom DTT");

        jLabel13.setText("Linfocitos T com AGH com DTT");

        jLabel14.setText("Auto Anticorpos para Linfocito T");

        jLabel15.setText("Linfocitos B");

        jLabel16.setText("Linfocitos B com DTT");

        jLabel17.setText("Auto Anticorpos para Linfocito B");

        linft.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negativo", "Fraco Positivo", "Positivo", "Inconclusivo" }));

        linft_agh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negativo", "Fraco Positivo", "Positivo", "Inconclusivo" }));

        linft_dtt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negativo", "Fraco Positivo", "Positivo", "Inconclusivo" }));

        ac_linft.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negativo", "Fraco Positivo", "Positivo", "Inconclusivo" }));

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negativo", "Fraco Positivo", "Positivo", "Inconclusivo" }));

        linfb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negativo", "Fraco Positivo", "Positivo", "Inconclusivo" }));

        linfb_dtt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negativo", "Fraco Positivo", "Positivo", "Inconclusivo" }));

        linft_agh_dtt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negativo", "Fraco Positivo", "Positivo", "Inconclusivo" }));

        ac_linfb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negativo", "Fraco Positivo", "Positivo", "Inconclusivo" }));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Conclusão:");

        obs.setColumns(20);
        obs.setRows(5);
        jScrollPane1.setViewportView(obs);

        jButton1.setText("Cancelar");
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

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Centro:");

        edit.setText("Editar");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(centro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(metodo, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(examesol, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(material, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ac_linft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jButton1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(edit)
                                                    .addGap(84, 84, 84)
                                                    .addComponent(cadastrar))
                                                .addComponent(jLabel18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel17)
                                                        .addGap(148, 148, 148)
                                                        .addComponent(ac_linfb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel16)
                                                        .addGap(204, 204, 204)
                                                        .addComponent(linfb_dtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel15)
                                                        .addGap(248, 248, 248)
                                                        .addComponent(linfb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel10)
                                                        .addGap(248, 248, 248)
                                                        .addComponent(linft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel11)
                                                        .addGap(202, 202, 202)
                                                        .addComponent(linft_agh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel12)
                                                        .addGap(203, 203, 203)
                                                        .addComponent(linft_dtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jScrollPane1)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel13)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(linft_agh_dtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGap(9, 9, 9))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(datacol, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(187, Short.MAX_VALUE)
                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(187, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(datacol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(centro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(examesol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(linft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(linft_agh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(linft_dtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ac_linft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(linft_agh_dtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(linfb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(linfb_dtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(ac_linfb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cadastrar)
                    .addComponent(edit))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(383, Short.MAX_VALUE)
                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(364, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        if (this.cadastrar.getText().equals("Cadastrar")){
            CrossMatch novoCrossMatch = new CrossMatch(this.examex, 
                    this.obs.getText(), 
                    this.metodo.getText(), 
                    this.linft.getSelectedItem().toString(), 
                    this.linft_agh.getSelectedItem().toString(),
                    this.linft_dtt.getSelectedItem().toString(), 
                    this.linft_agh_dtt.getSelectedItem().toString(),
                    this.ac_linft.getSelectedItem().toString(), 
                    this.linfb.getSelectedItem().toString(), 
                    this.linfb_dtt.getSelectedItem().toString(), 
                    this.ac_linfb.getSelectedItem().toString());
            if(ResultadosController.CadastrarCrossMatch(novoCrossMatch)){
                JOptionPane.showMessageDialog(null, "CrossMatch Realizado com sucesso!");
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro!");
            }
        }
        else if (this.cadastrar.getText().equals("Excluir")){
            ResultadosController controladora = new ResultadosController();
            if(controladora.ExcluirResultado(this.crossmatch)){
                JOptionPane.showMessageDialog(null, "Resultado excluido com sucesso!");
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "ERRO!");
            }

        }
    }//GEN-LAST:event_cadastrarActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        if (this.edit.getText().equals("Editar")){
            this.metodo.setEnabled(true);
            this.linfb.setEnabled(true);
            this.linft.setEnabled(true);
            this.ac_linfb.setEnabled(true);
            this.ac_linft.setEnabled(true);
            this.linft_agh.setEnabled(true);
            this.linft_dtt.setEnabled(true);
            this.linft_agh_dtt.setEnabled(true);
            this.linfb_dtt.setEnabled(true);
            this.edit.setText("Salvar");
        }
        else if(this.edit.getText().equals("Salvar")){
            this.crossmatch.setAc_linfb(this.ac_linfb.getSelectedItem().toString());
            this.crossmatch.setAc_linft(this.ac_linft.getSelectedItem().toString());
            this.crossmatch.setLinfb(this.linfb.getSelectedItem().toString());
            this.crossmatch.setLinfb_dtt(this.linfb_dtt.getSelectedItem().toString());
            this.crossmatch.setLinft(this.linft.getSelectedItem().toString());
            this.crossmatch.setLinft_agh(this.linft_agh.getSelectedItem().toString());
            this.crossmatch.setLinft_agh_dtt(this.linft_agh_dtt.getSelectedItem().toString());
            this.crossmatch.setLinft_dtt(this.linft_dtt.getSelectedItem().toString());
            this.crossmatch.setMetodo(this.metodo.getText());
            if (ResultadosController.updateCross(this.crossmatch)){
                JOptionPane.showMessageDialog(null, "Usuario alterado com sucesso!");
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "ERRO!");
            }
                    
        }
        
    }//GEN-LAST:event_editActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ac_linfb;
    private javax.swing.JComboBox ac_linft;
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField centro;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField datacol;
    private javax.swing.JButton edit;
    private javax.swing.JTextField examesol;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox14;
    private javax.swing.JComboBox jComboBox15;
    private javax.swing.JComboBox jComboBox17;
    private javax.swing.JComboBox jComboBox19;
    private javax.swing.JComboBox jComboBox21;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox linfb;
    private javax.swing.JComboBox linfb_dtt;
    private javax.swing.JComboBox linft;
    private javax.swing.JComboBox linft_agh;
    private javax.swing.JComboBox linft_agh_dtt;
    private javax.swing.JComboBox linft_dtt;
    private javax.swing.JTextField material;
    private javax.swing.JTextField metodo;
    private javax.swing.JTextField nome;
    private javax.swing.JTextArea obs;
    // End of variables declaration//GEN-END:variables
}
