package com.example._003_0419.codeUp._1000;

import java.util.Scanner;

public class Codeup1039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");
        System.out.printf("%d", Long.parseLong(strArr[0]) + Long.parseLong(strArr[1]));
    }
}
