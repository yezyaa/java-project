package com.example._003_0419.week4.day18;

public class User {
    private String name;
    private String phoneNumber; // 01012345678 -> int로하면 맨 앞에 0이 없어짐
    private String password;
    private int age;

    // Construct(생성자) 만들기
    public User(String name, String phoneNumber, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    // getter 만들기
    public String getPassword() {
        // 접근제어 로직
        return password;
    }
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    // setter 만들기
    public void setPassword(String password) {
        // 본인 확인 로직
        this.password = password;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    boolean isAdult() {
        return age >= 18;
    }
}
