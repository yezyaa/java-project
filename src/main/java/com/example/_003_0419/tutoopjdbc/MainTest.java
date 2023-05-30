package com.example._003_0419.tutoopjdbc;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @org.junit.jupiter.api.Test
    void checkLeapYear() {
        //Main.checkLeapYear(1700);
        assertEquals(false, Main.checkLeapYear(1700));
    }

    @org.junit.jupiter.api.Test
    void testLeapYear() {
        assertEquals(true, Main.isLeapYear(2020));
        assertEquals(false, Main.isLeapYear(1900));
        assertEquals(true, Main.isLeapYear(2400));
    }

    @org.junit.jupiter.api.Test
    void testis369() {
        assertEquals("*", Main.is369(3));
        assertEquals("", Main.is369(15));
        assertEquals("**", Main.is369(33));
        assertEquals("***", Main.is369(333));
    }
}