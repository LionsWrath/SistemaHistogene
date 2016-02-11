/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD.Resultados;

import CRUD.Exames.*;
import com.psw.conexao.HibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Caio
 */

public class ResultadosController {
    

    public static Resultados consultarResultadoID(int id){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        Criteria query = sessao.createCriteria(Resultados.class);
        query.add(Restrictions.eq("id", id));
        Resultados resultadobusca = (Resultados) query.uniqueResult();
        if (resultadobusca != null){
            return resultadobusca;
        }
        return null;
    }
    
    public static PRA consultarPRAID(int id){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        Criteria query = sessao.createCriteria(PRA.class);
        query.add(Restrictions.eq("id", id));
        PRA resultadobusca = (PRA) query.uniqueResult();
        if (resultadobusca != null){
            return resultadobusca;
        }
        return null;
    }
    public static HLA_B27 consultarHLA_B27ID(int id){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        Criteria query = sessao.createCriteria(HLA_B27.class);
        query.add(Restrictions.eq("id", id));
        HLA_B27 resultadobusca = (HLA_B27) query.uniqueResult();
        if (resultadobusca != null){
            return resultadobusca;
        }
        return null;
    }
    public static CrossMatch consultarCrossMatchID(int id){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        Criteria query = sessao.createCriteria(CrossMatch.class);
        query.add(Restrictions.eq("id", id));
        CrossMatch resultadobusca = (CrossMatch) query.uniqueResult();
        if (resultadobusca != null){
            return resultadobusca;
        }
        return null;
    }
    public static TipificacaoHLA consultarTipificacaoID(int id){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        Criteria query = sessao.createCriteria(TipificacaoHLA.class);
        query.add(Restrictions.eq("id", id));
        TipificacaoHLA resultadobusca = (TipificacaoHLA) query.uniqueResult();
        if (resultadobusca != null){
            return resultadobusca;
        }
        return null;
    }
    
    public static boolean ExcluirResultado(Resultados resultado){
        Session sessao = null;
        Transaction transacao = null;
        Session sessao2 = null;
        Transaction transacao2 = null;
    
        try {
            
            sessao = HibernateUtil.getSessionFactory().openSession();
            ExameController controladora = new ExameController();;
            Exame exame = controladora.consultarExameID(resultado.getId());
            transacao = sessao.beginTransaction();
            if (exame.getTipo().equals("CrossMatch")) {
                CrossMatch crossmatch = consultarCrossMatchID(resultado.getId());
                sessao.delete(crossmatch);
                transacao.commit();
            } else if (exame.getTipo().equals("PRA")) {
                PRA pra = consultarPRAID(resultado.getId());
                sessao.delete(pra);
                transacao.commit();
            } else if (exame.getTipo().equals("HLA B27")) {
                HLA_B27 b27 = consultarHLA_B27ID(resultado.getId());
                sessao.delete(b27);
                transacao.commit();
            } else {
                TipificacaoHLA tipificacao = consultarTipificacaoID(resultado.getId());
                sessao.delete(tipificacao);
                transacao.commit();
            }
            sessao2 = HibernateUtil.getSessionFactory().openSession();
            transacao2 = sessao2.beginTransaction();
            sessao2.delete(resultado);
            transacao2.commit();
            return true;
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
    
    public static boolean updateCross(CrossMatch cross){
        
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        try{
            sessao.update(cross);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível atualizar o contato. Erro: " + e.getMessage());
            return false;
        } finally {
            try {
                sessao.close();
                return true;
            } catch (Throwable e) {
                
                System.out.println("Erro ao fechar operação de atualização, Mensagem: " + e.getMessage());
                return false;
            }
        }
    }
    
    public static boolean updateB27(HLA_B27 b27){
        
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        try{
            sessao.update(b27);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível atualizar o contato. Erro: " + e.getMessage());
            return false;
        } finally {
            try {
                sessao.close();
                return true;
            } catch (Throwable e) {
                
                System.out.println("Erro ao fechar operação de atualização, Mensagem: " + e.getMessage());
                return false;
            }
        }
    }
    
    public static boolean updatePRA(PRA pra){
        
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        try{
            sessao.update(pra);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível atualizar o contato. Erro: " + e.getMessage());
            return false;
        } finally {
            try {
                sessao.close();
                return true;
            } catch (Throwable e) {
                
                System.out.println("Erro ao fechar operação de atualização, Mensagem: " + e.getMessage());
                return false;
            }
        }
    }
    
    public static boolean updateHLA(TipificacaoHLA hla){
        
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        try{
            sessao.update(hla);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível atualizar o contato. Erro: " + e.getMessage());
            return false;
        } finally {
            try {
                sessao.close();
                return true;
            } catch (Throwable e) {
                
                System.out.println("Erro ao fechar operação de atualização, Mensagem: " + e.getMessage());
                return false;
            }
        }
    }
    
    public static boolean CadastrarHLA_B27(HLA_B27 novoHla_b27){
        Session sessao = null;
        Transaction transacao = null;
        try {

            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.save(novoHla_b27);
            transacao.commit();
        } catch (HibernateException e) {
            sessao.close();
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
    
    public static boolean CadastrarCrossMatch(CrossMatch cross){
        Session sessao = null;
        Transaction transacao = null;
        try {

            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.save(cross);
            transacao.commit();
        } catch (HibernateException e) {
            sessao.close();
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
    
    public static boolean CadastrarPRA(PRA pra){
        Session sessao = null;
        Transaction transacao = null;
        try {

            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.save(pra);
            transacao.commit();
        } catch (HibernateException e) {
            sessao.close();
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
    
    public static boolean CadastrarTipificacao(TipificacaoHLA hla){
        Session sessao = null;
        Transaction transacao = null;
        try {
            
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.save(hla);
            transacao.commit();
        } catch (HibernateException e) {
            sessao.close();
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
    
    public static boolean CadastrarResultado(String idbusca){
        try{
            int id = Integer.parseInt(idbusca);
            ExameController controladora = new ExameController();
            Exame examebusca = controladora.consultarExameID(id);

            if (examebusca != null) {
                ResultadosController controladora2 = new ResultadosController();
                Resultados resultado = controladora2.consultarResultadoID(examebusca.getId());
                if (resultado == null) {
                    if (examebusca.getTipo().equals("PRA")) {
                        new PRAInterface(examebusca).setVisible(true);
                    }
                    if (examebusca.getTipo().equals("HLA B27")) {
                        new HLA_B27Interface(examebusca).setVisible(true);
                    } else if (examebusca.getTipo().equals("CrossMatch")) {
                        new CrossMatchInterface(examebusca).setVisible(true);
                    } else if (examebusca.getTipo().equals("Tipificação - C I - C II (Baixa / Media Resolução)")) {
                        new TipificacaoHLAInterface(examebusca, 0).setVisible(true);
                    } else if (examebusca.getTipo().equals("Tipificação - C I - C II (Alta Resolução)")) {
                        new TipificacaoHLAInterface(examebusca, 1).setVisible(true);
                    } else if (examebusca.getTipo().equals("Tipificação - C I  (Baixa / Media Resolução)")) {
                        new TipificacaoHLAInterface(examebusca, 2).setVisible(true);
                    } else if (examebusca.getTipo().equals("Tipificação - C II (Baixa / Media Resolução)")) {
                        new TipificacaoHLAInterface(examebusca, 3).setVisible(true);
                    } else if (examebusca.getTipo().equals("Tipificação - C I  (Alta Resolução)")) {
                        new TipificacaoHLAInterface(examebusca, 4).setVisible(true);
                    } else if (examebusca.getTipo().equals("Tipificação - C II (Alta Resolução)")) {
                        new TipificacaoHLAInterface(examebusca, 5).setVisible(true);
                    }
                } else {
                    int reply = JOptionPane.showConfirmDialog(null, "Ja existe um resultado cadastrado para esse exame!"
                            + " \n Deseja Altera-lo?", "Resultado já cadastrado", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) {
                        if (examebusca.getTipo().equals("PRA")) {
                            PRA resultadopra = controladora2.consultarPRAID(resultado.getId());
                            new PRAInterface(examebusca, resultadopra).setVisible(true);
                        }
                        if (examebusca.getTipo().equals("HLA B27")) {
                            HLA_B27 resultadoprab27 = controladora2.consultarHLA_B27ID(resultado.getId());
                            new HLA_B27Interface(examebusca, resultadoprab27).setVisible(true);
                        } else if (examebusca.getTipo().equals("CrossMatch")) {
                            CrossMatch resultadocm = controladora2.consultarCrossMatchID(resultado.getId());
                            new CrossMatchInterface(examebusca, resultadocm).setVisible(true);
                        } else if (examebusca.getTipo().equals("Tipificação - C I - C II (Baixa / Media Resolução)")) {
                            TipificacaoHLA resultadotipificacao = controladora2.consultarTipificacaoID(resultado.getId());
                            new TipificacaoHLAInterface(examebusca, resultadotipificacao, 0).setVisible(true);
                        } else if (examebusca.getTipo().equals("Tipificação - C I - C II (Alta Resolução)")) {
                            TipificacaoHLA resultadotipificacao = controladora2.consultarTipificacaoID(resultado.getId());
                            new TipificacaoHLAInterface(examebusca, resultadotipificacao, 1).setVisible(true);
                        } else if (examebusca.getTipo().equals("Tipificação - C I  (Baixa / Media Resolução)")) {
                            TipificacaoHLA resultadotipificacao = controladora2.consultarTipificacaoID(resultado.getId());
                            new TipificacaoHLAInterface(examebusca, resultadotipificacao, 2).setVisible(true);
                        } else if (examebusca.getTipo().equals("Tipificação - C II (Baixa / Media Resolução)")) {
                            TipificacaoHLA resultadotipificacao = controladora2.consultarTipificacaoID(resultado.getId());
                            new TipificacaoHLAInterface(examebusca, resultadotipificacao, 3).setVisible(true);
                        } else if (examebusca.getTipo().equals("Tipificação - C I  (Alta Resolução)")) {
                            TipificacaoHLA resultadotipificacao = controladora2.consultarTipificacaoID(resultado.getId());
                            new TipificacaoHLAInterface(examebusca, resultadotipificacao, 4).setVisible(true);
                        } else if (examebusca.getTipo().equals("Tipificação - C II (Alta Resolução)")) {
                            TipificacaoHLA resultadotipificacao = controladora2.consultarTipificacaoID(resultado.getId());
                            new TipificacaoHLAInterface(examebusca, resultadotipificacao, 5).setVisible(true);
                        }

                    } 
                }
            }
            return true;
        }
        catch(Exception ex){
            return false;
        }
    }
}
