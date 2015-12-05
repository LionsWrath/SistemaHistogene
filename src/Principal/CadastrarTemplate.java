/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Principal;


/**
 *
 * @author Caio
 */
public abstract class CadastrarTemplate extends javax.swing.JFrame {
    
    
    static final String USER = "teste";
    static final String PASS = "teste";
    public javax.swing.JPasswordField senha;
    public javax.swing.JLabel senhalabel;
    public javax.swing.JTextField login;
    public javax.swing.JLabel loginlabel;
    public javax.swing.JCheckBox administrador;
    public javax.swing.JButton permissoes;
    public javax.swing.JTextField ano;
    public javax.swing.JTextField cep;
    public javax.swing.JTextField cidade;
    public javax.swing.JTextField cpf;
    public javax.swing.JTextField dia;
    public javax.swing.JTextField endereco;
    public javax.swing.JComboBox estado;
    public javax.swing.JRadioButton feminino;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    
    public javax.swing.JRadioButton masculino;
    public javax.swing.JTextField mes;
    public javax.swing.JTextField nome;
    public javax.swing.JTextField obs;
    public javax.swing.JTextField rg;
    
    public javax.swing.ButtonGroup sexo;
    public javax.swing.JTextField telcel;
    public javax.swing.JTextField telcom;
    public javax.swing.JTextField telres;
    // End of variables declaration 
    
    
    public CadastrarTemplate() {
        initComponents();
        
        this.masculino.setActionCommand("Masculino");
        this.feminino.setActionCommand("Feminino");
        this.masculino.setSelected(true);
        this.nome.setDocument(new LengthRestrictedDocument(40));
        this.cpf.setDocument(new IntegersOnlyDocument(11));
        this.rg.setDocument(new IntegersOnlyDocument(8));
        this.cep.setDocument(new IntegersOnlyDocument(8));
        this.telres.setDocument(new IntegersOnlyDocument(11));
        this.telcom.setDocument(new IntegersOnlyDocument(11));
        this.telcel.setDocument(new IntegersOnlyDocument(11));
        this.obs.setDocument(new LengthRestrictedDocument(300));
        this.dia.setDocument(new IntegersOnlyDocument(2));
        this.mes.setDocument(new IntegersOnlyDocument(2));
        this.ano.setDocument(new IntegersOnlyDocument(4));
        this.login.setDocument(new LengthRestrictedDocument(15));
        this.senha.setDocument(new LengthRestrictedDocument(15));
        

    }
    
      
    
    
    public void initComponents() {
        login = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        sexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        telres = new javax.swing.JTextField();
        telcom = new javax.swing.JTextField();
        telcel = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        rg = new javax.swing.JTextField();
        masculino = new javax.swing.JRadioButton();
        feminino = new javax.swing.JRadioButton();
        endereco = new javax.swing.JTextField();
        cep = new javax.swing.JTextField();
        cidade = new javax.swing.JTextField();
        estado = new javax.swing.JComboBox();
        dia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        obs = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        mes = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        ano = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Cadastrar Paciente");

        jLabel2.setText("* Nome:");

        jLabel3.setText("* Endereco:");

        jLabel4.setText("* Sexo:");

        jLabel5.setText("* Cidade:");

        jLabel6.setText("* Estado:");

        jLabel7.setText("* Cep:");

        jLabel8.setText("* CPF:");

        jLabel9.setText("* RG:");

        jLabel10.setText("* Data de Nascimento:");

        jLabel11.setText("Telefone(s) de contato:");

        jLabel12.setText("* Residencial:");

        jLabel13.setText("Comercial:");

        jLabel14.setText("Celular:");

        sexo.add(masculino);
        masculino.setText("Masculino");
        masculino.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masculinoActionPerformed(evt);
            }
        });

        sexo.add(feminino);
        feminino.setText("Feminino");

        estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel17.setText("Observacoes:");

        jLabel18.setText("/");

        jLabel19.setText("/");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telres, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(telcom, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(telcel))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(endereco))
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel2))
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(masculino)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(feminino))
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addGap(18, 18, 18)
                                    .addComponent(obs, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4)
                    .addComponent(masculino)
                    .addComponent(feminino)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(telres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(telcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(telcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obs, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }

    public void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        
    }
    
    public boolean checkcpf(String cpf){
        return false;
    }
    
    public void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.dispose();
    }
    public void masculinoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }
    

}
