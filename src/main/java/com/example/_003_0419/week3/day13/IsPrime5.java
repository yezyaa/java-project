package com.example._003_0419.week3.day13;

public class IsPrime5 {
    public static void main(String[] args) {
        // 2 ~ n-1 까지만 check
        // i * i <= 50
        // num % i == 0 이면 break;

        int num = 992;
        boolean isPrime = true;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
