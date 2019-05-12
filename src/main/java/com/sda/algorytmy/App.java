package com.sda.algorytmy;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Ciaga F rekurencyjnie: " + ciagFr(11));
        System.out.println("Ciag F iteracyjnie z tablic: ");
        ciagFt(11);
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe ciagu F: ");
        int x = scan.nextInt();
        System.out.println("Ciag iteracyjnie z tej liczby: ");
        ciagFnT(x);
    }

    public static int ciagFr(int a) {

        if (a == 0) {
            return 0;
        }
        if (a == 1) {
            return 1;
        }
        return ciagFr(a - 1) + ciagFr(a - 2);
    }

    public static void ciagFt(int a) {

        int[] tab = new int[a+1];
        tab[0] = 0;
        tab[1] = 1;
        for (int i = 2; i < tab.length; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
            System.out.println(tab[i]);
        }
    }

    public static void ciagFnT(int x) {
        if (x < 2) {
            System.out.println(x);
        }
        int a = 0;
        int b = 1;
        int wynik = 1;
        for (int i = 2; i < x; i++) {
            a = b;
            b = wynik;
            wynik = a + b;
        }
        System.out.println(wynik);
    }
}

