/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnitTests;

import CRUD.SalaEquipamentos.Itens.CadastrarItemInterface;
import CRUD.SalaEquipamentos.Itens.Item;
import CRUD.SalaEquipamentos.Itens.ItemController;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 
 */
public class JUnitTest_SalaEquipamentos {
    
    public JUnitTest_SalaEquipamentos() {
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
    public void testaNomeVazio(){
        CadastrarItemInterface interfacevazia = new CadastrarItemInterface();
        interfacevazia.getDatamanutencao().setText("13/10/2014");
        interfacevazia.getLocalizacao().setText("Sala 301");
        interfacevazia.getFreezer().setSelected(true);
        interfacevazia.getItem().setText("");
        assertFalse(interfacevazia.checkfields());
        
    }
    
    @Test
    public void testaLocalizacaoVazia(){
        CadastrarItemInterface interfacevazia = new CadastrarItemInterface();
        interfacevazia.getDatamanutencao().setText("13/10/2014");
        interfacevazia.getLocalizacao().setText("");
        interfacevazia.getFreezer().setSelected(true);
        interfacevazia.getItem().setText("Gabriel Belini");
        assertFalse(interfacevazia.checkfields());
        
    }
    @Test
    public void testaDataVazio(){
        CadastrarItemInterface interfacevazia = new CadastrarItemInterface();
        interfacevazia.getDatamanutencao().setText("");
        interfacevazia.getLocalizacao().setText("Sala 301");
        interfacevazia.getFreezer().setSelected(true);
        interfacevazia.getItem().setText("gabriel belini");
        assertFalse(interfacevazia.checkfields());
        
    }
    
    @Test
    public void testaSemClassificacao(){
        CadastrarItemInterface interfacevazia = new CadastrarItemInterface();
        interfacevazia.getDatamanutencao().setText("13/10/2014");
        interfacevazia.getLocalizacao().setText("Sala 301");
        interfacevazia.getItem().setText("Gabriel Belini");
        assertFalse(interfacevazia.checkfields());
        
    }
    
    @Test
    public void testaCorreto(){
        CadastrarItemInterface interfacevazia = new CadastrarItemInterface();
        interfacevazia.getDatamanutencao().setText("13/10/2014");
        interfacevazia.getLocalizacao().setText("Sala 301");
        interfacevazia.getItem().setText("Gabriel Belini");
        interfacevazia.getFreezer().setSelected(true);
        assertTrue(interfacevazia.checkfields());
        
    }
    
    @Test
    public void testarPersistencia() throws ParseException{
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date datamanutencao  = (Date)dateFormat.parse("13/11/2014");
        Item teste = new Item("Freezer2", "Sala 301", 3, datamanutencao);
        assertTrue(ItemController.CadastrarItem(teste));
        ItemController.ExcluirItem(teste);
        
    }
    
    @Test
    public void testarConsulta() throws ParseException{
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date datamanutencao  = (Date)dateFormat.parse("13/11/2014");
        Item teste = new Item("Freezer3", "Sala 301", 3, datamanutencao);
        ItemController.CadastrarItem(teste);
        
        Item itembusca = ItemController.ConsultarItem("Freezer3");
        assertEquals(teste.getNome(), itembusca.getNome());
        ItemController.ExcluirItem(itembusca);
    }
    
    @Test
    public void testarExclusao() throws ParseException{
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date datamanutencao  = (Date)dateFormat.parse("13/11/2014");
        Item teste = new Item("Freezer4", "Sala 301", 3, datamanutencao);
        ItemController.CadastrarItem(teste);
        
        Item itembusca = ItemController.ConsultarItem("Freezer4");
        assertTrue(ItemController.ExcluirItem(itembusca));
        
    }
    
    @Test
    public void testaDataFormatoErrado(){
        CadastrarItemInterface interfacevazia = new CadastrarItemInterface();
        interfacevazia.getDatamanutencao().setText("13-10/2014");
        interfacevazia.getLocalizacao().setText("Sala 301");
        interfacevazia.getItem().setText("Gabriel Belini");
        assertFalse(interfacevazia.checkfields());
        
    }
    
}
