package com.example._003_0419.codeUp;

import java.util.Scanner;

public class Codeup1671 {
    // win, tie, lose
    public String play(int user, int comp) {
        if (user == 0 && comp == 1) {
            // user win
            return "win";
        } else if (user == 1 && comp == 2) {
            // user win
            return "win";
        } else if (user == 2 && comp == 0) {
            // user win
            return "win";
        } else if (user == comp) {
            // tie
            return "tie";
        } else {
            return "lose";
        }
    }
    // 가위바위보 게임
    public static void main(String[] args) {
        // 0바위 1가위 2보
        Scanner sc = new Scanner(System.in);
        Codeup1671 rpc = new Codeup1671();
        //System.out.println(rpc.play(0, 1)); // win
        //System.out.println(rpc.play(2, 2)); // tie
        //System.out.println(rpc.play(2, 1)); // lose
        System.out.println(rpc.play(sc.nextInt(), sc.nextInt()));
    }
}
