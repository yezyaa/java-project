package com.example._003_0419.week2.day10;

import java.util.Scanner;

public class BCompanyHRSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yearsOfExp = sc.nextInt();
        int numOfProj = sc.nextInt();

        if (yearsOfExp > 5 || numOfProj > 10) {
            System.out.println("팀장 승진 대상입니다.");
        } else {
            System.out.println("팀장 승진 대상이 아닙니다.");
        }
    }
}
