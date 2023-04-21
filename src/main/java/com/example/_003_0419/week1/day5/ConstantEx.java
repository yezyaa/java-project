package com.example._003_0419.week1.day5;

import com.example._003_0419.PrintHello;

public class ConstantEx {
    public final int MAX_LEVEL = 3; // 아무대서나 호출 불가능.
    public static final int MIN_LEVEL = 3; // 전역변수로 사용 가능
    public static void main(String[] args) {
        final int iVal;
        iVal = 1;
        System.out.println(iVal);

        final PrintHello printHello = new PrintHello();

    }
}
