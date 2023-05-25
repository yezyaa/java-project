package com.example._003_0419.codeUp._1000;

import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); // 출석번호를 부른 횟수
        int[] arr = new int[cnt];
        int idx = 0;

        for (int i = 0; i < cnt; i++) {
            arr[idx++] = sc.nextInt(); // 무작위로 부른 출석번호의 숫자
        }

        for (int i = arr.length - 1; i >= 0; i--) { // 출석부의 1~23번 배열에 저장된 값 출력하기
            System.out.printf("%d ", arr[i]);
        }
    }
}
