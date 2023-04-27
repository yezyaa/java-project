package com.example._003_0419.week2.day9;

public class CheckWhetherAdult {
    public static void main(String[] args) {
        int userAge = 31;
        boolean isAdult = userAge >= 18;
        System.out.printf("미성년자입니까? %b\n", !isAdult);
    }
}
