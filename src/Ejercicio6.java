package src;

import java.util.*;

public class Ejercicio6 {

    Random Aleatoreo = new Random();
    Scanner sc = new Scanner(System.in);
    int matriz[][] = new int[3][3];

    public static void main(String[] args) {
        Ejercicio6 eje = new Ejercicio6();
    }
    // Metodo Principal en donde llenamos la matriz con los datos dados
    public Ejercicio6() {
        matriz[0][0] = 5;
        matriz[0][1] = 6;
        matriz[0][2] = 13;
        matriz[1][0] = 14;
        matriz[1][1] = 2;
        matriz[1][2] = 4;
        matriz[2][0] = 21;
        matriz[2][1] = 7;
        matriz[2][2] = 6;
        matriz();
        System.out.println("MULTIPLICADA POR 2");
        matrizResultado();
    }
    // metodo matriz imprime la matriz original
    public void matriz() {
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
    // metodo que hace la multiplicacion de la matriz original y la imprime con sus nuevos resultados
    public void matrizResultado() {
        int n = 2;
        int[][] resultado = new int[matriz.length][matriz[0].length];
        for (int x = 0; x < resultado.length; x++) {
            System.out.print("|");
            for (int y = 0; y < resultado[x].length; y++) {
                resultado[x][y] = n * matriz[x][y];
                System.out.print(resultado[x][y]);
                 if (y != matriz[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }

}