import javax.swing.*;
import java.awt.*;

public class Angulo {
    private int[] grado = {90,90,90,90}; //grado de apertura del arco

    public Angulo() {
        //super();

        int[] grado;
    }

    /*public int[] getGrado() {
        return grado;
    }*/

    /*public void setGrado(int[] grado) {
        this.grado = grado;
    }*/

    public int[] calcularGrado(int[] ventas) {
        int totventas = 0;
        for (int i = 0; i < 4; i++){ //Calcular el total de las ventas
            totventas = totventas + ventas[i];
        }
        for (int i = 0; i < 4; i++){ //Calcular el grado de apertura del arco con sus ventas
            grado[i] = (ventas[i] * 360) / totventas; //numero de ventas por los 360 grados entre el total de ventas
        }

        return grado;
    }

    public void fillArc(int[] grado) {
        //Declarar ángulos
        int angdto1 = 90; //ángulo departamento 1
        int angdto2 = 90; //"..." 2
        int angdto3 = 90; //"..." 3
        int angdto4 = 90; //"..." 4
        for (int i = 0; i < 4; i++){ //Asgingar a cada ángulo su valor
            if (i == 0){
                angdto1 = grado[i]; //1
            } else if (i == 1){
                angdto2 = grado[i]; //2
            } else if (i == 2){
                angdto3 = grado[i]; //3
            } else if (i == 3){
                angdto4 = grado[i]; //4
            }
        }
        new Frame(angdto1, angdto2, angdto3, angdto4);
    }

    public class Frame extends JFrame {

        Frame(int angdto1, int angdto2, int angdto3, int angdto4) {

            Panel panel = new Panel(angdto1, angdto2, angdto3, angdto4);

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //this.setSize(500,500);
            this.add(panel);
            this.pack();
            this.setLocationRelativeTo(null);
            this.setVisible(true);
        }
    }

    public class Panel extends JPanel {

        int angdto1; //ángulo del departamento 1
        int angdto2; //" " " 2
        int angdto3; //" " " 3
        int angdto4; //" " " 4

        Panel(int angdto1, int angdto2, int angdto3, int angdto4) {
            this.setPreferredSize(new Dimension(500, 500));
            this.angdto1 = angdto1;
            this.angdto2 = angdto2;
            this.angdto3 = angdto3;
            this.angdto4 = angdto4;
        }

        public void paint(Graphics g) { //ángulo departamento 1, 2, 3, 4
            //Inicialización de los gráficos2D

            Graphics2D depto1 = (Graphics2D) g;
            Graphics2D depto2 = (Graphics2D) g;
            Graphics2D depto3 = (Graphics2D) g;
            Graphics2D depto4 = (Graphics2D) g;

            depto1.setColor(Color.magenta); //Color del arco del departamento 1
            depto1.fillArc(1, 1, 500, 500, 0, angdto1); //Arco del departamento 1
            depto2.setColor(Color.blue); //Color del arco del departamento 2
            depto2.fillArc(1, 1, 500, 500, angdto1, angdto2+angdto1); //Arco del departamento 2
            depto3.setColor(Color.green); //Color del arco del departamento 3
            depto3.fillArc(1, 1, 500, 500, angdto2+angdto1, angdto3+angdto2); //Arco del departamento 3
            depto4.setColor(Color.orange); //Color del arco del departamento 4
            depto4.fillArc(1, 1, 500, 500, angdto3+angdto2, angdto4+angdto3); //Arco del departamento 4
        }
    }
}
