/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD.Resultados;
import CRUD.Exames.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Caio
 */
public class TipificacaoHLAInterface extends javax.swing.JFrame {

    private Exame exame;
    private TipificacaoHLA tipificacao;
    private int controle;
    public TipificacaoHLAInterface(Exame exame, int controle) {
        this.exame = exame;
        this.controle = controle;
        initComponents();
        this.edit.setVisible(false);
        this.nome.setText(exame.getNome());
        this.centro.setText(exame.getCentro());
        this.material.setText(exame.getMaterial());
        this.codigo.setText(exame.getCodigo());
        this.datacol.setText(exame.getDatacol());
        this.examesol.setText(exame.getTipo());
        this.nome.setEnabled(false);
        this.centro.setEnabled(false);
        this.material.setEnabled(false);
        this.codigo.setEnabled(false);
        this.datacol.setEnabled(false);
        this.examesol.setEnabled(false);
        this.a1.setEnabled(false);
        this.a2.setEnabled(false);
        this.a3.setEnabled(false);
        this.a4.setEnabled(false);
        this.b1.setEnabled(false);
        this.b2.setEnabled(false);
        this.b3.setEnabled(false);
        this.b4.setEnabled(false);
        this.c1.setEnabled(false);
        this.c2.setEnabled(false);
        this.c3.setEnabled(false);
        this.c4.setEnabled(false);
        this.dr1.setEnabled(false);
        this.dr2.setEnabled(false);
        this.dr3.setEnabled(false);
        this.dr4.setEnabled(false);
        this.dq1.setEnabled(false);
        this.dq2.setEnabled(false);
        this.dq3.setEnabled(false);
        this.dq4.setEnabled(false);
        if ((controle == 4) || (controle == 2) || (controle == 1) || (controle == 0)){
            this.a1.setEnabled(true);
            this.a2.setEnabled(true);
            this.b1.setEnabled(true);
            this.b2.setEnabled(true);
            this.c1.setEnabled(true);
            this.c2.setEnabled(true);
        }
        if ((controle == 5) || (controle == 0) || (controle == 1) || (controle == 3)){
            this.dr1.setEnabled(true);
            this.dr2.setEnabled(true);
            this.dq1.setEnabled(true);
            this.dq2.setEnabled(true);
        }
        if ((controle == 1) || (controle == 4)){
            this.a3.setEnabled(true);
            this.a4.setEnabled(true);
            this.b3.setEnabled(true);
            this.b4.setEnabled(true);
            this.c3.setEnabled(true);
            this.c4.setEnabled(true);
        }
        if ((controle == 1) || (controle == 5)){
            this.dr3.setEnabled(true);
            this.dr4.setEnabled(true);
            this.dq3.setEnabled(true);
            this.dq4.setEnabled(true);
        }
            
    }
    
    public TipificacaoHLAInterface(Exame exame, TipificacaoHLA tipificacao, int controle) {
        
        this.exame = exame;
        this.tipificacao = tipificacao;
        this.controle = controle;
        initComponents();
        this.datacol.setEnabled(false);
        this.centro.setEnabled(false);
        this.cadastrar.setText("Excluir");
        this.nome.setText(exame.getNome());
        this.centro.setText(exame.getCentro());
        this.material.setText(exame.getMaterial());
        this.codigo.setText(exame.getCodigo());
        this.datacol.setText(exame.getDatacol());
        this.examesol.setText(exame.getTipo());
        this.obs.setText(tipificacao.getObs());
        this.metodo.setText(tipificacao.getMetodo());
        this.metodo.setEnabled(false);
        this.obs.setEnabled(false);
        this.nome.setEnabled(false);
        this.centro.setEnabled(false);
        this.material.setEnabled(false);
        this.codigo.setEnabled(false);
        this.datacol.setEnabled(false);
        this.examesol.setEnabled(false);
        this.a1.setEnabled(false);
        this.a2.setEnabled(false);
        this.a3.setEnabled(false);
        this.a4.setEnabled(false);
        this.b1.setEnabled(false);
        this.b2.setEnabled(false);
        this.b3.setEnabled(false);
        this.b4.setEnabled(false);
        this.c1.setEnabled(false);
        this.c2.setEnabled(false);
        this.c3.setEnabled(false);
        this.c4.setEnabled(false);
        this.dr1.setEnabled(false);
        this.dr2.setEnabled(false);
        this.dr3.setEnabled(false);
        this.dr4.setEnabled(false);
        this.dq1.setEnabled(false);
        this.dq2.setEnabled(false);
        this.dq3.setEnabled(false);
        this.dq4.setEnabled(false);
        if ((controle == 4) || (controle == 2) || (controle == 1) || (controle == 0)){       
            this.a1.setText(tipificacao.getA1());
            this.a2.setText(tipificacao.getA2());
            this.b1.setText(tipificacao.getB1());
            this.b2.setText(tipificacao.getB2());
            this.c1.setText(tipificacao.getC1());
            this.c2.setText(tipificacao.getC2());
        }
        if ((controle == 5) || (controle == 0) || (controle == 1) || (controle == 3)){
            this.dr1.setText(tipificacao.getDr1());;
            this.dr2.setText(tipificacao.getDr2());
            this.dq1.setText(tipificacao.getDq1());
            this.dq2.setText(tipificacao.getDq2());
        }
        if ((controle == 1) || (controle == 4)){
            this.a3.setText(tipificacao.getA3());
            this.a4.setText(tipificacao.getA4());
            this.b3.setText(tipificacao.getB3());
            this.b4.setText(tipificacao.getB4());
            this.c3.setText(tipificacao.getC3());
            this.c4.setText(tipificacao.getC4());
        }
        if ((controle == 1) || (controle == 5)){
            this.dr3.setText(tipificacao.getDr3());
            this.dr4.setText(tipificacao.getDr4());
            this.dq3.setText(tipificacao.getDq3());
            this.dq4.setText(tipificacao.getDq4());
        }
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        centro = new javax.swing.JTextField();
        codigo = new javax.swing.JTextField();
        examesol = new javax.swing.JTextField();
        material = new javax.swing.JTextField();
        metodo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        a1 = new javax.swing.JTextField();
        a3 = new javax.swing.JTextField();
        b1 = new javax.swing.JTextField();
        c1 = new javax.swing.JTextField();
        c3 = new javax.swing.JTextField();
        b3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        dq1 = new javax.swing.JTextField();
        dq3 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        dr1 = new javax.swing.JTextField();
        dr3 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        a2 = new javax.swing.JTextField();
        a4 = new javax.swing.JTextField();
        b2 = new javax.swing.JTextField();
        c2 = new javax.swing.JTextField();
        c4 = new javax.swing.JTextField();
        b4 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        compatibilidade = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        dq2 = new javax.swing.JTextField();
        dq4 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        dr2 = new javax.swing.JTextField();
        dr4 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        obs = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        datacol = new javax.swing.JTextField();
        edit = new javax.swing.JButton();

        jLabel18.setText(":");

        jLabel20.setText(":");

        jLabel27.setText("DRB1*");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Tipificação HLA");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nome (Receptor):");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Centro:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Exame Solicitado:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Codigo Exame:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Material Biologico:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Metodologia:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("HLA Classe I");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("HLA Classe II");

        jLabel10.setText("A*");

        jLabel12.setText("B*");

        jLabel14.setText("C*");

        jLabel16.setText(":");

        jLabel17.setText(":");

        jLabel19.setText(":");

        jLabel24.setText("DRB1*");

        jLabel26.setText("DQB1*");

        jLabel29.setText(":");

        jLabel31.setText(":");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel33.setText("Compatibilidade entre Doador e Receptor:");

        jLabel34.setText("A*");

        jLabel35.setText("B*");

        jLabel36.setText("C*");

        jLabel37.setText(":");

        jLabel38.setText(":");

        jLabel39.setText(":");

        compatibilidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Distinto", "Haploidêntico", "Idêntico" }));

        jLabel40.setText("DRB1*");

        jLabel41.setText("DQB1*");

        jLabel42.setText(":");

        jLabel43.setText(":");

        obs.setColumns(20);
        obs.setRows(5);
        obs.setText("Observações");
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

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Data Coleta:");

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
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(centro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codigo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(examesol))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(material))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(metodo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(6, 6, 6)
                                            .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel16)
                                            .addGap(3, 3, 3)
                                            .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(2, 2, 2)
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel14)
                                            .addGap(4, 4, 4)
                                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel17)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel34)
                                            .addGap(6, 6, 6)
                                            .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel37)
                                            .addGap(3, 3, 3)
                                            .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel35)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(1, 1, 1)
                                                    .addComponent(jLabel39)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel36)
                                                    .addGap(4, 4, 4)
                                                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel38)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel26)
                                                        .addComponent(jLabel41))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(dq2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jLabel42)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(dq4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(dq1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jLabel29)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(dq3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel33)
                                    .addGap(43, 43, 43)
                                    .addComponent(compatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dr1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel31)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dr3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(179, 179, 179))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel40)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dr2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel43)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dr4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(75, 75, 75))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(datacol, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(93, 93, 93)
                            .addComponent(edit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cadastrar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(datacol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(centro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(examesol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel10)
                        .addComponent(jLabel12)
                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(jLabel19)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34)
                        .addComponent(jLabel35)
                        .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36)
                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38)
                        .addComponent(jLabel39)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(jLabel9))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dr3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31)
                        .addComponent(jLabel26)
                        .addComponent(dq1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dq3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(dq4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dr4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel43)
                        .addComponent(dq2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel42)
                        .addComponent(jLabel41)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(compatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cadastrar)
                    .addComponent(edit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        if (this.cadastrar.getText().equals("Cadastrar")) {
            TipificacaoHLA novoTipificacao = new TipificacaoHLA(this.exame, 
                    this.obs.getText(), 
                    this.metodo.getText(), 
                    this.compatibilidade.getSelectedItem().toString(), 
                    this.a1.getText(),
                    this.a2.getText(), 
                    this.a3.getText(), 
                    this.a4.getText(), 
                    this.b1.getText(), 
                    this.b2.getText(), 
                    this.b3.getText(), 
                    this.b4.getText(),
                    this.c1.getText(), 
                    this.c2.getText(), 
                    this.c3.getText(), 
                    this.c4.getText(), 
                    this.dr1.getText(), 
                    this.dr2.getText(), 
                    this.dr3.getText(),
                    this.dr4.getText(), 
                    this.dq1.getText(), 
                    this.dq2.getText(), 
                    this.dq3.getText(), 
                    this.dq4.getText());
            if(ResultadosController.CadastrarTipificacao(novoTipificacao)){
                JOptionPane.showMessageDialog(null, "TipificacaoHLA cadastrado com sucesso!");
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro!");
            }
        } else if (this.cadastrar.getText().equals("Excluir")) {
            ResultadosController controladora = new ResultadosController();
            if(controladora.ExcluirResultado(this.tipificacao))
                JOptionPane.showMessageDialog(null, "Resultado excluido com sucesso!");
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "ERRO!");
            }
        
    }//GEN-LAST:event_cadastrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        System.out.println("controle "+this.controle);
        if(this.edit.getText().equals("Editar")){
            if ((controle == 4) || (controle == 2) || (controle == 1) || (controle == 0)){
                this.a1.setEnabled(true);
                this.a2.setEnabled(true);
                this.b1.setEnabled(true);
                this.b2.setEnabled(true);
                this.c1.setEnabled(true);
                this.c2.setEnabled(true);
            }
            if ((controle == 5) || (controle == 0) || (controle == 1) || (controle == 3)){
                this.dr1.setEnabled(true);
                this.dr2.setEnabled(true);
                this.dq1.setEnabled(true);
                this.dq2.setEnabled(true);
            }
            if ((controle == 1) || (controle == 4)){
                this.a3.setEnabled(true);
                this.a4.setEnabled(true);
                this.b3.setEnabled(true);
                this.b4.setEnabled(true);
                this.c3.setEnabled(true);
                this.c4.setEnabled(true);
            }
            if ((controle == 1) || (controle == 5)){
                this.dr3.setEnabled(true);
                this.dr4.setEnabled(true);
                this.dq3.setEnabled(true);
                this.dq4.setEnabled(true);
            }
            this.edit.setText("Salvar");
        }
        else if(this.edit.getText().equals("Salvar")){
            this.tipificacao.setMetodo(this.metodo.getText());
            this.tipificacao.setCompatibilidade(this.compatibilidade.getSelectedItem().toString());
            this.tipificacao.setA1(this.a1.getText());
            this.tipificacao.setA2(this.a2.getText()); 
            this.tipificacao.setA3(this.a3.getText()); 
            this.tipificacao.setA4(this.a4.getText()); 
            this.tipificacao.setB1(this.b1.getText()); 
            this.tipificacao.setB2(this.b2.getText()); 
            this.tipificacao.setB3(this.b3.getText()); 
            this.tipificacao.setB4(this.b4.getText());
            this.tipificacao.setC1(this.c1.getText()); 
            this.tipificacao.setC2(this.c2.getText()); 
            this.tipificacao.setC3(this.c3.getText()); 
            this.tipificacao.setC4(this.c4.getText()); 
            this.tipificacao.setDr1(this.dr1.getText()); 
            this.tipificacao.setDr2(this.dr2.getText()); 
            this.tipificacao.setDr3(this.dr3.getText());
            this.tipificacao.setDr4(this.dr4.getText()); 
            this.tipificacao.setDq1(this.dq1.getText()); 
            this.tipificacao.setDq2(this.dq2.getText()); 
            this.tipificacao.setDq3(this.dq3.getText()); 
            this.tipificacao.setDq4(this.dq4.getText());
            if(ResultadosController.updateHLA(this.tipificacao)){
                JOptionPane.showMessageDialog(null, "Resultado Atualizado com sucesso!");
            }
            else{
                JOptionPane.showMessageDialog(null, "ERRO!");
            }
        }
        
    }//GEN-LAST:event_editActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1;
    private javax.swing.JTextField a2;
    private javax.swing.JTextField a3;
    private javax.swing.JTextField a4;
    private javax.swing.JTextField b1;
    private javax.swing.JTextField b2;
    private javax.swing.JTextField b3;
    private javax.swing.JTextField b4;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c3;
    private javax.swing.JTextField c4;
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField centro;
    private javax.swing.JTextField codigo;
    private javax.swing.JComboBox compatibilidade;
    private javax.swing.JTextField datacol;
    private javax.swing.JTextField dq1;
    private javax.swing.JTextField dq2;
    private javax.swing.JTextField dq3;
    private javax.swing.JTextField dq4;
    private javax.swing.JTextField dr1;
    private javax.swing.JTextField dr2;
    private javax.swing.JTextField dr3;
    private javax.swing.JTextField dr4;
    private javax.swing.JButton edit;
    private javax.swing.JTextField examesol;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField material;
    private javax.swing.JTextField metodo;
    private javax.swing.JTextField nome;
    private javax.swing.JTextArea obs;
    // End of variables declaration//GEN-END:variables
}
