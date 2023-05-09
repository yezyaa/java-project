package com.example._003_0419.week4.day16;

public class PyramidStarReverseConstructor {
    private String spaceChar = "0";

    public PyramidStarReverseConstructor(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public String makeAline(int h, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(2 * (h - i) - 1));
    }

    public static void main(String[] args) {
        PyramidStarReverseConstructor pyramidStarReverseConstructor = new PyramidStarReverseConstructor(" ");
        int h = 5;
        for (int i = 0; i < h; i++) {
            System.out.print(pyramidStarReverseConstructor.makeAline(h, i));
        }
    }
}
