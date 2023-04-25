package com.example._003_0419.codeUp;

import java.util.Scanner;

public class Codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        System.out.printf(num.substring(0, 6));
        System.out.printf(num.substring(7, 14));
    }
}
