import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Departamentos extends Angulo implements Runnable {

    public Departamentos() {
        //super();
    }

    public void run() {
        //Scanner sc = new Scanner(System.in);
        int[] ventas = {100, 100, 100, 100}; //Establecer el mínimo de ventas como default
        int[] grado = new int[4];
        int ventp; //ventas sin comprobar el rango 100-1500
        for (int i = 0; i < 4; i++){
            ventp = (int) (Math.random()*(1500 - 1) + 100);
            System.out.println("Ventas del departamento " + (i + 1) + ": " + ventp);
            ventas[i] = ventp;
        }
        /*int i = 0; //Contador para los datos

        do {
            System.out.print("Ingrese el número de ventas para el Departamento " + (i + 1) + ": ");
            ventp = sc.nextInt();
            if (ventp < 100 || ventp > 1500) {
                System.out.println("El número de ventas no conuerda con el rango. Intente otra vez");
            } else {
                ventas[i] = ventp;
                i++;
            }
        } while (i < 4);*/

        grado = calcularGrado(ventas);
        fillArc(grado);


    }


}
