package com.example._003_0419.codeUp._1200;

import java.util.Scanner;

public class Codeup1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < i * input; j++) {
                System.out.print("*");
            }
            System.out.printf("\n");
        }
    }
}
