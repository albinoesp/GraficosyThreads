import javax.swing.*;

public class Main implements Runnable {

    Departamentos deps = new Departamentos();

    public Main() {
        super();

        //Creación de los Threads
        Thread r1 = new Thread(deps);

        //Inicialización de los Threads
        r1.start();

        //Creación del Thread principal
        Thread principal = new Thread(this);
        principal.start();
    }

    //Clase Runnable
    public void run() {
        boolean ciclo = true; //Continuar con las acutalizaciones de la gráfica
        while (ciclo == true) {
            try {
                Thread.currentThread().sleep(5000);//Dormir el Thread principal y actualizar después de 5 segundos

                Thread.currentThread().start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Departamentos app = new Departamentos();
        Thread runapp = new Thread(app);
        runapp.start();
    }
}
