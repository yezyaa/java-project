package com.example._003_0419.week4.day15;

public class MutsaMath {
    // 약수의 합을 리턴하는 메소드
    int sumOfFactors(int num) {
        // num % i == 0 이면 약수
        // 12 --> 1 2 3 4 6 12 = 28
        int answer = 1;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    void printResult(int num) {
        System.out.printf("%d의 약수의 합은 %d입니다.\n", num, sumOfFactors(num));
    }

    public static void main(String[] args) {
        MutsaMath mutsaMath = new MutsaMath();
        mutsaMath.printResult(12);
        mutsaMath.printResult(36);
        mutsaMath.printResult(48);
        mutsaMath.printResult(29);
    }
}
