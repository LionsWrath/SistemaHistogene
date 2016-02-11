/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD.SalaEquipamentos;

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
public class SalaEquipamentosController {
    
    public static boolean CadastrarMedicao(SalaEquipamento itemmedicao){
        Session sessao = null;
        Transaction transacao = null;
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.save(itemmedicao);
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
    
    public static List ListarMedicoes(String item){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        Criteria query = sessao.createCriteria(SalaEquipamento.class);
        query.add(Restrictions.eq("item", item));
        List medicoes = query.list();
        if (!(medicoes.isEmpty())){
            return medicoes;
        }
        JOptionPane.showMessageDialog(null, "Nenhuma medição encontrada!");
        return null;
    }
    
}
