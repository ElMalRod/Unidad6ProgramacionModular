package src;

import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        Ejercicio1 t = new Ejercicio1();
    }
//global a mi clase Ejercicio1
    int[] elementos = new int[5];
    Scanner scanner = new Scanner(System.in);

    public Ejercicio1() {
        for (int i = 0; i < 5; i++) {
            pedirValor(i);
        }
        for (int i = 0; i < 5; i++) {
            mostrarDato(i);
        }
        double promedio = getPromedio();
        System.out.println("El promedio es " + promedio);
    }
    // Esta clase es dedicada para sacar el promedio de los datos 
    public double getPromedio() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += elementos[i];
        }
        double promedio = (double) total / 5;
        return promedio;
    }
    // Esta clase es dedicada para mostrar los datos
    public void mostrarDato(int numero) {
        System.out.println("El indice es " + numero + " el valor es: " + elementos[numero]);
    }
    // Esta clase es dedicada a´pedir valores y los registra
    public void pedirValor(int numero) {
        System.out.print("\nIngres el valor No. " + numero + ": ");
        elementos[numero] = scanner.nextInt();
    }
}