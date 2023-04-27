package com.example._003_0419.week2.day9;

public class BoilerControl {
    public static void main(String[] args) {
        int waterTemperature = 45; // 물 온도
        int roomTemperature = 22; // 실내온도

        boolean check = waterTemperature < 50 && roomTemperature < 24;
        System.out.printf("check: %b\n", check);
    }
}
