package com.mycompany.ejerciciopn24;
import java.util.Scanner;
public class EjercicioPN24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso de la esfera A: ");
        double pesoA = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera B: ");
        double pesoB = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera C: ");
        double pesoC = scanner.nextDouble();

        if (pesoA > pesoB && pesoA > pesoC) {
            System.out.println("La esfera A es la de mayor peso.");
        } else if (pesoB > pesoA && pesoB > pesoC) {
            System.out.println("La esfera B es la de mayor peso.");
        } else if (pesoC > pesoA && pesoC > pesoB) {
            System.out.println("La esfera C es la de mayor peso.");
        } else {
            System.out.println("Hay dos o más esferas con el mismo peso máximo.");
        }

        scanner.close();
    }
}
