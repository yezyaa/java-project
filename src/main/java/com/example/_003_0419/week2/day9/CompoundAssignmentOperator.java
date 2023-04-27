package com.example._003_0419.week2.day9;

public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        int x = 10;
        System.out.printf("x는 %d\n", x);
        x += 1;
        System.out.printf("x += 1는 %d\n", x);
        x -= 5;
        System.out.printf("x -= 5는 %d\n", x);
        x *= 2;
        System.out.printf("x *= 2는 %d\n", x);
        x /= 3;
        System.out.printf("x /= 3는 %d\n", x);
        x %= 8;
        System.out.printf("x %%= 8는 %d\n", x);
    }
}
