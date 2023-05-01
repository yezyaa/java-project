package com.example._003_0419.codeUp;

import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        for (int i = 97; i <= input; i++) {
            System.out.printf("%c ", i);
        }
    }
}
