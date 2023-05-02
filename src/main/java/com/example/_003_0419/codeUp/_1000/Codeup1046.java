package com.example._003_0419.codeUp._1000;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();
        int add = val1 + val2 + val3;
        float result = (float)add / 3;
        System.out.printf("%d\n", add);
        System.out.printf("%.01f\n", result);
    }
}
