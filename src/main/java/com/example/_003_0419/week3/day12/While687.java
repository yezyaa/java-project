package com.example._003_0419.week3.day12;

public class While687 {
    public static void main(String[] args) {
        int n = 687;
        int answer = 0;

        while (n > 0) {
            answer += n % 10; // 7 8 6
            n = n / 10; // 68 6
        }

        System.out.println(answer);
    }
}
