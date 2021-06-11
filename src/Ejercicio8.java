package src;

import java.util.*;

public class Ejercicio8 {
    // Variables Globales
    Random Aleatoreo = new Random();
    Scanner sc = new Scanner(System.in);
    String palabras1[] = new String[5];
    String palabras2[] = new String[5];

    public static void main(String[] args) {
        Ejercicio8 eje = new Ejercicio8();
    }
    // Metodo principal llama a la funcion llenarMatirz  y a Evaluar
    public Ejercicio8() {
        System.out.println("\nPrimer ELemento");
        LlenarMatriz(palabras1);
        System.out.println("\nSegundo Elemento");
        LlenarMatriz(palabras2);
        Evaluar(palabras1, palabras2);
    }
    // Metodo para llener ambos arreglo de String 
    public void LlenarMatriz(String[] matriz) {
        System.out.println("Ingrese 5 palabras: \n");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            String palabra = sc.nextLine();
            matriz[i] = palabra;
        }
    }
    //  Evalua los Arrglegos para ver si existen palabras iguales
    public void Evaluar(String arreglo1[], String arreglo2[]) {

        for (int i = 0; i < arreglo1.length; i++) {
            if (arreglo1[i].equals(arreglo2[i])) {
                String palabra = arreglo1[i];
                int largo = palabra.length();
                System.out.print("La palabra repetida es " + palabra + " en la posicion " + (i + 1) + " y tiene " + largo + " letras\n");
            }
            else  {
                System.out.println("No son iguales");
            }
        }
        System.out.println("");
    }
}
