package com.example._003_0419.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.name = "이예지";
        user.phoneNumber = "010-0000-1111";
        user.age = 20;

        User jaesung = new User();
        jaesung.name = "재성 매니저";
        jaesung.phoneNumber = "010-1234-5678";
        jaesung.age = 21;

        System.out.printf("%s님은 성인입니까? %s\n", user.name, user.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", jaesung.name, jaesung.isAdult());
    }
}
