package com.example._003_0419.week1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderEx {
    public void readAline() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is); // 카트 가지고 오기

        String line = br.readLine();
        System.out.println("line1 = " + br.readLine());
        System.out.println("line2 = " + br.readLine());
    }
}
