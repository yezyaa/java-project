package com.example._003_0419.week4.day16;

public class PyramidStarConstructor {
    private  String spaceChar = "0";

    public PyramidStarConstructor(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public void printPyramid(int height) {
        for (int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
        }
    }

    public static void main(String[] args) {
        PyramidStarConstructor pyramidStarConstructor = new PyramidStarConstructor(" "); // argument " "를 넘겨서 초기화
        PyramidStarConstructor pyramidSpaceZero = new PyramidStarConstructor("0"); // argument "0"을 넘겨서 초기화
        pyramidStarConstructor.printPyramid(4);
        pyramidSpaceZero.printPyramid(5);
    }
}
