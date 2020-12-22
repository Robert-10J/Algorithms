package com.Algoritmos;
public class Radix {
    public void algoritRadix(int [] array) {
        int x, i, j;
        for (x = Integer.SIZE - 1; x >= 0; x--) {
            int aux [] = new int[array.length];
            j = 0;
            for (i = 0; i < array.length; i++) {
                boolean mov = array[i] << x >= 0; //Pregunta para asignar s
                if ((x == 0) != mov) {
                    aux[j] = array[i];
                    j++;
                } else {
                    array[i - j] = array[i];
                }
            }
            for (i = j; i < aux.length; i++) {
                aux[i] = array[i - j];
            }
            array = aux;
        }
        mostrar(array);
    }

    public void mostrar(int [] array) {
        for (int recorrido: array) {
            System.out.print(" [" + recorrido + "] " + " ");
        }
    }
}