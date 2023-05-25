package com.example._003_0419.week4.day16;

public abstract class ShapeDrawer {
    public void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }

    // 추상클래스
    public abstract String makeALine(int h, int i);

}
