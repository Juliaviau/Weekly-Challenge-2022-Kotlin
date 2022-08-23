package com.mouredev.weeklychallenge2022;


public class Solucion0 {
    public static void main (String [] args) {
        for (int i = 1; i < 101; i++) {
            if (i%3 == 0 || i%5 == 0) {
                if (i%3 == 0){
                    System.out.print("fizz");
                }
                if (i%5 == 0) {
                    System.out.print("buzz");
                }
            } else {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
