package com.example._003_0419.week3.day11;

public class NewSwitchCaseDaysOfMonth {
    public static void main(String[] args) {
        int month = 11;
        int lastDate = switch(month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31; // -> 타입 추론
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> throw new IllegalArgumentException("잘못된 월:" + month);
        };
        System.out.printf("%d월은 %d일까지 있습니다.\n", month, lastDate);
    }
}
