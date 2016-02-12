/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD.Pagamentos;

import CRUD.Exames.Exame;
import com.psw.conexao.HibernateUtil;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Caio
 */
public class PagamentoController {
    
    public static boolean validaValor(float valor){
        boolean valido = false;
        
        if (valor > 0){
            valido = true;
        }        
        return valido;
    }
    
    public static void adicionarPagamento(Pagamento pag, Exame ex){
        Session ses = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = ses.beginTransaction();
        ex.setPago(true);
        ses.save(pag);
        ses.update(ex);
        trans.commit();
    }
    
    public static Pagamento consultarPagamentoID(int id){
        Session ses = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = ses.beginTransaction();
        
        Criteria query = ses.createCriteria(Pagamento.class);
        query.add(Restrictions.eq("idPagamento", id));
        Pagamento resultados = (Pagamento) query.uniqueResult();
        if (resultados == null){
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar pagamento \n para este ID!");
        }
        return resultados;
    }
    
    public static void removerPagamento(Pagamento pag, Exame ex){
        Session ses = new HibernateUtil().getSessionFactory().openSession();
        Transaction trans = ses.beginTransaction();
        ses.update(pag);
        ses.update(ex);
        trans.commit();
    }
    
    public static void atualizarPagamento(Pagamento pag){
        Session ses = new HibernateUtil().getSessionFactory().openSession();
        Transaction trans = ses.beginTransaction();
        ses.update(pag);
        trans.commit();
    }
    
    public static String pegarDia(){        
        Date data = new Date(System.currentTimeMillis());
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");  
        return formatador.format(data);
    }
}
