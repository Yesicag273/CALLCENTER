/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Callcenter;

import org.junit.Test;

/**
 *
 * @author Yesica Agudelo G
 */
public class GeneradorTest {
    
    public GeneradorTest() {
    }
    
   
    /**
     * Test of run method, of class Generador.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Generador instance = new Generador();
        instance.run();
    }

    /**
     * Test of verificarLlamada method, of class Generador.
     */
    @Test
    public void testVerificarLlamada() {
        System.out.println("verificarLlamada");
        Generador instance = new Generador();
        instance.verificarLlamada();
    }

    /**
     * Test of start method, of class Generador.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Generador instance = new Generador();
        instance.start();
    }

    /**
     * Test of stop method, of class Generador.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        Generador instance = new Generador();
        instance.stop();
    }
    
}
