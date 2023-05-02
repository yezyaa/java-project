package com.example._003_0419.codeUp;

import java.util.Scanner;

public class Codeup1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(); // ex) 123
        int count = 0;

        while (input > 0) { // 123 12 1
            input /= 10; // 12 1 0
            count++; // 1 2 3
        }
        System.out.printf("%d", count);
    }
}
