package com.example._003_0419.week1.day4;

import java.util.Scanner;

public class AverageEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%.1f", (sc.nextFloat() + sc.nextFloat() + sc.nextFloat()) / 3);
        // System.out.printf("%.1f", (sc.nextInt() + sc.nextInt() + sc.nextInt()) / 3.0); 으로 해줘도 됨
    }
}
