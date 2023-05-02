package com.example._003_0419.codeUp._1000;

import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= input; i++) {
            sum += i;
            if (input <= sum) {
                System.out.printf("%d", i);
                break;
            }
        }
    }
}
