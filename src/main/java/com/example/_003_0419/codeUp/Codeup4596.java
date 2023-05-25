package com.example._003_0419.codeUp;

import java.util.Scanner;

public class Codeup4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10]; // 0번대는 비움
        int xIdx = 0;
        int yIdx = 0;

        // 0(N^2)
        int maxValue = 0;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                int now = sc.nextInt();
                if (maxValue < now) {
                    maxValue = now;
                }
            }
        }
    }
}
