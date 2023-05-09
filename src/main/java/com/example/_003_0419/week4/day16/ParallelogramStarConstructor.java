package com.example._003_0419.week4.day16;

public class ParallelogramStarConstructor {
    private String spcaeChar = "0";

    public ParallelogramStarConstructor(String spcaeChar) {
        this.spcaeChar = spcaeChar;
    }

    public String makeALine(int h, int i) {
        return String.format("%s%s\n", spcaeChar.repeat(i), "*".repeat(h));
    }
    public static void main(String[] args) {
        ParallelogramStarConstructor parallelogramStarConstructor = new ParallelogramStarConstructor("0");
        int h = 4;
        for (int i = 0; i < h; i++) {
            System.out.print(parallelogramStarConstructor.makeALine(h, i));
        }
    }
}
