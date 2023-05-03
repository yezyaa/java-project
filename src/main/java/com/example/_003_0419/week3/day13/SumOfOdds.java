package com.example._003_0419.week3.day13;

public class SumOfOdds {
    public static void main(String[] args) {
        int sumOfOdds = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                sumOfOdds += i;
            }
        }
        System.out.printf("%d", sumOfOdds);
    }
}
