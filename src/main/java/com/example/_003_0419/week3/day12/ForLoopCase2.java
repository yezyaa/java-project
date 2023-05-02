package com.example._003_0419.week3.day12;

public class ForLoopCase2 {
    public static void main(String[] args) {
        // Math.sqrt()
        for (int i = 0; i < Math.sqrt(50); i++) { // 루트50 표현법
            System.out.println(i);
        }
        for (int i = 2; i * i <= 50; i++) {
            System.out.println(i);
        }
    }
}
