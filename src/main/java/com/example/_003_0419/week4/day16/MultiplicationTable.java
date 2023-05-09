package com.example._003_0419.week4.day16;

public class MultiplicationTable {

    private String multipleSymbol; // x or * 중 어떤 것을 쓸 것인가? -> 멤버변수 선언

    public MultiplicationTable(String multipleSymbol) {
        this.multipleSymbol = multipleSymbol;
    }

    public void printDan(int dan) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", dan, multipleSymbol, i, dan * i);
        }
        System.out.println("----------");
    }

    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable("x");
        mt.printDan(2);
        mt.printDan(4);
        mt.printDan(6);
        MultiplicationTable mt2 = new MultiplicationTable("*");
        mt2.printDan(3);
        mt2.printDan(5);
        mt2.printDan(7);
    }
}
