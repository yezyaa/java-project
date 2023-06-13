package com.example._003_0419.algorithm.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// Reverse Polish Notation -> Postfix Notation
public class PostfixCalculation {
    public void solution() throws IOException {
        // 입력 처리
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        Stack<Integer> digitStack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char token = input.charAt(i);

            // TODO 1. 숫자라면, 스택에 push한다.
            // TODO Character.isDigit(token) // token이 숫자가 표현된 글자인지 판단하는 메소드
            if (Character.isDigit(token)) {
                // 숫자니까 변환 후 push
                digitStack.push(Character.digit(token, 10));
                // token을 int로 변환 => token - '0'
            }
            // TODO 2. 숫자가 아니라면, (연산자) 스택에서 두 번 pop하고 계산한다.
            else if (!Character.isDigit(token)) {
                int numRight = digitStack.pop();
                int numLeft = digitStack.pop();
                switch (token) {
                    case '+':
                        digitStack.push(numLeft + numRight);
                        break;
                    case '-':
                        digitStack.push(numLeft - numRight);
                        break;
                    case '*':
                        digitStack.push(numLeft * numRight);
                        break;
                    case '/':
                        digitStack.push(numLeft / numRight);
                        break;
                    default:
                        throw new IllegalArgumentException("invalid operator");
                }
            }
        }
        int answer = digitStack.pop();
        if (digitStack.empty()) {
            System.out.println("answer = " + answer);
        } else {
            System.out.println("error");
        }

    }

    public static void main(String[] args) throws IOException {
        new PostfixCalculation().solution();
    }
}
