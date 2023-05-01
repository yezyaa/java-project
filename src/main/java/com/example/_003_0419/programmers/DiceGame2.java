package com.example._003_0419.programmers;

import java.util.Scanner;

public class DiceGame2 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a != b && b != c && c != a) {
            answer = a + b + c;
        } else if (a == b && b == c && c == a) {
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else {
            answer = (a + b + c) * (a * a + b * b + c * c);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        DiceGame2 diceGame2 = new DiceGame2(); // 객체 생성
        System.out.printf("%d", diceGame2.solution(a, b, c)); // 객체의 메소드 호출
    }
}