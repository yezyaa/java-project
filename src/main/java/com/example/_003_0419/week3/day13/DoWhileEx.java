package com.example._003_0419.week3.day13;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            num = sc.nextInt();
            System.out.println(num);
        } while (num != 0);
    }
}
