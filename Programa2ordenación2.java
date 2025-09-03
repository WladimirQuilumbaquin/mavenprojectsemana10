/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglomultidimencional.java;

/**
 *
 * @author ADMIN
 */
import java.util.Arrays;
public class Programa2ordenación2 {
     public static void main(String[] args) {
        // Declarar matriz 3x3
        int[][] matriz = {
            {8, 3, 5},
            {1, 4, 2},
            {5, 6, 3}
        };

        // Copiar la matriz original
        int[][] copia = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            System.arraycopy(matriz[i], 0, copia[i], 0, matriz[i].length);
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        // Ordenar una fila (ejemplo fila 1)
        int fila = 1;
        Arrays.sort(copia[fila]);

        // Mostrar la matriz con la fila ordenada
        System.out.println("\nMatriz con la fila " + fila + " ordenada:");
        imprimirMatriz(copia);
    }

    // Método para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();
        }
    }
}
