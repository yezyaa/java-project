package com.example._003_0419.codeUp._1000;

import java.util.Scanner;

public class Codeup1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            if (i % 3 == 0) continue;
            System.out.printf("%d ", i);
        }
    }
}
