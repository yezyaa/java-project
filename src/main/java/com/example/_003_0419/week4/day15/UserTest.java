package com.example._003_0419.week4.day15;

import com.example._003_0419.week4.day15.User;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "이예지";
        user1.age = 14;

        User user2 = new User();
        user2.name = "김철수";
        user2.age = 40;

        System.out.printf("%s는 성인입니까? %s\n", user1.name, user1.isAdult());
        System.out.printf("%s는 성인입니까? %s\n", user2.name, user2.isAdult());
    }
}
