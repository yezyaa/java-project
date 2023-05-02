package com.example._003_0419.week3.day12;

public class Digits {
    public static void main(String[] args) {
        int num = 456789;
        int digits = 0;
        while (num > 0) {
            num /= 10;
            digits++;
        }
        System.out.printf("%d", digits);
    }
}
