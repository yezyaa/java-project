package com.example._003_0419.codeUp;

import java.util.Scanner;

public class Codeup1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long val = sc.nextLong();
        if (val > 0) {
            System.out.println("plus");
        } else {
            System.out.println("minus");
        }
        if (val % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
