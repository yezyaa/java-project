package com.example._003_0419.week4.day15;

public class User {
    String name;
    String phoneNumber; // 01012342345 하면 앞에 0이 짤림
    int age;

    boolean isAdult() {
        return age >= 18;
    }
}
