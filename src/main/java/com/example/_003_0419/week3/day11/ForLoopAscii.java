package com.example._003_0419.week3.day11;

public class ForLoopAscii {
    public static void main(String[] args) {
        for (int c = 65; c <= 'Z' ; c++) {
            System.out.printf("%d:%c ", c, c);
        }
    }
}
