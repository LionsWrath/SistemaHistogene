package JUnitTests;

import CRUD.Usuario.ConsultarUsuario;
import javax.swing.JTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Juliano
 */
public class JUnitTest_ConsultarUsuario {

    public JUnitTest_ConsultarUsuario() {
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
    public void testarLoginValido() {
        ConsultarUsuario consultar = new ConsultarUsuario();
        consultar.getLogintext().setText("caio");
        consultar.getLogin().doClick();
        consultar.getjButton1().doClick();
        JTable table = consultar.getTable();
        assertNull(table.getComponentAt( 0, 4));
    }
    
    @Test
    public void testarLoginInvalido() {
        ConsultarUsuario consultar = new ConsultarUsuario();
        consultar.getLogintext().setText("huehue");
        consultar.getLogin().doClick();
        consultar.getjButton1().doClick();
        JTable table = consultar.getTable();
        assertNull(table.getComponentAt(0, 4));
    }
    
    @Test
    public void testarCpfValido() {
        ConsultarUsuario consultar = new ConsultarUsuario();
        consultar.getCpftext().setText("11111111111");
        consultar.getCpf().doClick();
        consultar.getjButton1().doClick();
        JTable table = consultar.getTable();
        assertNull(table.getComponentAt( 0, 4));
    }
    
    @Test
    public void testarCpfInvalido() {
        ConsultarUsuario consultar = new ConsultarUsuario();
        consultar.getCpftext().setText("87765435");
        consultar.getCpf().doClick();
        consultar.getjButton1().doClick();
        JTable table = consultar.getTable();
        assertNull(table.getComponentAt( 0, 4));
    }
    
    @Test
    public void testarLoginValorInvalido() {
        ConsultarUsuario consultar = new ConsultarUsuario();
        consultar.getLogintext().setText("4654623");
        consultar.getLogin().doClick();
        consultar.getjButton1().doClick();
        JTable table = consultar.getTable();
        assertNull(table.getComponentAt( 0, 4));
    }
    
    @Test
    public void testarCpfValorInvalido() {
        ConsultarUsuario consultar = new ConsultarUsuario();
        consultar.getCpftext().setText("uashdahsdhuas");
        consultar.getCpf().doClick();
        consultar.getjButton1().doClick();
        JTable table = consultar.getTable();
        assertNull(table.getComponentAt( 0, 4));
    }
    
}
