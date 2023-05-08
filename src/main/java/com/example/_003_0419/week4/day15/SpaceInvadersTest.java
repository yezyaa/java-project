package com.example._003_0419.week4.day15;

import com.example._003_0419.week4.day15.SpaceInvaders;

public class SpaceInvadersTest {
    public static void main(String[] args) {
        SpaceInvaders spaceInvaders = new SpaceInvaders();
        spaceInvaders.moveLeft();
        System.out.println(spaceInvaders.location);
        spaceInvaders.moveLeft();
        System.out.println(spaceInvaders.location);
        spaceInvaders.moveLeft();
        System.out.println(spaceInvaders.location);
        spaceInvaders.moveRight();
        System.out.println(spaceInvaders.location);
        spaceInvaders.moveRight();
        System.out.println(spaceInvaders.location);
        spaceInvaders.moveRight();
        System.out.println(spaceInvaders.location);
    }
}
