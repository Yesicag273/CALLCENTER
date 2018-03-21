/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Callcenter;

import java.io.Serializable;

/**
 *
 * @author Yesica Agudelo G
 */
public final class Call implements Serializable { // final by default

    private int id;
    private long duracion;

    /**
     *
     * @param id
     * @param duracion
     */
    public Call(int id, long duracion) {
        this.id = id;
        this.duracion = duracion;
    }

    /**
     *
     */
    public Call() {

    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public long getDuracion() {
        return duracion;
    }

    /**
     *
     * @param duracion
     */
    public void setDuracion(long duracion) {
        this.duracion = duracion;
    }

}
