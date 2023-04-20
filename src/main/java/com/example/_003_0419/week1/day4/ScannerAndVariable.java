package com.example._003_0419.week1.day4;

import java.util.Scanner;

public class ScannerAndVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2와 3을 더하면 5입니다.
        int val1 = sc.nextInt(); // 입력이 들어오기 전에는 메모리에 생성이 안 됨. 즉, 스택영역에 메모리가 할당이 안됨
        int val2 = sc.nextInt();
        System.out.println(val1 + val2);
        System.out.printf("%d와 %d의 합은 %d입니다.", val1, val2, val1 + val2);
    }
}
