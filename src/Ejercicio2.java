package src;

import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        Ejercicio2 eje = new Ejercicio2();
    }
//global a mi clase tarea1
    int[] elementos = new int[10];
    Scanner scanner = new Scanner(System.in);
    Random Aleatoreo = new Random();

    public Ejercicio2() {
        // llamamos a los metods
        ValorRandom(elementos);
        MostrarRandom(elementos);
        mostrarMayor(elementos);
    }
    // Metodo que llena el array de 10 entre numeros aleatoreos  del 0 al 99
    public void ValorRandom(int elementos[]) {
        for (int i = 0; i < 10; i++) {
            elementos[i] = Aleatoreo.nextInt(99);
        }
    }
    // Metodo que Muestra el Numero Random generado
    public void MostrarRandom(int elementos[]) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero: " + elementos[i]);
        }
    }
    // Metodo que muestra el Numero mayor e indica cuantas veces se repite
    public void mostrarMayor(int elementos[]) {
        int mayor = elementos[0], totalRepetidos = 0;
        for (int i = 0; i < 10; i++) {
            if (mayor < elementos[i]) {
                mayor = elementos[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            if (mayor == elementos[i]) {
                totalRepetidos++;
            }
        }
        System.out.println("EL mayor es: " + mayor);
        System.out.println("Se repite: " + totalRepetidos);

    }

}