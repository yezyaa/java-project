package com.example._003_0419.codeUp;

import java.util.Scanner;

public class Codeup1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        System.out.println(val1 + val2);
        System.out.println(val1 - val2);
        System.out.println(val1 * val2);
        System.out.println(val1 / val2);
        System.out.println(val1 % val2);
        System.out.printf("%.02f", val1 / (float)val2);
    }
}
