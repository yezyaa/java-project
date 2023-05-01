package com.example._003_0419.week3.day11;

public class MultiplicationTable3 {
    // 메소드를 이용한 분리
    public static void printDan(int dan) {
        for (int i = 1; i <= 9 ; i++) {
            System.out.printf("%d * %d = %d\n", dan, i, dan * i);
        }
        System.out.println("--------");
    }
    public static void main(String[] args) {
        printDan(2);
        printDan(4);
        printDan(8);
        printDan(9);
    }
}
