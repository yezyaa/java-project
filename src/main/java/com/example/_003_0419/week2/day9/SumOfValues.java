package com.example._003_0419.week2.day9;

public class SumOfValues {
    public static void main(String[] args) {
        int answer1 = 0;
        int answer2 = 0;
        
        // 하나씩 출력해서 더는 법
        System.out.printf("[첫 번째 방법] 하나씩 출력해서 더하기\n");
        int[] arr = {2, 1, 7, 4};
        System.out.printf("arr값: %d %d %d %d\n", arr[0], arr[1], arr[2], arr[3]);
        System.out.printf("arr합: %d\n\n", arr[0] + arr[1] + arr[2] + arr[3]);

        // 누적하는 방법
        System.out.printf("[두 번째 방법] 누적해서 더하기\n");
        System.out.printf("arr값: %d %d %d %d\n", arr[0], arr[1], arr[2], arr[3]);
        System.out.printf("arr누적: ");
        System.out.printf("%d ", answer1 = answer1 + arr[0]);
        System.out.printf("%d ", answer1 = answer1 + arr[1]);
        System.out.printf("%d ", answer1 = answer1 + arr[2]);
        System.out.printf("%d\n\n", answer1 = answer1 + arr[3]);

        // arr 길이 출력하는 방법
        System.out.printf("[세 번째 방법] arr.length 사용해서 더하기\n");
        System.out.printf("arr길이: %d\n", arr.length);
        System.out.printf("arr값: ");
        for (int i = 0; i < arr.length; i++) {
            answer2 = answer2 + arr[i];
            System.out.printf("%d ", arr[i]);
        }
        System.out.printf("\narr합: %d\n", answer2);
    }
}
