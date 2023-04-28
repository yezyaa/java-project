package com.example._003_0419.codeUp;

import java.util.Scanner;

public class Codeup1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        float result = width * height / 2.0f;
        System.out.printf("%.1f", result);
    }
}
