package com.example._003_0419.week2.day6;

public class DivideIntoTwo {
    public static void main(String[] args) {
        // 1 + 1 / 2
        float fOne = 1;
        float fTwo = 2;
        System.out.printf("%f\n", fOne + fOne / fTwo);

        int iOne = 1;
        int iTwo = 2;
        System.out.printf("%d\n", iOne + iOne / iTwo); // int는 소수점을 버림

        System.out.printf("%d\n", 9 / 2);
        System.out.printf("%f\n", 9 / 2.0);
    }
}
