package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzGameTest {

    private FizzBuzzGame fizzBuzzGame;

    @Before
    public void setUp() throws Exception {
        fizzBuzzGame = new FizzBuzzGame();
    }

    @Test
    public void should_return_boolen_when_inputNumber() {
        assertTrue(fizzBuzzGame.setNumber(1, 2, 3));
        assertTrue(!fizzBuzzGame.setNumber(0, 2, 3));
        assertTrue(!fizzBuzzGame.setNumber(-5, 1, 3));
        assertTrue(!fizzBuzzGame.setNumber(2, 1, 10));
        assertTrue(!fizzBuzzGame.setNumber(2, 2, 1));
    }

    @Test
    public void should_return_Fizz_when_have_3() {
        String expect = "Fizz";
        String actual = fizzBuzzGame.getAnswer(3);
        assertEquals(expect, actual);
    }

    @Test
    public void should_return_Buzz_when_have_5() {
        String expect = "Buzz";
        String actual = fizzBuzzGame.getAnswer(5);
        assertEquals(expect, actual);
    }

    @Test
    public void should_return_Whizz_when_have_7() {
        String expect = "Whizz";
        String actual = fizzBuzzGame.getAnswer(7);
        assertEquals(expect, actual);
    }

    @Test
    public void should_return_Fizz_when_have_3_times() {
        String expect = "Fizz";
        String actual = fizzBuzzGame.getAnswer(6);
        assertEquals(expect, actual);
    }

    @Test
    public void should_return_Buzz_when_have_5_times() {
        String expect = "Buzz";
        String actual = fizzBuzzGame.getAnswer(10);
        assertEquals(expect, actual);
    }

    @Test
    public void should_return_Whizz_when_have_7_times() {
        String expect = "Whizz";
        String actual = fizzBuzzGame.getAnswer(14);
        assertEquals(expect, actual);
    }

    @Test
    public void should_return_FizzBuzz_when_have_15() {
        String expect = "FizzBuzz";
        String actual = fizzBuzzGame.getAnswer(15);
        assertEquals(expect, actual);
    }

    @Test
    public void should_return_FizzWhizz_when_have_21() {
        String expect = "FizzWhizz";
        String actual = fizzBuzzGame.getAnswer(21);
        assertEquals(expect, actual);
    }

    @Test
    public void should_return_BuzzWhizz_when_have_35() {
        String expect = "BuzzWhizz";
        String actual = fizzBuzzGame.getAnswer(35);
        assertEquals(expect, actual);
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_have_105() {
        String expect = "FizzBuzzWhizz";
        String actual = fizzBuzzGame.getAnswer(105);
        assertEquals(expect, actual);
    }
}
