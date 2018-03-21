/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Callcenter;

import Empleado.Empleado;
import org.junit.Test;

/**
 *
 * @author Yesica Agudelo G
 */
public class CallManagerTest {
    
    public CallManagerTest() {
    }
      

    /**
     * Test of addEmpleado method, of class CallManager.
     */
    @Test
    public void testAddEmpleado() {
        System.out.println("addEmpleado");
        Empleado emp = new Empleado("AR");
        emp.setCall(new Call());
        CallManager instance = new CallManager();
        instance.addEmpleado(emp);
    }

    /**
     * Test of dispatch method, of class CallManager.
     */
    @Test
    public void testDispatch_0args() {
        System.out.println("dispatch");
        CallManager.dispatch();
    }

    /**
     * Test of dispatch method, of class CallManager.
     */
    @Test
    public void testDispatch_Call() throws Exception {
        System.out.println("dispatch");
        Call call = new Call();
        CallManager.dispatch(call);
    }

    /**
     * Test of MostrarMensaje method, of class CallManager.
     */
    @Test
    public void testMostrarMensaje() {
        System.out.println("MostrarMensaje");
        Empleado empleado = new Empleado("AR");
        empleado.setCall(new Call());
        String accion = "Respondiendo";
        CallManager.MostrarMensaje(empleado, accion);
    }
    
}
