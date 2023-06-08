package com.example._003_0419.algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {36, 12, 18, 15, 41, 19};
        int n = arr.length;

        // 첫 번째 원소와 인접한 원소를 비교,
        // 두 번째 원소와 세 번째 원소를 비교
        // ...
        // N-1 번째 원소와 N 번째 원소를 비교
        for (int i = 0; i < n - 1; i++) { // 반복 횟수를 나타내는 몇 번째 단계인지?
            for (int j = 0; j < n - 1 - i; j++) {
                // 왼쪽 원소가 오른쪽 원소보다 클 경우 교환한다
                if (arr[j] > arr[j + 1]) {
                    // 교환
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
