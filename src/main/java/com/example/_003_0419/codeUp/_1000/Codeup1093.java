package com.example._003_0419.codeUp._1000;

import java.util.Scanner;

public class Codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); // 출석번호를 부른 횟수
        int[] answer = new int[23 + 1]; // 0은 없기 때문에. 배열선언(배열을 다루기 위한 참조변수 선언) + 배열 생성(실제 저장공간을 생성) --> 길이가 24인 int 배열 선언 및 생성

        for (int i = 0; i < cnt; i++) {
            answer[sc.nextInt()]++; // 무작위로 부른 출석번호의 숫자
        }

        for (int i = 1; i < answer.length; i++) { // 출석부의 1~23번 배열에 저장된 값 출력하기
            System.out.printf("%d ", answer[i]);
        }
    }
}
