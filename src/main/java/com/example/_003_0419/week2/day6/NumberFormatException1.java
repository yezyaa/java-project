package com.example._003_0419.week2.day6;

public class NumberFormatException1 {
    public static void main(String[] args) {
        // 컴파일은 되지만 런타임 에러 발생
        String str = "123ab";
        int num = Integer.parseInt(str);
    }
}
