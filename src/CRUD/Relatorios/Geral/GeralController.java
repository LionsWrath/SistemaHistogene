/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD.Relatorios.Geral;

import CRUD.Exames.Exame;
import com.psw.conexao.HibernateUtil;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ricardo
 */
public class GeralController {
    public void GerarRelatorioGeral(String dateinicial, String datefinal) throws ParseException{
        DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Date startDate  = (Date)formatter.parse(dateinicial);
        Date endDate = (Date)formatter.parse(datefinal);

// Assign values to startDate and endDate


        String hqlQuery = "FROM exames WHERE data BETWEEN :startDate AND :endDate";
        String hqlQuery2 = "FROM resultados WHERE data BETWEEN :startDate AND :endDate";
        String hqlQuery3 = "FROM pagamentos WHERE data BETWEEN :startDate AND :endDate";
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        Query query = sessao.createQuery(hqlQuery);
        Iterator iterador = query.iterate();
        while (iterador.hasNext()){
            Exame exam = (Exame) iterador.next();
            System.out.println(exam.getNome());
            
        }
    }
}
