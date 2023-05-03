package com.example._003_0419.week3.day13;

public class Factor3 {
    public static void main(String[] args) {
        int num = 36;
        for (int i = 1; i <= num ; i++) {
            if (num % i == 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
