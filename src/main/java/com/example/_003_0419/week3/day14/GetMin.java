package com.example._003_0419.week3.day14;

public class GetMin {
    public static void main(String[] args) {
        int[] arr = {2, 1, 31, 9, 7};

        // 최소값 구하기
        int targetValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            // targetValue < arr[i]일 때 교체
            if (targetValue > arr[i]) {
                targetValue = arr[i];
            }
        }
        System.out.printf("targetValue = %d\n", targetValue);
    }
}
