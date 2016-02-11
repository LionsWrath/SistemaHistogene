/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD.SalaEquipamentos.Itens;

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
public class ItemController {
    
    public static boolean CadastrarItem(Item itemcadastrar){
        Session sessao = null;
        Transaction transacao = null;
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.save(itemcadastrar);
            transacao.commit();
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível inserir o contato. Erro: " + e.getMessage());
            return false;
        } finally {
            try {
                sessao.close();
                return true;
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar operação de inserção, Mensagem: " + e.getMessage());
                return false;
            }
        }
    }
    
    public static boolean ExcluirItem(Item excluiritem){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
   
        try {        
            sessao.delete(excluiritem);
            transacao.commit();
        }
        catch (HibernateException e) {
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
    
    
    public static Item ConsultarItem(String nome){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        Criteria query = sessao.createCriteria(Item.class);
        query.add(Restrictions.eq("nome", nome));
        Item resultadobusca = (Item) query.uniqueResult();
        if (resultadobusca != null){
            return resultadobusca;
        }
        return null;
    }
    
    public static List ListarItens(){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        Criteria query = sessao.createCriteria(Item.class);
        List resultadobusca = query.list();

        return resultadobusca;
    }
    
    public static boolean UpdateItem(Item item){
        Session sessao = null;
        Transaction transacao = null;
        try {

            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.update(item);
            transacao.commit();
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível inserir o contato. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
                return true;
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar operação de inserção, Mensagem: " + e.getMessage());
                return false;
            }
        }
    }
}
