/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.Random;

/**
 * Clase de utilitarios
 *
 * @author Yesica Agudelo G
 */
public final class ClaseUtil {

    /**
     * Metodo encargado de generar un valor aleatorio entre 5 y 10 segundos y el
     * cal es es el valor de la duracion de cada llamada
     *
     * @return duracion de la llamada
     */
    public static int duracionRandom() {
        Random r = new Random();
        int desde = Constantes.Parametros.DESDE;
        int hasta = Constantes.Parametros.HASTA;
        int duracion = r.nextInt(hasta - desde) + desde;

        return duracion;
    }

}
