package com.example._003_0419.week3.day13;

import java.util.Scanner;

public class EvenNumberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.print("짝수를 입력하세요: ");
            input = sc.nextInt();
        } while (input % 2 != 0);
        System.out.printf("올바른 짝수가 입력되었습니다: %d", input);
    }
}
