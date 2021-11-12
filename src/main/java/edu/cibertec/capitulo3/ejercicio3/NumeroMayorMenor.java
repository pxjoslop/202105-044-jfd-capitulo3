package edu.cibertec.capitulo3.ejercicio3;

import java.util.Scanner;

public class NumeroMayorMenor {

    public static void main(String[] args) {
        int contador = 1;
        int numeros[] = new int[5];
        
        System.out.println("Ingrese 5 números enteros");
        //llenar el array
        Scanner scanner = new Scanner(System.in);
        while (contador != 6) {
            System.out.print("Ingrese número "+contador+" : ");
            numeros[contador-1] = scanner.nextInt();
            contador++;
        }
        scanner.close();
        
        int mayor = 0;
        int menor = 999999;
        System.out.println("------------------");
        System.out.print("Los números ingresados fueron: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor)
                mayor = numeros[i];
            if (numeros[i] < menor)
                menor = numeros[i];
            System.out.print(numeros[i]+" ");
        }
        System.out.println("\nEl número mayor ingresado es: "+mayor);
        System.out.println("El número menor ingresado es: "+menor);
    }
}
