package com.example._003_0419.codeUp._1100;

import java.util.Scanner;

public class Codeup1124 {
    // C1H1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("H");
        str[0] = str[0].substring(1);
        int valC = Integer.parseInt(str[0]);
        int valH = Integer.parseInt(str[1]);
        System.out.printf("%d", valC * 12 + valH);
    }
}
