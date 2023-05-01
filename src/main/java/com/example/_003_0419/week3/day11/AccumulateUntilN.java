package com.example._003_0419.week3.day11;

import java.util.Scanner;

public class AccumulateUntilN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 숫자 한개를 입력받음
        int sum = 0; // 값이 누적될 변수 선언
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.printf("%d", sum);
    }
}
