/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD.Pacientes;

import com.psw.conexao.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Caio
 */
public class PacientesController {
    public static Paciente getNomePaciente(String rg){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        Criteria query = sessao.createCriteria(Paciente.class);
        query.add(Restrictions.eq("rg", rg));
        Paciente paciente = (Paciente) query.uniqueResult();
        transacao.commit();
        if (paciente != null){
            return paciente;
        }
        return null;

    }
}
