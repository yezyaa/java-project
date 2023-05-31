package com.example._003_0419.tutoopjdbc.opgame.test;

import com.example._003_0419.tutoopjdbc.opgame.service.OpGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * @author yezy
 * 1. 덧셈
 * 2. 기회 3회
 * 3. 격려
 * 4. 결과는 10 이하
 */

public class GameTest {
    @Test
    public void test() {
        OpGame game = new OpGame();
        game.makeQuestion();
        String question = game.getQuestion();

        assertEquals("1 + 1 = ", question);
        assertEquals(3, game.getRemainingAnswers());
        assertEquals(false, game.isAnswer(3));
        assertEquals(2, game.getRemainingAnswers());
        assertEquals("한번 더 해보자", game.getRemainingAnswers());
        assertEquals(true, game.isAnswer(2));
    }
}
