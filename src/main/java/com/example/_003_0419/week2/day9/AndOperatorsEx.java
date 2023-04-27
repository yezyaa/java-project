package com.example._003_0419.week2.day9;

public class AndOperatorsEx {
    public static void main(String[] args) {
        boolean result = true && true;
        System.out.printf("%b\n", result);
        result = true && false;
        System.out.printf("%b\n", result);
        result = false && true;
        System.out.printf("%b\n", result);
        result = false && false;
        System.out.printf("%b\n", result);
    }
}
