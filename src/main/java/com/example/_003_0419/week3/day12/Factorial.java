package com.example._003_0419.week3.day12;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = 1; // 0으로 하면 안됨
        for (int i = input; i > 0; i--) {
            result *= i;
        }
        System.out.printf("%d", result);
    }
}
