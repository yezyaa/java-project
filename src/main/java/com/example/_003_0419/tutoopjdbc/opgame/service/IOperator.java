package com.example._003_0419.tutoopjdbc.opgame.service;

public interface IOperator {

    void setA(int i);

    void setB(int i);

    void generateQuestion(int max);

    String getQuestionMsg();

    boolean isEquals(int answer);
}
