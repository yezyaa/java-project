package com.example._003_0419.week2.day8;

public class ReferenceTypeVariable {
    public static void main(String[] args) {
        // Student 타입
        Student[] students = new Student[2];
        students[0] = new Student(); // new를 써서 Student객체를 인스턴스로, Student 클래스의 초기화
        students[0].name = "김경록"; // Student 클래스 초기화 후 가능
        students[0].phoneNumber = "010-1234-5678";
        students[0].age = 37;
        students[1] = new Student();
        students[1].name = "이예지";
        students[1].phoneNumber = "010-2468-1357";
        students[1].age = 26;

        System.out.println(students[0].name + " " + students[0].phoneNumber + " " + students[0].age);
        System.out.println(students[1].name + " " + students[1].phoneNumber + " " + students[1].age);
    }
}
