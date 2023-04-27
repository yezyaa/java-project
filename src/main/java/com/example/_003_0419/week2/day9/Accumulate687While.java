package com.example._003_0419.week2.day9;

public class Accumulate687While {
    public static void main(String[] args) {
        // 변수, 누적, 연산, 나머지, 몫
        int num = 687;
        int answer = 0;

        while (num > 0) {
            // 나머지를 먼저 구하고
            answer = answer + (num % 10);
            // 그 뒤에 몫을 구해야 합니다.
            num = num / 10;
            // 68 --> 10으로 나눈 나머지 8
            System.out.printf("num:%d, answer:%d\n", num, answer);
        }
    }
}
