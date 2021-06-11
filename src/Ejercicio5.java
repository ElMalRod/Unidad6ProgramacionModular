package src;

import java.util.*;

public class Ejercicio5 {

    Random Aleatoreo = new Random();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Ejercicio5 eje = new Ejercicio5();
    }
    // Metodo principal Asigna a los alumnos un valor de notas que luego es generado aleatoreeamente
    // Llama a los metods
    public Ejercicio5() {
        for (int i = 0; i < 3; i++) {

            int Alumnos = (int) (Math.random() * 100) + 1;
            int notas[] = new int[Alumnos];
            System.out.println("Conjunto de notas " + (i + 1));
            ValorRandom(notas);
            MostrarDatos(notas);
            EvaluarNotas(notas);

        }
    }
    // Metodo que genera la nota de los alumnos llenando el arreglo
    public void ValorRandom(int notas[]) {

        for (int i = 0; i < notas.length; i++) {
            int numRandom = (int) (Math.random() * 9) + 1;
            notas[i] = numRandom;
        }
        notas[notas.length - 1] = -50;
    }
    // imprime la cantidad de alumnos , con los puntos generados
    public void MostrarDatos(int notas[]) {

        System.out.print("Alumnos: : ");
        for (int i = 0; i < notas.length; i++) {

            System.out.print("\n Alumno No. " + (i + 1) + ": " + notas[i] + " puntos");

        }

        System.out.println("");
    }
    // Evalua la nota y asi mismo saca el promedio de ellas
    public void EvaluarNotas(int notas[]) {
        int Total = 0;
        double Promedio = 0;

        for (int i = 0; i < (notas.length - 1); i++) {
            Total += notas[i];
            Promedio = (double) Total / (notas.length - 1);
        }
        System.out.println("El promedio de notas fue de: " + Promedio);

    }
}