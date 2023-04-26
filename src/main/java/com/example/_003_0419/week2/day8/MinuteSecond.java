package com.example._003_0419.week2.day8;

public class MinuteSecond {
    public static void main(String[] args) {
        int seconds = 239;
        int minute = seconds / 60;
        int remainSeconds = seconds % 60;
        System.out.printf("%d분 %d초", minute, remainSeconds);
    }
}
