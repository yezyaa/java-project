package com.example._003_0419.week3.day11;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        // 연속되지 않은 단을 선택적으로 출력하고 싶은 경우
        int[] dan = {2, 4, 8, 9};
        for (int i = 0; i < dan.length; i++) {
            for (int j = 1; j <= 9 ; j++) {
                System.out.printf("%d * %d = %d\n",dan[i], j, dan[i] * j);
            }
            System.out.println("--------");
        }
    }
}
