/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author Yesica Agudelo G
 */
public class Operador extends Empleado {

    /**
     *
     * @param name
     */
    public Operador(String name) {
        super(name);
        this.prioridad = 0;
    }
}
