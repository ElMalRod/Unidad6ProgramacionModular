package src;

import java.util.*;

public class Ejercicio7 {
    // Valriables globales
    Random Aleatoreo = new Random();
    Scanner sc = new Scanner(System.in);
    int[][] matriz = new int[4][3];

    public static void main(String[] args) {
        Ejercicio7 eje = new Ejercicio7();
    }
    // Metodo principal que llama las funciones
    public Ejercicio7() {
        ValorRandom();
        Multiplicador();
    }
    // Genera el valor random llenando el arreglo
    public void ValorRandom() {

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = (int) (Math.random() * 555) + 1;
            }
        }

    }
    // Muestra los datos de matriz generados en el metodo ValorRandom
    public void MostrarDatos() {

        System.out.println("\nMATRIZ\n");
        for (int x = 0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y]);
                if (y != matriz[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }

    }
    // Metodo que busca las filas pares y hace una suma de sus numeros para sacar un total
    public void Multiplicador() {
        int resultado = 0;
        int total = 0;
        MostrarDatos();

        for (int x = 0; x < matriz.length; x++) {
            if ((x + 1) % 2 == 0) {
                for (int y = 0; y < matriz[x].length; y++) {
                    resultado += matriz[x][y];
                }
                total += resultado;
                System.out.print("La suma de la fila " + (x + 1) + " es " + resultado + "\n");
            }
           
        }
        
        System.out.print("Total: " + total + "\n");
    }
}