package com.example._003_0419.codeUp._1000;

import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextInt(); // 시작 값 1
        long multi = sc.nextInt(); // 곱할 값 -2
        long sum = sc.nextInt(); // 더할 값 1
        long num = sc.nextInt(); // 몇 번째 수인지 7

        for (int i = 1; i < num; i++) { // num번 째까지 출력
            start *= multi;
            start += sum;
        }
        System.out.printf("%d\n", start);
    }
}
