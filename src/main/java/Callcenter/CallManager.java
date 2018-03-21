/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Callcenter;

import Empleado.Empleado;
import Empleado.Estado;
import Util.ClaseUtil;
import Util.Constantes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author Yesica Agudelo G
 */
public class CallManager {

    /**
     *
     */
    public static List<Empleado> empleados;
    private static LinkedBlockingQueue<Call> queue;
    private static int contador;

    /**
     *
     */
    public CallManager() {
        empleados = new ArrayList<>();
        queue = new LinkedBlockingQueue<>();
    }

    private static Optional<Empleado> getCallHandler() {
        List<Empleado> empleadosActivos = empleados.stream().filter(Empleado::isDisponible)
                .sorted(Comparator.comparingInt(Empleado::getPrioridad))
                .collect(Collectors.toList());

        if (!empleadosActivos.isEmpty()) {
            return Optional.of(empleadosActivos.get(0)); //ordena la lista poniendo la máxima prioridad en la posición 0.
        }
        return Optional.empty(); // 
    }

    // Metodo que termina la llamada de cada operador(es), supervisor(es) y director(es)
    private static void terminarLlamadas() {

        empleados.stream().filter((empleado) -> (System.currentTimeMillis() > empleado.getCall().getDuracion() && empleado.getCall().getDuracion() != 0)).map((empleado) -> {
            MostrarMensaje(empleado, Constantes.Mensajes.COLGANDO);
            return empleado;
        }).map((empleado) -> {
            empleado.setCall(new Call());
            return empleado;
        }).forEach((empleado) -> {
            empleado.setEstado(Estado.LIBRE);
        });

    }

    //Metodo que agrega a un operador, supervisor y director

    /**
     *
     * @param emp
     */
    public void addEmpleado(Empleado emp) {
        empleados.add(emp);
    }

    /**
     *
     */
    public static void dispatch() {
        try {
            dispatch(new Call(contador++, System.currentTimeMillis() + ClaseUtil.duracionRandom() * Constantes.Parametros.SEGUNDOS));
        } catch (InterruptedException ex) {
            Logger.getLogger(CallManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*Metodo que encola la llamada o la asigna dependiendo de la disponibilidad 
    del operadores, supervisores y directores disponibles */

    /**
     *
     * @param call
     * @throws InterruptedException
     */

    public static void dispatch(Call call) throws InterruptedException {
        /* check if any respondant is free */
        terminarLlamadas();

        Optional<Empleado> handler = getCallHandler();
        if (!handler.isPresent()) {
            System.out.println(Constantes.Mensajes.LLAMADA_OCUPADA);
            queue.put(call);
            return;
        }
        Call callAsign;
        if (!queue.isEmpty()) {
            callAsign = queue.poll();
        } else {
            callAsign = call;
        }
        handler.get().setCall(callAsign);
        handler.get().setEstado(Estado.EN_LLAMADA);
        MostrarMensaje(handler.get(), Constantes.Mensajes.RESPONDIENDO);

    }

    //Metodo que muestra el mensaje de acuerdo a la asignacion de operadores, supervisores y directores

    /**
     *
     * @param empleado
     * @param accion
     */
    public static void MostrarMensaje(Empleado empleado, String accion) {

        switch (empleado.getPrioridad()) {
            case 0:
                System.out.println(accion + Constantes.Mensajes.OPERADOR
                        + empleado.getNombre() + Constantes.Mensajes.NUMERO_LLAMADA
                        + empleado.getCall().getId());
                break;
            case 1:
                System.out.println(accion + Constantes.Mensajes.SUPERVISOR
                        + empleado.getNombre() + Constantes.Mensajes.NUMERO_LLAMADA
                        + empleado.getCall().getId());
                break;
            case 2:
                System.out.println(accion + Constantes.Mensajes.DIRECTOR
                        + empleado.getNombre() + Constantes.Mensajes.NUMERO_LLAMADA
                        + empleado.getCall().getId());
                break;
            default:
                break;
        }

    }

}
