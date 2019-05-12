package com.sda.algorytmy;


public class App {
    public static void main(String[] args) {

        System.out.println(ciagF(11));
        ciagFr(11);
    }

    public static int ciagF(int a) {

        if (a == 0) {
            return 0;
        }
        if (a == 1) {
            return 1;
        }
        return ciagF(a - 1) + ciagF(a - 2);
    }

    public static void ciagFr(int a) {

        int[] tab = new int[20];
        tab[0] = 0;
        tab[1] = 1;
        for (int i = 2; i < tab.length; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
            System.out.println(tab[i]);
        }

    }
}

