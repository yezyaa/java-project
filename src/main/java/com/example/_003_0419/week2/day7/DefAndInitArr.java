package com.example._003_0419.week2.day7;

import java.util.Arrays;

public class DefAndInitArr {
    public static void main(String[] args) {
        int[] iArr = new int[5]; // 배열 초기화 할 때는 반드시 개수 넣어주기.
        iArr[0] = 2;
        iArr[1] = 4;
        iArr[2] = 7;
        System.out.println(Arrays.toString(iArr)); // Array기능
        System.out.println(iArr[0]);
        System.out.println(iArr[1]);
        System.out.println(iArr[2]);
        System.out.println(iArr[3]);
        System.out.println(iArr[4]);
    }
}
