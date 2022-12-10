/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Ejemplos_T03;

/*
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
*/

    import org.junit.After;
    import org.junit.AfterClass;
    import org.junit.Before;
    import org.junit.BeforeClass;
    import org.junit.Test;
    import static org.junit.Assert.*; 

/**
 *
 * @author Juan José Estévez González
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
/*
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
*/
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("ES EL PRINCIO DE TODAS LAS PRUEBAS.");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("ES EL FINAL DE TODAS LAS PRUEBAS.");
    }
    
    @Before
    public void setUp() {
        System.out.println("ES EL PRINCIO DE UNA PRUEBA.");
    }
    
    @After
    public void tearDown() {
        System.out.println("ES EL FINAL DE UNA PRUEBA.");
    }

    /**
     * Test of sumarNumeros method, of class Calculadora.
     */
    @Test
    public void testSumarNumeros01() {
        System.out.println("sumarNumeros");
        int a = 3;
        int b = 6;
        Calculadora instance = new Calculadora();
        int expResult = 9;
        int result = instance.sumarNumeros(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testSumarNumeros02() {
        System.out.println("sumarNumeros");
        int a = 3;
        int b = -6;
        Calculadora instance = new Calculadora();
        int expResult = -3;
        int result = instance.sumarNumeros(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testSumarNumeros03() {
        System.out.println("sumarNumeros");
        int a = 5;
        int b = 6;
        Calculadora instance = new Calculadora();
        int expResult = 11;
        int result = instance.sumarNumeros(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
