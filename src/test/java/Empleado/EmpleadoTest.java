/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

import Callcenter.Call;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yesica Agudelo G
 */
public class EmpleadoTest {
    
    public EmpleadoTest() {
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

    /**
     * Test of getNombre method, of class Empleado.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Empleado emp = new Empleado("Prueba");
        emp.setCall(new Call());
        String expResult = "Prueba";
        String result = emp.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEstado method, of class Empleado.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        Estado estado = Estado.LIBRE;
        Empleado emp = new Empleado("Prueba");
        emp.setCall(new Call());
        emp.setEstado(estado);
    }

    /**
     * Test of getPrioridad method, of class Empleado.
     */
    @Test
    public void testGetPrioridad() {
        System.out.println("getPrioridad");
        Empleado emp = new Operador("Prueba");
        emp.setCall(new Call());
        int expResult = 0;
        int result = emp.getPrioridad();
        assertEquals(expResult, result);
    }

    /**
     * Test of isDisponible method, ofEmpleado emp = new Operador("Prueba");
        emp.setCall(new Call()); class Empleado.
     */
    @Test
    public void testIsDisponible() {
        System.out.println("isDisponible");
        Empleado emp = new Operador("Prueba");
        emp.setCall(new Call());
        boolean expResult = true;
        boolean result = emp.isDisponible();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCall method, of class Empleado.
     */
    @Test
    public void testGetCall() {
        System.out.println("getCall");
        Empleado emp = new Operador("Prueba");
        emp.setCall(new Call());
        Call expResult = emp.getCall();
        Call result = emp.getCall();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCall method, of class Empleado.
     */
    @Test
    public void testSetCall() {
        System.out.println("setCall");
        Call call = new Call();
        Empleado instance= new Operador("Prueba");
        instance.setCall(call);
    }
    
}
