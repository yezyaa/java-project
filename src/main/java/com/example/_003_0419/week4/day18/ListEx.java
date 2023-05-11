package com.example._003_0419.week4.day18;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("Hello");
        l1.add(1);
        System.out.println(l1.get(0)); // Hello
        System.out.println(l1.get(1)); // 1
        System.out.println(l1.size()); // 2
        System.out.println(l1.isEmpty()); // false
        l1.remove(0);
        l1.remove(0);
        System.out.println(l1.isEmpty()); // true
    }
}
