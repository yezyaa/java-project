package com.example._003_0419.programmers;

import java.util.Scanner;

public class P120823_RightTriangleStar {
    // 직각삼각형 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(); // 몇 줄인가?
        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
