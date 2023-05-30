package com.example._003_0419.tutoopjdbc;

public class Main {
    public static void main(String[] args) {
        checkLeapYear();
    }

    private static void checkLeapYear() {
        // 윤년 알아맞추기
        int year = 2100;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "년 : 윤년");
        } else {
            System.out.println(year + "년 : 평년");
        }
    }
}
