package com.example._003_0419.week1.day4;

import java.util.Scanner;

public class ScannerExAdd {
    public void readTwoNumbersAndPlus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 개의 숫자를 입력하세요. 입력하고 엔터 입력하고 엔터");
        System.out.print("첫 번째 숫자 : ");
        System.out.println("첫 번째 숫자는 " + scanner.nextInt() + "입니다");
        System.out.print("두 번째 숫자 : ");
        System.out.println("두 번째 숫자는 " + scanner.nextInt() + "입니다");
    }
}
