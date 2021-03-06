/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD.Usuario;

import com.psw.conexao.HibernateUtil;
import Principal.IntegersOnlyDocument;
import Principal.LengthRestrictedDocument;
import java.util.Iterator;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Juliano
 */
public class ConsultarUsuario extends javax.swing.JFrame {
    
    private List listaIT = null;
    private Iterator iterador = null;
    /**
     * Creates new form ConsultarUsuario
     */
    public ConsultarUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.logintext.setDocument(new LengthRestrictedDocument(20));
        this.cpftext.setDocument(new IntegersOnlyDocument(11));
        this.login.setSelected(true);
        this.cpftext.setEnabled(false);
        this.table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcao = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        login = new javax.swing.JRadioButton();
        cpf = new javax.swing.JRadioButton();
        logintext = new javax.swing.JTextField();
        cpftext = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Consultar Usuario");

        opcao.add(login);
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        opcao.add(cpf);
        cpf.setText("CPF");
        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfActionPerformed(evt);
            }
        });

        logintext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logintextActionPerformed(evt);
            }
        });

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Visualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Excluir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Login", "CPF", "Nome", "Senha", "Telefone Residencial"
            }
        ));
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cpf)
                                .addGap(67, 67, 67)
                                .addComponent(cpftext, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addGap(137, 137, 137)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logintext, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(logintext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf)
                    .addComponent(cpftext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        if (login.isSelected()){
            logintext.setEnabled(true);
            cpftext.setEnabled(false);
        }
    }//GEN-LAST:event_loginActionPerformed

    private void logintextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logintextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logintextActionPerformed

    private void cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfActionPerformed
        if (cpf.isSelected()){
            logintext.setEnabled(false);
            cpftext.setEnabled(true);
        }
    }//GEN-LAST:event_cpfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel listModel = (DefaultTableModel) this.table.getModel();
        if (login.isSelected()) {
            UsuarioController controladora = new UsuarioController();
            Usuario user = controladora.consultarUsuarioLogin(this.logintext.getText());
            limparTabela();
            if (user != null){
                String nome = user.getPrimeironome() + " " + user.getMeionome() + " " + user.getUltimonome();
                listModel.addRow(new Object[]{user.getLogin(), user.getCpf(), nome, user.getSenha(), user.getTelres()});
            }
            
        } else if (cpf.isSelected()) {
            UsuarioController controladora = new UsuarioController();
            List lista = controladora.consultarUsuarioCPF(this.cpftext.getText());
            Iterator it = lista.iterator();
            limparTabela();
            while (it.hasNext()) {
                Usuario user = (Usuario) it.next();
                String nome = user.getPrimeironome() + " " + user.getMeionome() + " " + user.getUltimonome() + " ";
                listModel.addRow(new Object[]{user.getLogin(), user.getCpf(), nome, user.getSenha(), user.getTelres()});

            }
        }

    


    }//GEN-LAST:event_jButton1ActionPerformed

    private void limparTabela(){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int qtde = this.table.getRowCount();
        for (int a = 0; a < qtde; a++) {
            model.removeRow(0);
            
        }
        this.logintext.setText("");
        this.cpftext.setText("");
    }

    public JRadioButton getCpf() {
        return cpf;
    }

    public void setCpf(JRadioButton cpf) {
        this.cpf = cpf;
    }

    public JTextField getCpftext() {
        return cpftext;
    }

    public void setCpftext(JTextField cpftext) {
        this.cpftext = cpftext;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public JButton getjButton4() {
        return jButton4;
    }

    public void setjButton4(JButton jButton4) {
        this.jButton4 = jButton4;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JRadioButton getLogin() {
        return login;
    }

    public void setLogin(JRadioButton login) {
        this.login = login;
    }

    public JTextField getLogintext() {
        return logintext;
    }

    public void setLogintext(JTextField logintext) {
        this.logintext = logintext;
    }

    public ButtonGroup getOpcao() {
        return opcao;
    }

    public void setOpcao(ButtonGroup opcao) {
        this.opcao = opcao;
    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (this.table.getSelectedRow() != -1) {
            UsuarioController controladora = new UsuarioController();
            Usuario user = controladora.consultarUsuarioLogin(this.table.getValueAt(this.table.getSelectedRow(), 0).toString());
            new CadastrarUsuarioInterface(user).setVisible(true);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (this.table.getSelectedRow() != -1) {
            UsuarioController controladora = new UsuarioController();
            Usuario user = controladora.consultarUsuarioLogin(this.table.getValueAt(this.table.getSelectedRow(), 0).toString());
            if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esse usuario?", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                Session sessao = null;
                Transaction transacao = null;
                try {

                    sessao = HibernateUtil.getSessionFactory().openSession();
                    transacao = sessao.beginTransaction();
                    sessao.delete(user);
                    transacao.commit();
                } catch (HibernateException e) {
                    System.out.println("Não foi possível inserir o contato. Erro: " + e.getMessage());
                } finally {
                    try {
                        sessao.close();
                    } catch (Throwable e) {
                        System.out.println("Erro ao fechar operação de inserção, Mensagem: " + e.getMessage());
                    }
                }
                JOptionPane.showMessageDialog(null, "Usuario removido com sucesso", "Confirmacao", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        }

        
    
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton cpf;
    private javax.swing.JTextField cpftext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton login;
    private javax.swing.JTextField logintext;
    private javax.swing.ButtonGroup opcao;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
