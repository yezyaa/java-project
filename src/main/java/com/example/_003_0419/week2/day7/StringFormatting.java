package com.example._003_0419.week2.day7;

public class StringFormatting {
    public static void main(String[] args) {
        String name = "이예지";
        int balance = 20_000_000;
        String result = String.format("%s님의 통장 잔고는 %d원 입니다.", name, balance);
        System.out.println(result);
    }
}
