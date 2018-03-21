package Callcenter;

import Util.Constantes;

/**
 * Clase director que se encarga de ejecutar un hilo en intervalos de tiempo
 * para verificar la asignaci�n de llamadas al director
 *
 * @author Yesica Agudelo G
 */
public class Generador
        implements Runnable {
// ------------------------------ CAMPOS ------------------------------

    private boolean running;

// --------------------------- CONSTRUCTORES ---------------------------
    /**
     *
     */
    public Generador() {
        super();
//        this.status = DirectorEstado.LIBRE;
    }

// ------------------------ M�TODOS INTERFACE ------------------------
// --------------------- Interface Runnable ---------------------

    /**
     *
     */
    @Override
    public void run() {
        while (running) {
            CallManager.dispatch();
            sleep();
        }
    }

// -------------------------- OTROS M�TODOS --------------------------
    /**
     * M�todo encargado de verificar el estado, si existen operadores y
     * supervisores ocupados y si existen directores disponibles sera asignada
     * la llamada por el metodo dispathCall, por lo cual si no cumple las
     * condiciones no se asignara y la llamada no sera desencolada. El mrtodo
     * tambien controla el estado y duracion de la llamada del director
     */
    public void verificarLlamada() {

    }

    /**
     * Metodo encargado de inicializar el hilo
     */
    public void start() {
        running = true;
        new Thread(this).start();
    }

    /**
     * Metodo encargado de parar la ejecucion del hilo
     */
    public void stop() {
        running = false;
    }

    /**
     * Metodo encargado de dormir el hilo con el fin de observar mas
     * detenidamente los intervalos de la ejecucion entre las llamadas
     */
    private void sleep() {
        try {
            Thread.sleep(Constantes.Parametros.SLEEP);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
