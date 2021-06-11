package src;

import java.util.*;

public class Ejercicio4 {

    Random Aleatoreo = new Random();
    Scanner sc = new Scanner(System.in);
    int[] Vector = new int[10];
    int Datos;
    int MostrarDatos;

    public static void main(String[] args) {
        Ejercicio4 eje = new Ejercicio4();
    }
    // metodo principal llama a los otros metodos
    public Ejercicio4() {
        ValorRandom(Vector);
        MostrarDatos();
    }

    // Metodo que llena el array de 10 entre numeros aleatoreos  del 0 al 99
    public void ValorRandom(int Vector[]) {
        for (int i = 0; i < 10; i++) {
            Vector[i] = Aleatoreo.nextInt(99);
        }
    }
    // Metodo que determina la distancia del numero aleatoreo
    public int DeterminarMayor(int Vector[]) {
        int mayor = Vector[0];
        for (int i = 0; i < 10; i++) {
            if (mayor < Vector[i]) {
                mayor = Vector[i];
            }
        }
        return mayor;
    }
    // Metodo que muestra los datos e indica la distancia
    public void MostrarDatos() {
        int mayor = DeterminarMayor(Vector), distancia = 0;
        for (int i = 0; i < 10; i++) {
            distancia = mayor - Vector[i];
            System.out.println("La distancia que separa al numero " + (i + 1) + " del mayor es: " + distancia);
        }
        System.out.println("Si la distancia es de 0 es por que ese es el eleemento mayor");
    }
}