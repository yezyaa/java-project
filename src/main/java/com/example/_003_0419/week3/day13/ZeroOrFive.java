package com.example._003_0419.week3.day13;

public class ZeroOrFive {
    public static boolean isZeroOrFive(int num) {
        while (num > 0) {
            int remainder = num % 10; // 나머지 구하기
            if (remainder % 5 != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 254; // 25 3 0
        int cnt = 0;

        System.out.printf("%d는 5와 0으로만 구성되었나요? %b", num, isZeroOrFive(num));
    }
}
