package com.example._003_0419.week3.day11;

public class MultiplicationTableStep3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 4; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, 2 * j);
            }
        }
    }
}
