package com.example._003_0419.tutoopjdbc.opgame.service;

public class OpGame {
    int remainingAnswers = 3;
    int a, b;

    public void makeQuestion() {
        a = 1;
        b = 1;
    }

    public String getQuestion() {
        return String.format("%d + %d = ", a, b);
    }

    public int getRemainingAnswers() {
        return remainingAnswers;
    }

    public boolean isAnswer(int answer) {
        remainingAnswers--;
        return false;
    }

    public String getCheeringUpMsg() {
        return "한번 더 해보자";
    }
}
