/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD.Usuario;

import Principal.IntegersOnlyDocument;
import Principal.LengthRestrictedDocument;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Juliano
 */
public class CadastrarUsuarioInterface extends javax.swing.JFrame {

    private String permissoes;
    private Usuario user;
    
    public CadastrarUsuarioInterface() {
        initComponents();
        this.excluir.setVisible(false);
        this.setLocationRelativeTo(null);
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

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
    public CadastrarUsuarioInterface(Usuario user) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.user = user;
        this.cadastrar.setText("Editar");
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
        this.nome.setText(user.getPrimeironome() + " " + user.getMeionome() + " " + user.getUltimonome());
        this.dia.setText(user.getDianasc());
        this.mes.setText(user.getMesnasc());
        this.ano.setText(user.getAnonasc());
        this.cpf.setText(user.getCpf());
        this.rg.setText(user.getRg());
        this.endereco.setText(user.getEndereco());
        this.cidade.setText(user.getCidade());
        this.cep.setText(user.getCep());
        this.telres.setText(user.getTelres());
        this.telcom.setText(user.getTelcom());
        this.telcel.setText(user.getTelcel());
        this.login.setText(user.getLogin());
        if (user.getSex().equals("Masculino")){
            this.masculino.setSelected(true);
            this.feminino.setSelected(false);
        }
        else{
            this.masculino.setSelected(false);
            this.feminino.setSelected(true);
        }
        this.obs.setText(user.getObs());
        this.estado.setSelectedItem(user.getEstado());
        this.nome.setEnabled(false);
        this.dia.setEnabled(false);
        this.mes.setEnabled(false);
        this.ano.setEnabled(false);
        this.cpf.setEnabled(false);
        this.rg.setEnabled(false);
        this.endereco.setEnabled(false);
        this.cidade.setEnabled(false);
        this.cep.setEnabled(false);
        this.telres.setEnabled(false);
        this.telcom.setEnabled(false);
        this.telcel.setEnabled(false);
        this.login.setEnabled(false);
        this.senha.setEnabled(false);
        this.masculino.setEnabled(false);
        this.feminino.setEnabled(false);
        this.estado.setEnabled(false);
        this.obs.setEnabled(false);
        this.permbutton.setEnabled(false);
        this.permissoes = user.getPermissoes();
    }
    
    private List listaIT = null;
    private Iterator iterador = null;
    public boolean checkfield(){
        if (this.cpf.getText().equals("") || this.nome.getText().equals("") || this.rg.getText().equals("") || this.cidade.getText().equals("") || this.endereco.getText().equals("")  || this.cep.getText().equals("") || this.dia.getText().equals("") || this.mes.getText().equals("") || this.ano.getText().equals("") || this.telres.getText().equals("") || this.login.getText().equals("") || this.senha.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Os campos obrigatorios nao forma preenchidos!");
            return false;
        }
        else {
            return true;
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

        sex = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        masculino = new javax.swing.JRadioButton();
        feminino = new javax.swing.JRadioButton();
        nome = new javax.swing.JTextField();
        dia = new javax.swing.JTextField();
        mes = new javax.swing.JTextField();
        ano = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        rg = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cep = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        estado = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        telres = new javax.swing.JTextField();
        telcom = new javax.swing.JTextField();
        telcel = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        obs = new javax.swing.JTextArea();
        perm = new javax.swing.JCheckBox();
        permbutton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        senha = new javax.swing.JPasswordField();
        excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Cadastrar Usuario");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("* Nome:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("* Data Nascimento:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("* CPF:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("* RG:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("* Sexo:");

        sex.add(masculino);
        masculino.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        masculino.setText("Masculino");

        sex.add(feminino);
        feminino.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        feminino.setText("Feminino");

        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });

        jLabel7.setText("/");

        jLabel8.setText("/");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("* Endereco:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("* CEP:");

        cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("* Cidade:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("* Estado:");

        estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Telefone(s) de contato:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("* Residencial:");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Comercial:");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Celular:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("* Login:");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("* Senha");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("(Maximo de 15 caracteres)");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText("(Maximo de 15 caracteres)");

        obs.setColumns(20);
        obs.setRows(5);
        obs.setText("Observações");
        jScrollPane1.setViewportView(obs);

        perm.setText("*");
        perm.setEnabled(false);
        perm.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        permbutton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        permbutton.setText("Permissões de Usuario");
        permbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permbuttonActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(2, 2, 2)
                                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(feminino)
                            .addComponent(masculino))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(95, 95, 95)
                                .addComponent(excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cadastrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel13)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel14)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(telres, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(telcom, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(telcel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(login)
                                            .addComponent(senha, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel20)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(perm)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(permbutton)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(masculino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(feminino)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel13)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(telres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(telcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(telcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(perm)
                    .addComponent(permbutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(cadastrar)
                    .addComponent(excluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaActionPerformed

    private void cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        if (this.cadastrar.getText().equals("Cadastrar")){
            if (checkfield()) {

                boolean erros = false;

                String nomestr = this.nome.getText();
                String[] array = nomestr.split(" ");
                if (array.length == 1) {

                    JOptionPane.showMessageDialog(null, "Nome deve ser composto de no minimo NOME e SOBRENOME");
                    erros = true;
                }
                if (!(this.perm.isSelected())) {
                    JOptionPane.showMessageDialog(null, "É necessário selecionar as permissões do novo usuario! \n Favor Clicar em 'Permissoes de Usuario'");
                    erros = true;
                }
                if (!erros) {
                    String primeironome = "";
                    String meionome = "";
                    String ultimonome = "";
                    if (array.length == 2) {

                        primeironome = array[0];
                        ultimonome = array[1];
                    } else {

                        primeironome = array[0];
                        meionome = array[1];
                        ultimonome = array[array.length - 1];
                    }

                    UsuarioController controladora = new UsuarioController();
                    Usuario buscauser = controladora.consultarUsuarioLogin(this.login.getText());
                    if (buscauser == null) {
                        Usuario user = new Usuario(
                                primeironome,
                                meionome,
                                ultimonome,
                                this.dia.getText(),
                                this.mes.getText(),
                                this.ano.getText(),
                                this.sex.getSelection().getActionCommand(),
                                this.cpf.getText(),
                                this.rg.getText(),
                                this.endereco.getText(),
                                this.cep.getText(),
                                this.cidade.getText(),
                                this.estado.getSelectedItem().toString(),
                                this.telres.getText(),
                                this.telcom.getText(),
                                this.telcel.getText(),
                                this.login.getText(),
                                this.senha.getText(),
                                this.permissoes,
                                this.obs.getText());
                        controladora.CadastrarUsuario(user);
                        this.dispose();

                    }

                }
            }
        }
        else if(this.cadastrar.getText().equals("Editar")){
            this.cadastrar.setText("Salvar");
            this.masculino.setEnabled(true);
            this.feminino.setEnabled(true);
            this.nome.setEnabled(true);
            this.dia.setEnabled(true);
            this.mes.setEnabled(true);
            this.ano.setEnabled(true);
            this.cpf.setEnabled(true);
            this.rg.setEnabled(true);
            this.endereco.setEnabled(true);
            this.cidade.setEnabled(true);
            this.cep.setEnabled(true);
            this.telres.setEnabled(true);
            this.telcom.setEnabled(true);
            this.telcel.setEnabled(true);
            this.senha.setEnabled(true);
            this.masculino.setEnabled(true);
            this.feminino.setEnabled(true);
            this.estado.setEnabled(true);
            this.obs.setEnabled(true);
            this.permbutton.setEnabled(true);
        }
        else if (this.cadastrar.getText().equals("Salvar")){
            String nomestr = this.nome.getText();
            String[] array = nomestr.split(" ");
            String primeironome = "";
            String meionome = "";
            String ultimonome = "";
            if (array.length == 2) {

                primeironome = array[0];
                ultimonome = array[1];
            } else {

                primeironome = array[0];
                meionome = array[1];
                ultimonome = array[array.length - 1];
            }
            this.user.setPrimeironome(primeironome);
            this.user.setMeionome(meionome);
            this.user.setUltimonome(ultimonome);
            this.user.setDianasc(this.dia.getText());
            this.user.setMesnasc(this.mes.getText());
            this.user.setAnonasc(this.ano.getText());
            this.user.setSex(this.sex.getSelection().getActionCommand());
            this.user.setCpf(this.cpf.getText());
            this.user.setRg(this.rg.getText());
            this.user.setEndereco(this.endereco.getText());
            this.user.setCep(this.cep.getText());
            this.user.setCidade(this.cidade.getText());
            this.user.setEstado(this.estado.getSelectedItem().toString());
            this.user.setTelres(this.telres.getText());
            this.user.setTelcom(this.telcom.getText());
            this.user.setTelcel(this.telcel.getText());
            this.user.setSenha(this.senha.getText());
            this.user.setObs(this.obs.getText());
            this.user.setPermissoes(this.permissoes);
            UsuarioController controladora = new UsuarioController();
            boolean alterar = controladora.updateUsuario(this.user);
            if (alterar){
                this.dispose();
            }
        }
    }//GEN-LAST:event_cadastrarActionPerformed

    private void permbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permbuttonActionPerformed
        if (this.user != null){
            System.out.println("caiu 1");
            PermissoesUsuario permissoesx = new PermissoesUsuario(this, true, this.user);
            permissoesx.setVisible(true);
            this.permissoes = permissoesx.getPermissoes();
            if (!(this.permissoes.equals(""))){
                this.perm.setSelected(true);
            }
        }
        else{
            System.out.println("caiu 2");
            PermissoesUsuario permissoesx = new PermissoesUsuario(this, true);
            permissoesx.setVisible(true);
            this.permissoes = permissoesx.getPermissoes();
            if (!(this.permissoes.equals(""))){
                this.perm.setSelected(true);
            }
        }
    }//GEN-LAST:event_permbuttonActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        UsuarioController controladora = new UsuarioController();
        boolean remover = controladora.deleteUsuario(this.user);
        if (remover){
            this.dispose();
        }
    }//GEN-LAST:event_excluirActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ano;
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField cep;
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField dia;
    private javax.swing.JTextField endereco;
    private javax.swing.JComboBox estado;
    private javax.swing.JButton excluir;
    private javax.swing.JRadioButton feminino;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField login;
    private javax.swing.JRadioButton masculino;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField nome;
    private javax.swing.JTextArea obs;
    private javax.swing.JCheckBox perm;
    private javax.swing.JButton permbutton;
    private javax.swing.JTextField rg;
    private javax.swing.JPasswordField senha;
    private javax.swing.ButtonGroup sex;
    private javax.swing.JTextField telcel;
    private javax.swing.JTextField telcom;
    private javax.swing.JTextField telres;
    // End of variables declaration//GEN-END:variables
}
