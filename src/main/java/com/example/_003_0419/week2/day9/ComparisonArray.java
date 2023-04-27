package com.example._003_0419.week2.day9;

import java.util.Arrays;

public class ComparisonArray {
    public static void main(String[] args) {
        // 버블 정렬
        int[] arr = {2, 1, 7, 9};
        System.out.println(Arrays.toString(arr));
        System.out.printf("%d > %d --> %b\n", arr[0], arr[1], arr[0] > arr[1]);
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.println(Arrays.toString(arr));
        System.out.printf("%d > %d --> %b\n", arr[1], arr[2], arr[1] > arr[2]);
        System.out.printf("%d > %d --> %b\n", arr[2], arr[3], arr[2] > arr[3]);
    }
}
