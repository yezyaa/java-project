package com.example._003_0419.tutoopjdbc.opgame.service;

public class PlusOperatorLevelOne implements IOperator{
    int a, b;

    @Override
    public void setA(int i) {
        this.a = a;
    }

    @Override
    public void setB(int i) {
        this.b = b;
    }

    @Override
    public void generateQuestion(int max) {
        a = (int)(Math.random() * max);
        b = (int)(Math.random() * (max - a));
    }

    @Override
    public String getQuestionMsg() {
        return String.format("%d + %d = ", a, b);
    }

    @Override
    public boolean isEquals(int answer) {
        return (a + b) == answer;
    }
}
