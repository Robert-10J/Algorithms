package com.Algoritmos;
public class Shell {

    public void shellShort(int [] arrayShell) {
        int salto, i, j, k, aux;
        salto = arrayShell.length / 2;
        while (salto > 0) {
            for (i = salto; i < arrayShell.length; i++) {
                j = i - salto;
                while (j >= 0) {
                    k = j + salto;
                    if (arrayShell[j] <= arrayShell[k]) {
                        j = -1;
                    } else {
                        aux = arrayShell[j];
                        arrayShell[j] = arrayShell[k];
                        arrayShell[k] = aux;
                        j -= salto;
                    }
                }
            }

            salto = salto / 2;
        }
        imprimir(arrayShell);
    }

    public void imprimir(int [] array) {
        for (int recorrer: array) {
            System.out.print(recorrer + " ");
        }
    }
}
