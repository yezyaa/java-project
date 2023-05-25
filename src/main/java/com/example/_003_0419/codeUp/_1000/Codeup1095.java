package com.example._003_0419.codeUp._1000;

import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); // 출석번호를 부른 횟수

        // 최소값 구하기
        int targetValue = 0;

        for (int i = 0; i < cnt; i++) {
            // targetValue < arr[i]일 때 교체
            int now = sc.nextInt();
            if (targetValue > now) {
                targetValue = now;
            }
        }
        System.out.printf("targetValue = %d\n", targetValue);
    }
}
