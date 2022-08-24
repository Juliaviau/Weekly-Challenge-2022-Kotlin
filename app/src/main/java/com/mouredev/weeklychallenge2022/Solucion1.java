package com.mouredev.weeklychallenge2022;

public class Solucion1 {

    public static void main (String [] args) {
        System.out.println(esAnagrama("hoal","hola"));
    }

    static boolean esAnagrama(String primera, String segunda) {
        if (!primera.equals(segunda)) {
            for (char e:primera.toCharArray()) {
                if (segunda.indexOf(e) == -1) {return false;}
            }
            return true;
        }
        return false;
    }



}
