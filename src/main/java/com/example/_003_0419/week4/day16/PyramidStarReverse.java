package com.example._003_0419.week4.day16;

import java.util.Scanner;

public class PyramidStarReverse {
    public void printPyramid(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = height * 2 - 1; j > i * 2; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PyramidStarReverse pyramidStarReverse = new PyramidStarReverse();
        int input = sc.nextInt(); // 몇 줄인가?
        pyramidStarReverse.printPyramid(input);
    }
}
