/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnitTests;

import CRUD.Exames.Exame;
import CRUD.Exames.ExameController;
import CRUD.Resultados.CadastrarResultadoInterface;
import CRUD.Resultados.CrossMatch;
import CRUD.Resultados.HLA_B27;
import CRUD.Resultados.PRA;
import CRUD.Resultados.ResultadosController;
import CRUD.Resultados.TipificacaoHLA;
import javax.swing.JTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Caio
 */
public class JUnitTest_CadastrarResultado {
    
    public JUnitTest_CadastrarResultado() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    
    @Test
    public void testarNomeValido(){
        CadastrarResultadoInterface cadastrar1 = new CadastrarResultadoInterface();
        cadastrar1.setOptnome(true);
        String nomevalido = "Caio Henrique Segawa Tonetti";
        cadastrar1.setCamponome(nomevalido);      
        assertTrue(Principal.CaracteresApenas.test(cadastrar1.getCamponome().getText().split("")));
    }
    
    @Test
    public void testarLinhaNaoSelecionada(){
        CadastrarResultadoInterface cadastrar1 = new CadastrarResultadoInterface();
        cadastrar1.setOptnome(true);
        cadastrar1.setCamponome("Caio Henrique Segawa Tonetti");
        JTable tabela = cadastrar1.getTable();
        assertEquals(-1, tabela.getSelectedRow());
  
    }
    
    @Test
    public void testarIDValido(){
        CadastrarResultadoInterface cadastrar1 = new CadastrarResultadoInterface();
        cadastrar1.setOptid(true);
        String idvalido = "1";
        cadastrar1.setCampoid(idvalido);       
        assertTrue(Principal.IntegersOnlyDocument.test(cadastrar1.getCampoid().getText()));
    }
    
    
    @Test
    public void testarIDNulo(){
        CadastrarResultadoInterface cadastrar1 = new CadastrarResultadoInterface();
        cadastrar1.setOptid(true);
        cadastrar1.setCampoid("");
        assertFalse(cadastrar1.checkfields());
              
    }
    
    @Test
    public void testarNomeNulo(){
        CadastrarResultadoInterface cadastrar1 = new CadastrarResultadoInterface();
        cadastrar1.setOptnome(true);
        cadastrar1.setCamponome("");
        assertFalse(cadastrar1.checkfields());
             
    }
    
    @Test
    public void testarNomeInvalido(){
        CadastrarResultadoInterface cadastrar1 = new CadastrarResultadoInterface();
        cadastrar1.setOptnome(true);
        String invalida = "Caio1";
        assertFalse(Principal.CaracteresApenas.test(invalida.split("")));
    }
    
    @Test
    public void testarIDInvalido(){
        CadastrarResultadoInterface cadastrar1 = new CadastrarResultadoInterface();
        cadastrar1.setOptid(true);
        String invalida = "Caio1";
        assertFalse(Principal.CaracteresApenas.test(invalida.split("")));
        
    }
    
    @Test
    public void testarPersistenciaB27(){
        Exame exameteste1 = new Exame("Caio Henrique Segawa Tonetti", "02/04/2014", "TesteUnitario", "HLA B27", "Sangue", "SUS", "histogene", false);
        ExameController.CadastrarExame(exameteste1);
        String obs = "Teste";
        String metodo = "Teste";
        String pesquisa = "Negativo";
        HLA_B27 b27 = new HLA_B27(exameteste1, obs, metodo, pesquisa);
        assertTrue(ResultadosController.CadastrarHLA_B27(b27));
        ResultadosController.ExcluirResultado(b27);             
    }
    
    
    @Test
    public void testarPersistenciaCrossMatch(){
        Exame exameteste2 = new Exame("Caio Henrique Segawa Tonetti", "02/04/2018", "TesteUnitario", "CrossMatch", "Sangue", "SUS", "histogene", false);
        ExameController.CadastrarExame(exameteste2);
        CrossMatch cross = new CrossMatch(exameteste2, "Teste Unitario", "Teste", "Positivo", "Positivo", "Positivo", "Positivo", "Positivo", "Positivo", "Positivo", "Positivo");
        assertTrue(ResultadosController.CadastrarCrossMatch(cross));
        ResultadosController.ExcluirResultado(cross);          
    }
    
    
    @Test
    public void testarPersistenciaPRA(){
        Exame exameteste3 = new Exame("Caio Henrique Segawa Tonetti", "02/04/2016", "TesteUnitario", "PRA", "Sangue", "SUS", "histogene", false);
        ExameController.CadastrarExame(exameteste3);
        PRA pra = new PRA(exameteste3, "Teste Unitario", "Teste", "50", "50");
        assertTrue(ResultadosController.CadastrarPRA(pra));
        ResultadosController.ExcluirResultado(pra);             
    }
    
    
    @Test
    public void testarPersistenciaHLA(){
        Exame exameteste4 = new Exame("Caio Henrique Segawa Tonetti", "10/10/2014", "TesteUnitario", "Tipificação - C I  (Alta Resolução)", "Sangue", "SUS", "histogene", false);
        ExameController.CadastrarExame(exameteste4);
        TipificacaoHLA hla = new TipificacaoHLA(exameteste4, "Teste Unitario", "Teste", "Identico", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50");
        assertTrue(ResultadosController.CadastrarTipificacao(hla));
        ResultadosController.ExcluirResultado(hla);             
    }
    
    @Test
    public void testarConsistenciaB27(){
        Exame exameteste5 = new Exame("Caio Henrique Segawa Tonetti", "01/11/2015", "TesteUnitario", "HLA B27", "Sangue", "SUS", "histogene", false);
        ExameController.CadastrarExame(exameteste5);
        String obs = "Teste";
        String metodo = "Teste";
        String pesquisa = "Negativo";
        HLA_B27 b27 = new HLA_B27(exameteste5, obs, metodo, pesquisa);
        ResultadosController.CadastrarHLA_B27(b27);
        ExameController controladora = new ExameController();
        assertNotNull(controladora.consultarExameID(b27.getId())); 
        ResultadosController.ExcluirResultado(b27);
    }
    
    
    @Test
    public void testarConsistenciaCrossMatch(){
        Exame exameteste2 = new Exame("Caio Henrique Segawa Tonetti", "19/01/2015", "TesteUnitario", "CrossMatch", "Sangue", "SUS", "histogene", false);
        ExameController.CadastrarExame(exameteste2);
        CrossMatch cross = new CrossMatch(exameteste2, "Teste Unitario", "Teste", "Positivo", "Positivo", "Positivo", "Positivo", "Positivo", "Positivo", "Positivo", "Positivo");
        ResultadosController.CadastrarCrossMatch(cross);
        ExameController controladora = new ExameController();
        assertNotNull(controladora.consultarExameID(cross.getId()));  
        ResultadosController.ExcluirResultado(cross);
    }
    
    
    
    @Test
    public void testarConsistenciaPRA(){
        Exame exameteste3 = new Exame("Caio Henrique Segawa Tonetti", "21/02/2016", "TesteUnitario", "PRA", "Sangue", "SUS", "histogene", false);
        ExameController.CadastrarExame(exameteste3);
        PRA pra = new PRA(exameteste3, "Teste Unitario", "Teste", "50", "50");
        ResultadosController.CadastrarPRA(pra);
        ExameController controladora = new ExameController();
        assertNotNull(controladora.consultarExameID(pra.getId()));
        ResultadosController.ExcluirResultado(pra);
    }
    
    
    @Test
    public void testarConsistenciaHLA(){
        Exame exameteste4 = new Exame("Caio Henrique Segawa Tonetti", "14/10/2015", "TesteUnitario", "Tipificação - C I  (Alta Resolução)", "Sangue", "SUS", "histogene", false);
        ExameController.CadastrarExame(exameteste4);
        TipificacaoHLA hla = new TipificacaoHLA(exameteste4, "Teste Unitario", "Teste", "Identico", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50", "50");
        ResultadosController.CadastrarTipificacao(hla);
        ExameController controladora = new ExameController();
        assertNotNull(controladora.consultarExameID(hla.getId()));
        ResultadosController.ExcluirResultado(hla);
    }
    
    

    
    
    


        

    
}
