package com.cesarovasifra.main;

import java.util.Locale;

public class CipherUtills {
    public static String cipher(String input, int key) {
        int[] asc = transformToAsciiArr(input);

        int x = 122 + 1 - 97;
        for (int i = 0; i < asc.length; i++) {
            if (key >= 0) {
                asc[i] = (asc[i] + key - 97) % x + 97;
            } else {
                asc[i] = ((asc[i] + key) - key * x - 97) % x + 97;
            }
        }
        return transformToString(asc);
    }

    public static int[] transformToAsciiArr(String input){
        int[] asc = new int[input.toCharArray().length];
        for (int i = 0; i < input.toCharArray().length; i++) {
            asc[i] = (int) input.toLowerCase().toCharArray()[i];
        }
        return asc;
    }

    public static String transformToString(int[] arr){
        String result = "";
        for (int a : arr) result += (char) a;
        return result;
    }
}
