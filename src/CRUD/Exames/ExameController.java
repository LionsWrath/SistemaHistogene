/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD.Exames;

import com.psw.conexao.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Carlos
 */
public class ExameController {
    
    public static boolean CadastrarExame(Exame exame){
        Session sessao = null;
            Transaction transacao = null;
            try {

                sessao = HibernateUtil.getSessionFactory().openSession();
                transacao = sessao.beginTransaction();
                sessao.save(exame);
                transacao.commit();
                
            } catch (HibernateException e) {
                System.out.println("Não foi possível inserir o contato. Erro: " + e.getMessage());
                return false;
            } finally {
                try {
                    sessao.close();
                    return true;
                } catch (Throwable e) {
                    System.out.println("Erro ao fechar operação de inserção, Mensagem: " + e.getMessage());
                    return false;
                }
            }
    }
    
    public static boolean vertificaMaterial(String tipo){
        //Verificação para quando existir o gerenciamento de materiais
        return true;
    }
    
    
    public static Exame consultarExameID(int id){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        Criteria query = sessao.createCriteria(Exame.class);
        query.add(Restrictions.eq("id", id));
        Exame examebusca = (Exame) query.uniqueResult();
        if (examebusca != null){
            return examebusca;
        }
        JOptionPane.showMessageDialog(null, "Exame não encontrado por ID!");
        return null;
    }
    
    public static List consultarExameNome(String nome){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        Criteria query = sessao.createCriteria(Exame.class);
        query.add(Restrictions.eq("nome", nome));
        List exames = query.list();
        if (!(exames.isEmpty())){
            return exames;
        }
        JOptionPane.showMessageDialog(null, "Exame não encontrado por Nome!");
        return null;
    }
    
    public static void ExcluirExame(Exame exame){
        Session sessao = null;
        Transaction transacao = null;
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.delete(exame);
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
        JOptionPane.showMessageDialog(null, "Exame removido com sucesso", "Confirmacao", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void AlterarExame(Exame exame){
        Session sessao = null;
        Transaction transacao = null;
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.update(exame);
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
        JOptionPane.showMessageDialog(null, "Exame alterado com sucesso", "Confirmacao", JOptionPane.INFORMATION_MESSAGE);
    }
}