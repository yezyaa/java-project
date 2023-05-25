package com.example._003_0419.codeUp._1000;

import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user1 = sc.nextInt();
        int user2 = sc.nextInt();
        int user3 = sc.nextInt();
        int day = 1;
        while (day % user1 != 0 || day % user2 != 0 || day % user3 != 0) {
            //System.out.printf("%d ", day);
            day++; // 나머지가 0이 아닐 때 day를 카운트함.
        }
        System.out.printf("%d", day);
    }
}
