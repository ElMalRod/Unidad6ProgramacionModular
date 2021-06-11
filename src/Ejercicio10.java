package src;

import java.util.*;

public class Ejercicio10 {

    Random Aleatoreo = new Random();
    Scanner sc = new Scanner(System.in);
    int[][] matriz1 = new int[3][4];

    public static void main(String[] args) {
        Ejercicio10 eje = new Ejercicio10();
    }
    // Metodo principal 
    public Ejercicio10() {
        matrices();
        Mostrarmatriz();
        System.out.println("Datos de la Matriz Traspuesta :");
        intercambio();

    }
    // Metodo que genera numeros al azar para llenar la matriz
    public void matrices() {
        System.out.println("Datos de la Matriz :");
        for (int x = 0; x < matriz1.length; x++) {
            for (int y = 0; y < matriz1[x].length; y++) {
                matriz1[x][y] = (int) (Math.random() * 999) + 1;
            }
        }

    }
    // metodo que imprime la matiz generada
    public void Mostrarmatriz() {
        for (int i = 0; i < matriz1.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j]);
                if (j != matriz1[i].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }

    }
    // Metodo que hace la matriz traspuesta y la imprime 
    public void intercambio() {
        for (int i = 0; i < matriz1.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j][i]);
                if (j != matriz1[i].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }

    }

}