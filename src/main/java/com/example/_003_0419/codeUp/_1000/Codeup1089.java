package com.example._003_0419.codeUp._1000;

import java.util.Scanner;

public class Codeup1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt(); // 시작 값 1
        int degree = sc.nextInt(); // 등차 값 3
        int num = sc.nextInt(); // 몇 번째 수인지 5
        // 진행과정 : 1 4 7 10 13
        // 결과출력 : 13

        for (int i = 1; i < num; i++) { // num번 째까지 출력
            start += degree;
        }
        System.out.printf("%d\n", start);
    }
}
