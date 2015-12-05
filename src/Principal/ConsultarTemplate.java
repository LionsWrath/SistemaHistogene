
package Principal;

/**
 *
 * @author Caio
 */
public abstract class ConsultarTemplate extends javax.swing.JFrame {
    
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JList listapacientes;
    public javax.swing.JTextField nome;
    public javax.swing.JLabel titulo;
    
    public ConsultarTemplate() {
        initComponents();
        this.nome.setDocument(new LengthRestrictedDocument(40));
    }
    
    public void initComponents() {

        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listapacientes = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titulo.setText("Consultar X");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jButton1.setText("Procurar");


        jScrollPane1.setViewportView(listapacientes);

        jButton2.setText("Visualizar");

        jButton3.setText("Sair");


        jButton4.setText("Alterar");

        jButton5.setText("Excluir");
        
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addGap(28, 28, 28)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton3))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }
    
    public void setTitulo(){
        this.titulo.setText("Consultar");
    }
    

}
