import javax.swing.*;

public class Main implements Runnable {

    Departamentos dep1 = new Departamentos();

    public Main(){
        super();

        //Creación de los Threads
        Thread r1 = new Thread(dep1);

        //Inicialización de los Threads
        r1.start();

        //Creación del Thread principal
        Thread principal = new Thread(this);
        principal.start();
    }

    //Clase Runnable
    public void run(){
        boolean ciclo = true; //Continuar con las acutalizaciones de la gráfica
        while(ciclo == true){
            try{
                Thread.currentThread().sleep(5000);//Dormir el Thread principal y actualizar después de 5 segundos
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
       JFrame frame = new JFrame();


    }
}
