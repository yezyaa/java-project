package com.example._003_0419.week2.day6;

public class FloatNumParse {
    public static void main(String[] args) {
        String val1 = "1.5";
        String val2 = "2.5";
        System.out.println(val1 + val2); // 1.52.5

        // int result = Integer.parseInt(val1) + Integer.parseInt(val2); // Error 소수점이 들어있기 때문에 Integer로 Parsing 안됨
        float result = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println("result = " + result);
    }
}
