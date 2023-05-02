package com.example._003_0419.codeUp._1000;

import java.util.Scanner;

public class Codeup1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextInt();
        double h = sc.nextInt();
        double b = sc.nextInt();
        double pixel = w * h * b;
        double result = pixel / 1024 / 1024 / 8;
        System.out.printf("%.2f MB", result);
    }
}
