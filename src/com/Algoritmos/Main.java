package com.Algoritmos;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        var opcion = 0;
        int[] arrayRadix = new int[10];
        int[] arrayShellShort = new int[10];

        Radix radix = new Radix();
        Shell shell = new Shell();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de opciones \n\n" +
                                "1.- Algoritmo Radix \n" +
                                "2.- Algoritmo ShellShort\n" +
                                "3.- Salir \n\n"));

                switch (opcion) {
                    case 1:
                        System.out.println();
                        for (int i = 0; i < arrayRadix.length; i++) {
                            arrayRadix[i] = (int) (Math.random() * 100 + 1);
                        }
                        System.out.println("Algoritmo de ordenamiento Radix: ");
                        System.out.print("Desordenado: ");
                        radix.mostrar(arrayRadix);
                        System.out.print("\nOrdenado: ");
                        radix.algoritRadix(arrayRadix);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println();
                        for (int i = 0; i < arrayShellShort.length; i++) {
                            arrayShellShort[i] = (int) (Math.random() * 100 + 1);
                        }
                        System.out.println("Algoritmo de ordenamiento ShellShort");
                        System.out.print("Desordenado: ");
                        shell.imprimir(arrayShellShort);
                        System.out.print("\nOrdenado: ");
                        shell.shellShort(arrayShellShort);
                        System.out.println();
                        break;
                    case 3:
                        opcion = 3;
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opcion no valida",
                        "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        } while (opcion != 3);
    }
}