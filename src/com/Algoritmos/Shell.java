package com.Algoritmos;
public class Shell {
    public void shellShort(int [] arrayShell) {
        int jump, i, j, k, aux;
        jump = arrayShell.length / 2;
        while (jump > 0) {
            for (i = jump; i < arrayShell.length; i++) {
                j = i - jump;
                while (j >= 0) {
                    k = j + jump;
                    if (arrayShell[j] <= arrayShell[k]) {
                        j = -1;
                    } else {
                        aux = arrayShell[j];
                        arrayShell[j] = arrayShell[k];
                        arrayShell[k] = aux;
                        j -= jump;
                    }
                }
            }
            jump = jump / 2;
        }
        imprimir(arrayShell);
    }

    public void imprimir(int [] array) {
        for (int recorrer: array) {
            System.out.print(" [" + recorrer + "] " + " ");
        }
    }
}
