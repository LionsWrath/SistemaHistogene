/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD.Materiais;

import com.psw.conexao.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Juliano
 */
public class MateriaisController {
    
    public static boolean verificaCampos(String modelo, String nome, String fabricante){
        boolean ok;
        
        ok = true;
        if ((modelo.isEmpty()) || (nome.isEmpty()) || (fabricante.isEmpty())){
            ok = false;
        }
        return ok;
    }
    
    public static void cadastrarMaterial(Materiais mat){
        Session ses = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = ses.beginTransaction();
        ses.save(mat);
        trans.commit();
        ses.close();
    }
    
    public static Materiais consultarMaterial(String modelo){
        Session ses = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = ses.beginTransaction();
        Materiais mat;
        
        Criteria query = ses.createCriteria(Materiais.class);
        query.add(Restrictions.eq("modelo", modelo));
        mat = (Materiais) query.uniqueResult();
        return mat;
    }

    public static List buscarModelo(String buscar){
        Session ses = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = ses.beginTransaction();  
        List lista;
        
        Criteria query = ses.createCriteria(Materiais.class);
        query.add(Restrictions.eq("modelo", buscar));
        lista = query.list();
        if (lista.isEmpty()){
            lista = null;
        }
        return lista;     
    }
    
    public static List buscarNome(String buscar){
        Session ses = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = ses.beginTransaction();  
        List lista;
        
        Criteria query = ses.createCriteria(Materiais.class);
        query.add(Restrictions.eq("fabricante", buscar));
        lista = query.list();
        if (lista.isEmpty()){
            lista = null;
        }
        return lista;       
    }
    
    public static void atualizarMaterial(Materiais mat){
        Session ses = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = ses.beginTransaction();  
        ses.update(mat);
        trans.commit();
        ses.close();
        
    }
}
