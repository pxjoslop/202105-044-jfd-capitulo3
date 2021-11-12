package edu.cibertec.capitulo3.ejercicio1;

import java.util.Scanner;

public class ComparaNumeros {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese número 1:");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese número 2:");
        numero2 = scanner.nextInt();
        scanner.close();

        if (numero1 > 10 || numero2 > 10) {
            System.out.println("Números deben ser menores a 10");
        } else {
            if (numero1 > numero2) {
                System.out.println("Primer número mayor al segundo");
            } else if (numero2 > numero1) {
                System.out.println("Segundo número mayor al primero");
            } else {
                System.out.println("Números iguales");
            }

            System.out.print("El primer número es ");
            switch (numero1) {
                case 0:
                    System.out.println("cero");
                    break;
                case 1:
                    System.out.println("Uno");
                    break;
                case 2:
                    System.out.println("Dos");
                    break;
                case 3:
                    System.out.println("Tres");
                    break;
                case 4:
                    System.out.println("Cuatro");
                    break;
                case 5:
                    System.out.println("Cinco");
                    break;
                case 6:
                    System.out.println("Seis");
                    break;
                case 7:
                    System.out.println("Siete");
                    break;
                case 8:
                    System.out.println("Ocho");
                    break;
                case 9:
                    System.out.println("Nueve");
                    break;
            }
        }
    }
}
