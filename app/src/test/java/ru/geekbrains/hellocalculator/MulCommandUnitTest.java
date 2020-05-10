package ru.geekbrains.hellocalculator;

import org.junit.Test;

import ru.geekbrains.hellocalculator.calc.MulCommand;

import static org.junit.Assert.assertEquals;

public class MulCommandUnitTest {

    @Test(expected = Test.None.class)
    public void constructor_isCorrect(){
        MulCommand underTest = new MulCommand(.0, .0);
    }

    @Test
    public void execute_isCorrect(){
        MulCommand underTest = new MulCommand(3., 3.);
        assertEquals(9., underTest.execute(), 0);
    }
}
