package com.example._003_0419.codeUp;

import java.util.Scanner;

public class Codeup1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();
        float avg = (val1 + val2 + val3) / 3.0f;
        System.out.printf("%.2f", avg);
    }
}
