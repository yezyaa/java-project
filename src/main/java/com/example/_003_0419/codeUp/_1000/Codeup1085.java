package com.example._003_0419.codeUp._1000;

import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float h = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float s = sc.nextInt();
        float bit = h * b * c * s; // bit
        float result = bit / 1024 / 1024 / 8.0f;
        System.out.printf("%.1f MB", result);
    }
}
