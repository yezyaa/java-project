package com.example._003_0419.week4.day15;

public class Payment {
    public static void main(String[] args) {
        Accout accout = new Accout();
        boolean isSufficient = accout.isSufficient();
        if (isSufficient) {
            System.out.println("결제 처리합니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}
