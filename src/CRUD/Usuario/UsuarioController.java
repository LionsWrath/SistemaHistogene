/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD.Usuario;

import com.psw.conexao.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Juliano
 */
public class UsuarioController {
    
    public static boolean ListarADM(){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        Criteria query = sessao.createCriteria(Usuario.class);
        List userbusca = query.list();
        transacao.commit();
        Iterator iterador = userbusca.iterator();
        System.out.println("3");
        while (iterador.hasNext()){
            Usuario user = (Usuario) iterador.next();
            String permissoes = user.getPermissoes();
            String[] permlist = permissoes.split(" ");
            if (permlist[3].equals("1")){
                return false;
            }
        }
        return true;
    }
    
    public static Usuario consultarUsuarioLogin(String login){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        Criteria query = sessao.createCriteria(Usuario.class);
        query.add(Restrictions.eq("login", login));
        Usuario userbusca = (Usuario) query.uniqueResult();
        transacao.commit();
        if (userbusca != null){
            return userbusca;
        }
        return null;
    }
    
    public static List consultarUsuarioCPF(String cpf){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        Criteria query = sessao.createCriteria(Usuario.class);
        query.add(Restrictions.eq("cpf", cpf));
        List lista = query.list();
        transacao.commit();
        if (lista != null){
            return lista;
        }
        JOptionPane.showMessageDialog(null, "Usuario não encontrado!");
        return null;
    }
    
    public static void CadastrarUsuario(Usuario user){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        try{
            sessao.save(user);
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
        JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
    }
    
    public static boolean updateUsuario(Usuario user){
        
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        try{
            sessao.update(user);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível atualizar o contato. Erro: " + e.getMessage());
            return false;
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                
                System.out.println("Erro ao fechar operação de atualização, Mensagem: " + e.getMessage());
                return false;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Usuario alterado com sucesso!");
        return true;
    
    }
    
    public static boolean deleteUsuario(Usuario user){
        
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        try{
            sessao.delete(user);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível remover o contato. Erro: " + e.getMessage());
            return false;
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                
                System.out.println("Erro ao fechar operação de remoção, Mensagem: " + e.getMessage());
                return false;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Usuario removido com sucesso!");
        return true;
    
    }
}
