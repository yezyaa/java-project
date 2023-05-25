package com.example._003_0419.codeUp._1000;

import java.util.Scanner;

public class Codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextInt(); // 시작 값 2
        long degree = sc.nextInt(); // 등차 값 3
        long num = sc.nextInt(); // 몇 번째 수인지 7
        // 진행과정 : 2 6 18 54 162 486 1458
        // 결과출력 : 1458

        for (int i = 1; i < num; i++) { // num번 째까지 출력
            start *= degree;
        }
        System.out.printf("%d\n", start);
    }
}
