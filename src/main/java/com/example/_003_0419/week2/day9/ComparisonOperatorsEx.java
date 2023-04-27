package com.example._003_0419.week2.day9;

public class ComparisonOperatorsEx {
    public static void main(String[] args) {
        int iVal1 = 10;
        int iVal2 = 20;
        boolean result = iVal1 == iVal2;
        System.out.println(result);

        System.out.printf("iVal1 == iVal2 --> %b\n", iVal1 == iVal2);
        System.out.printf("iVal1 != iVal2 --> %b\n", iVal1 != iVal2);
        System.out.printf("iVal1 < iVal2 --> %b\n", iVal1 < iVal2);
        System.out.printf("iVal1 <= iVal2 --> %b\n", iVal1 <= iVal2);
        System.out.printf("iVal1 > iVal2 --> %b\n", iVal1 > iVal2);
        System.out.printf("iVal1 >= iVal2 --> %b\n", iVal1 >= iVal2);
    }
}
