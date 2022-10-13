public class Angulo {
    private int grado; //grado de apertura del arco

    public Angulo(){
        super();

        grado = 0;
    }

    public int getGrado(){
        return grado;
    }

    public void setGrado(int grado){
        this.grado = grado;
    }

    public void calcularGrado(int ventas){
        grado = (ventas*360)/100; //numero de ventas por los 360 grados entre el 100
    }

    /*TODO: 1 crear las clases Panel y Frame de Pruebas para implementar la acutalizacion de las tablas.
    2. Investigar sobre el uso de etiquetas para indicar a qué porción de la gráfica corresponde cada departamento
    */
}
