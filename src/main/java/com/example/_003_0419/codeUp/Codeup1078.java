package com.example._003_0419.codeUp;

import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= input; i += 2) {
            sum += i;
        }
        System.out.printf("%d", sum);
    }
}
