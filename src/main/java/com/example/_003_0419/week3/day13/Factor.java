package com.example._003_0419.week3.day13;

public class Factor {
    public static void main(String[] args) {
        int num = 6;
        for (int i = 1; i <= num ; i++) {
            System.out.printf("%d %% %d --> %d\n", num, i, num % i);
        }
    }
}
