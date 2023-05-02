package com.example._003_0419.codeUp._1000;

import java.util.Scanner;

public class Codeup1056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        boolean result = val1 != val2;
        System.out.printf("%d", result ? 1 : 0);
    }
}
