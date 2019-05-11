package com.sda.algorytmy;


public class App {
    public static void main(String[] args) {

        System.out.println(ciagF(11));

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
}

