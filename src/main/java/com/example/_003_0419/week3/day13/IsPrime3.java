package com.example._003_0419.week3.day13;

public class IsPrime3 {
    public static void main(String[] args) {
        int num = 7;
        int factors = 0; // 약수의 개수
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                factors++;
            }
        }
        System.out.printf("factors: %d\n", factors); // 약수의 개수
        System.out.printf("%s", factors == 0 ? "소수입니다." : "소수가 아닙니다."); // 소수 인가요?
    }
}
