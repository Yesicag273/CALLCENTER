/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Callcenter;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yesica Agudelo G
 */
public class CallTest {
    
    public CallTest() {
    }
    
  
    /**
     * Test of getId method, of class Call.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Call instance = new Call();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Call.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Call instance = new Call();
        instance.setId(id);
    }

    /**
     * Test of getDuracion method, of class Call.
     */
    @Test
    public void testGetDuracion() {
        System.out.println("getDuracion");
        Call instance = new Call();
        long expResult = 0L;
        long result = instance.getDuracion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDuracion method, of class Call.
     */
    @Test
    public void testSetDuracion() {
        System.out.println("setDuracion");
        long duracion = 0L;
        Call instance = new Call();
        instance.setDuracion(duracion);
    }
    
}
