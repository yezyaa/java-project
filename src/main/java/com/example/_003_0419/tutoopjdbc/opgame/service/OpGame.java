package com.example._003_0419.tutoopjdbc.opgame.service;

public class OpGame {
    int remainingAnswers = 3;
    String cheeringUpMSG = "한번 더 해보자";
    IOperator op;

    public OpGame(IOperator op) {
        this.op = op;
    }

    public void makeQuestion() {
        remainingAnswers = 3;
//        a = 1;
//        b = 1;
        op.setA(1);
        op.setB(1);
    }

    public void makeQuestion(int max) {
//        a = (int)(Math.random() * max);
//        b = (int)(Math.random() * (max - a));
        op.generateQuestion(max);
    }

    public String getQuestion() {
//        return String.format("%d + %d = ", a, b);
        return op.getQuestionMsg();
    }

    public int getRemainingAnswers() {
        return remainingAnswers;
    }

    public boolean isAnswer(int answer) {
        remainingAnswers--;
//        return (a + b) == answer;
        return op.isEquals(answer);
    }

    public String getCheeringUpMsg() {
        return cheeringUpMSG;
    }
}
