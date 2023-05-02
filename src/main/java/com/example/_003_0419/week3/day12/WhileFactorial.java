package com.example._003_0419.week3.day12;

public class WhileFactorial {
    public static void main(String[] args) {
        int input = 5;
        int answer = 1;
        while (input > 0) {
            System.out.printf("%d: %d\n", input, answer);
            answer *= input--;
        }
    }
}
