package com.example._003_0419.week3.day11;

public class Sum1to100 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
            System.out.println(sum);
        }
        System.out.printf("누적값은 %d입니다.", sum);
    }
}
