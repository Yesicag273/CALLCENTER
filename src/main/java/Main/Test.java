package Main;

import Callcenter.CallManager;
import Empleado.Director;
import Empleado.Operador;
import Empleado.Supervisor;


/**
 *
 * @author Yesica Agudelo G
 */
public class Test {
// --------------------------- main() method ---------------------------

    /**
     *
     * @param args
     */
    public static void main(String... args) {

        CallManager manager = new CallManager();

        manager.addEmpleado(new Supervisor("S1"));
        manager.addEmpleado(new Supervisor("S2"));
        manager.addEmpleado(new Supervisor("S3"));

        manager.addEmpleado(new Operador("O1"));
        manager.addEmpleado(new Operador("O2"));
        manager.addEmpleado(new Operador("O3"));

        manager.addEmpleado(new Director("D1"));
        manager.addEmpleado(new Director("D2"));

        //Prueba unitaria de m�todo que se encarga de generar/simularar llamadas automaticas
        //new Generador().start();
        //Prueba unitaria que consiste en inyectar 10 llamadas de modo concurrente
        for (int i = 0; i < 10; i++) {
            CallManager.dispatch();
        }
//        
        //Prueba unitaria que consiste en inyectar 100 llamadas de modo concurrente
//        for (int i = 0; i < 100; i++) {
//            Dispatcher.queueCall(ClaseUtil.duracionRandom());
//        }
    }
}
