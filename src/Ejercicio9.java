package src;

import java.util.*;

public class Ejercicio9 {
    // variables globales
    Random Aleatoreo = new Random();
    Scanner sc = new Scanner(System.in);
    int[][] matriz1 = new int[3][3];
    int[][] matriz2 = new int[3][3];
    int[][] matrizt = new int[3][3];
    int i, j;

    public static void main(String[] args) {
        Ejercicio9 eje = new Ejercicio9();
    }
    // Metodo principal 
    public Ejercicio9() {
        matrices();
        Suma();

    }
    // metodo para llenar los datos de las matrices
    public void matrices() {
        System.out.println("Datos de la Matriz 1 :");

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print("Escribir valor " + i + " , " + j + " : ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Datos de la Matriz 2 :");

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print("Escribir valor " + i + " , " + j + " : ");
                matriz2[i][j] = sc.nextInt();
            }
        }

    }
    // metodo que realiza la suma de las matrices
    public void Suma() {
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                matrizt[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz resultante de la suma :");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(matrizt[i][j] + " ");
            }
            System.out.println("");

        }
    }

}