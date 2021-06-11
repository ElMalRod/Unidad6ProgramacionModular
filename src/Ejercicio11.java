package src;

import java.util.*;

public class Ejercicio11 {

    Random Aleatoreo = new Random();
    Scanner sc = new Scanner(System.in);
    String[] Alumnos = new String[6];
    double[] Notas1 = new double[6];
    String[] NombreNotas = new String[6];

    public static void main(String[] args) {
        Ejercicio11 eje = new Ejercicio11();
    }
    // Metodo principal
    public Ejercicio11() {
        System.out.println();
        NotasAlumnos();
 

    }
    // Metodo para ingresar los datos del alumno y con un buucle muestra en mantalla el resultado de la nota
    public void NotasAlumnos() {
        for (int i = 0; i < Alumnos.length; i++) {
               System.out.print("Ingrese el nombre del alumno "+(i+1)+": ");
            Alumnos[i] = sc.nextLine();
            do {
                System.out.print("\n Ingrese la nota: ");
                Notas1[i] = Double.parseDouble(sc.nextLine());
                if (Notas1[i] >= 0 && Notas1[i] < 4.99) {
                    NombreNotas[i] = "Suspenso";
                } else if (Notas1[i] >= 5 && Notas1[i] < 6.99) {
                    NombreNotas[i] = "Bien";
                } else if (Notas1[i] >= 7 && Notas1[i] < 8.99) {
                    NombreNotas[i] = "Notable";
                } else if (Notas1[i] >= 9 && Notas1[i] <= 10) {
                    NombreNotas[i] = "Sobresaliente";
                } else {
                    NombreNotas[i] = "Nota erronea";
                }
            } while (Notas1[i] < 0 || Notas1[i] > 10);
        }
        for (int i = 0; i < Alumnos.length; i++) {
            System.out.println("La nota de " + Alumnos[i] + " es " + Notas1[i] + ", " + NombreNotas[i]);
        }
    }

}
