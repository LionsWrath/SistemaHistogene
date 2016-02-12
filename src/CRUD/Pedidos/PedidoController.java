/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD.Pedidos;

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
 * @author Ricardo
 */
public class PedidoController {
    public static Pedido consultarPedidoID(int id){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        Criteria query = sessao.createCriteria(Pedido.class);
        query.add(Restrictions.eq("id", id));
        Pedido pedidobusca = (Pedido) query.uniqueResult();
        if (pedidobusca != null){
            return pedidobusca;
        }
        JOptionPane.showMessageDialog(null, "Pedido de compra não encontrado!");
        return null;
    }
    
    public static List consultarPedidoNomeProduto(String nome){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        Criteria query = sessao.createCriteria(Pedido.class);
        query.add(Restrictions.eq("nomeproduto", nome));
        List pedidos = query.list();
        if (pedidos != null){
            return pedidos;
        }
        JOptionPane.showMessageDialog(null, "Pedido de compra não encontrado!");
        return null;
    }
    
    public static List consultarPedidoNomeFabricante(String nome){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        Criteria query = sessao.createCriteria(Pedido.class);
        query.add(Restrictions.eq("nomefabricante", nome));
        List pedidos = query.list();
        if (pedidos != null){
            return pedidos;
        }
        JOptionPane.showMessageDialog(null, "Pedido de compra não encontrado!");
        return null;
    }
    
    public static void ExcluirPedido(Pedido pedido){
        Session sessao = null;
        Transaction transacao = null;
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.delete(pedido);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível inserir o pedido. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de inserção, Mensagem: " + e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Pedido de compra removido com sucesso", "Confirmacao", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void AlterarPedido(Pedido pedido){
        Session sessao = null;
        Transaction transacao = null;
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.update(pedido);
            transacao.commit();
            
        } catch (HibernateException e) {
            System.out.println("Não foi possível inserir o pedido. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de inserção, Mensagem: " + e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Pedido de compra alterado com sucesso", "Confirmacao", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static boolean CadastrarPedido(Pedido pedido){
        Session sessao = null;
        Transaction transacao = null;
        try {

            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.save(pedido);
            transacao.commit();

        } catch (HibernateException e) {
            System.out.println("Não foi possível inserir o pedido. Erro: " + e.getMessage());
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

    
    
}
