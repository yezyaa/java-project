package com.example._003_0419.codeUp;

import java.util.Scanner;

public class Codeup1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 0; // 약수의 개수

        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
