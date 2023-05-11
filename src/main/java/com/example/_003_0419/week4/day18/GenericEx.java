package com.example._003_0419.week4.day18;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {
        // 문자형
        List<String> strList = new ArrayList<>();
        strList.add("hello");
        strList.add("bye");
        strList.add("1"); // 숫자 넣고 싶으면 문자열로 넣어야 함

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        for (String item : strList
             ) {
            System.out.println(strList);
        }

        for (Integer item : intList
             ) {
            System.out.println(intList);
        }
    }
}
