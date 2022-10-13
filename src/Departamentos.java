import java.util.*;
public class Departamentos extends Angulo implements Runnable  {

    public Departamentos(){
        super();
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        int ventas = 0;
        int grado = 0;

        System.out.println("Departamento 1");
        System.out.println("Número de ventas: ");
        ventas = sc.nextInt();

        calcularGrado(ventas);
    }
}
