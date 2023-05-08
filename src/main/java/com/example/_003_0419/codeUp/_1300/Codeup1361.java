package com.example._003_0419.codeUp._1300;

import java.util.Scanner;

public class Codeup1361 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(); // 몇 줄인가?
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < 2; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
