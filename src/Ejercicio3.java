package src;

import java.util.*;

public class Ejercicio3 {

    Scanner sc = new Scanner(System.in);
    int[] Vector = new int[8];

    public static void main(String[] args) {
        Ejercicio3 eje = new Ejercicio3();
    }
    // Clase principal
    public Ejercicio3() {
        int Num;
        boolean Valor;
        LlenarVector();
        System.out.print("Ingrese el Numero a buscar: ");
        Num = sc.nextInt();
        Valor = Buscador(Num);
        // Evalua si el valor a buscar se encuntra en el arreglo
        if (Valor == true) {
            System.out.println("Valor Encontrado");
        } else {
            System.out.println("Valor No Encontrado");
            MostrarNumeros();
        }

    }
    // Funcion para llenar el arrglo auntomaticamente con 8 numeros
    public void LlenarVector() {

        for (int i = 0; i < 8; i++) {
            int Random = (int) (Math.random() * 100);
            Vector[i] = Random;
        }
    }
    // El metodo Buscador que hace la busqueda del numero en el arreglo
    public boolean Buscador(int num) {

        boolean Valor = false;

        for (int i = 0; i < 8; i++) {
            if (Vector[i] == num) {
                Valor = true;
            } else {
                Valor = false;
            }
        }

        return Valor;
    }
    // Funcion que mustra al final los numeros generados por el random y que se guardan en elñ arreglo vector
    public void MostrarNumeros() {

        System.out.print("Los numeros en el arreglo son: ");
        for (int i = 0; i < 8; i++) {
            System.out.print("\n" + (i + 1) + ": " + Vector[i]);
        }
        System.out.println("");
    }

}