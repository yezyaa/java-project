package com.example._003_0419.week3.day13;

public class SumOfEvens {
    public static void main(String[] args) {
        int sumOfEvens = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sumOfEvens += i;
            }
        }
        System.out.printf("%d", sumOfEvens);
    }
}
