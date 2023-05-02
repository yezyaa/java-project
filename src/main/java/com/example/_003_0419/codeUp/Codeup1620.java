package com.example._003_0419.codeUp;

import java.util.Scanner;

public class Codeup1620 {
    public static int sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
            if (sum >= 10) {
                sum = sum(sum);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(); // 1234567
        System.out.printf("%d", sum(input));
    }
}