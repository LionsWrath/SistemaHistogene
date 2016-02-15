/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnitTests;

import CRUD.Pedidos.CadastrarPedidoInterface;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo
 */
public class JUnitTest_GerenciarPedidos {
    
    public JUnitTest_GerenciarPedidos() {
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
    public void testarNomeFabricanteValido(){
        CadastrarPedidoInterface cadastrar1 = new CadastrarPedidoInterface();
        
        String nomevalido = "Labfab";
        cadastrar1.getNomefab().setText(nomevalido);
        assertTrue(Principal.CaracteresApenas.test(cadastrar1.getNomefab().getText().split("")));
        
    }
    
    public void testarModeloValido(){
        CadastrarPedidoInterface cadastrar1 = new CadastrarPedidoInterface();
        String modelovalido = "Modelo Teste";
        cadastrar1.getModel().setText(modelovalido);
        assertTrue(Principal.CaracteresApenas.test(cadastrar1.getModel().getText().split("")));
    }
    
    @Test
    public void testarQuantidadeValido(){
        CadastrarPedidoInterface cadastrar1 = new CadastrarPedidoInterface();
        String quantvalido = "5";
        cadastrar1.getQuant().setText(quantvalido);
        assertTrue(Principal.IntegersOnlyDocument.test(cadastrar1.getQuant().getText()));
        
    }
    
    @Test
    public void testarValorValido(){
        CadastrarPedidoInterface cadastrar1 = new CadastrarPedidoInterface();
        String valorvalido = "652";
        cadastrar1.getValor().setText(valorvalido);
        assertTrue(Principal.IntegersOnlyDocument.test(cadastrar1.getValor().getText()));
    }
    
    @Test
    public void testarObservacoesValido(){
        CadastrarPedidoInterface cadastrar1 = new CadastrarPedidoInterface();
        String obsvalido = "testando";
        cadastrar1.getObs().setText(obsvalido);
        assertTrue(Principal.CaracteresApenas.test(cadastrar1.getObs().getText().split("")));
        
    }
    
    @Test
    public void testarDiavalido(){
        CadastrarPedidoInterface cadastrar1 = new CadastrarPedidoInterface();
        String diavalido = "14";
        cadastrar1.getDia().setText(diavalido);
        assertTrue(Principal.IntegersOnlyDocument.test(cadastrar1.getDia().getText()));
    }
    
    @Test
    public void testarMesValido(){
        CadastrarPedidoInterface cadastrar1 = new CadastrarPedidoInterface();
        String mesvalido = "10";
        cadastrar1.getMes().setText(mesvalido);
        assertTrue(Principal.IntegersOnlyDocument.test(cadastrar1.getMes().getText()));
        
    }
    
    @Test
    public void testarAnoValido(){
        CadastrarPedidoInterface cadastrar1 = new CadastrarPedidoInterface();
        String anovalido = "2014";
        cadastrar1.getAno().setText(anovalido);
        assertTrue(Principal.IntegersOnlyDocument.test(cadastrar1.getAno().getText()));
    }
    
    @Test
    public void testarQuantidadeNulo(){
        CadastrarPedidoInterface cadastrar1 = new CadastrarPedidoInterface();
        String quantvalido = "";
        cadastrar1.getQuant().setText(quantvalido);
        assertFalse(cadastrar1.checkfields());
    }
    
    @Test
    public void testarValorNulo(){
        CadastrarPedidoInterface cadastrar1 = new CadastrarPedidoInterface();
        String valorvalido = "";
        cadastrar1.getQuant().setText(valorvalido);
        assertFalse(cadastrar1.checkfields());
    }
    
    @Test
    public void testarDiaNulo(){
        CadastrarPedidoInterface cadastrar1 = new CadastrarPedidoInterface();
        String diavalido = "";
        cadastrar1.getDia().setText(diavalido);
        assertFalse(cadastrar1.checkfields());
    }
    
    @Test
    public void testarMesNulo(){
        CadastrarPedidoInterface cadastrar1 = new CadastrarPedidoInterface();
        String mesvalido = "";
        cadastrar1.getQuant().setText(mesvalido);
        assertFalse(cadastrar1.checkfields());
    }
    
    @Test
    public void testarAnoNulo(){
        CadastrarPedidoInterface cadastrar1 = new CadastrarPedidoInterface();

        String anovalido = "";
        cadastrar1.getQuant().setText(anovalido);
        assertFalse(cadastrar1.checkfields());
    }
    

    /*@Test
    public void testarValorNulo(){
        
    }
    @Test
    public void testarConsulta(){
        
    }
    
    
    @Test
    public void testarExclusao(){
        
        
    }*/
}

