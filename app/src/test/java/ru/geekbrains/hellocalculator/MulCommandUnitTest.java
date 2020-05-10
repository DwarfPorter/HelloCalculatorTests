package ru.geekbrains.hellocalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MulCommandUnitTest {

    @Test(expected = Test.None.class)
    public void constructor_isCorrect(){
        MulCommand underTest = new MulCommand(.0, .0);
    }
}
