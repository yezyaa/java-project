package com.example._003_0419.week3.day13;

public class IsPrime1 {
    public static void main(String[] args) {
        int num = 7;
        for (int i = 2; i < num; i++) {
            System.out.printf("%d %% %d --> %d\n", num, i, num % i); // 2 ~ n-1 에서 0이 없으면 소수.
        }
    }
}
