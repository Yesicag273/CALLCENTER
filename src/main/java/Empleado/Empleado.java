/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

import Callcenter.Call;

/**
 *
 * @author Yesica Agudelo G
 */
public class Empleado {

    private final String nombre;

    /**
     *
     */
    protected int prioridad;
    private Estado estado;
    private Call call;

    /**
     *
     * @param nombre
     */
    public Empleado(String nombre) {
        this.nombre = nombre;
        this.estado = Estado.LIBRE;
        this.call = new Call();
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param estado
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /**
     *
     * @return
     */
    public int getPrioridad() {
        return prioridad;
    }

    /**
     *
     * @return
     */
    public boolean isDisponible() {
        return estado == Estado.LIBRE;
    }

    /**
     *
     * @return
     */
    public Call getCall() {
        return call;
    }

    /**
     *
     * @param call
     */
    public void setCall(Call call) {
        this.call = call;
    }

}
