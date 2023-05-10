package com.example._003_0419.week4.day17;

import java.io.IOException;

public class HelloPrinter {
    Printer printer;

    public HelloPrinter(Printer printer) {
        this.printer = printer;
    }

    public void repeatMessage(int n, String message) throws IOException {
        for (int i = 0; i < n; i++) {
            printer.print(message);
        }
    }
    public static void main(String[] args) throws IOException {
        HelloPrinter helloPrinter = new HelloPrinter(new ConsolePrinter()); // 인스턴스 생성
        helloPrinter.repeatMessage(5, "Hello"); // 호출
    }
}
