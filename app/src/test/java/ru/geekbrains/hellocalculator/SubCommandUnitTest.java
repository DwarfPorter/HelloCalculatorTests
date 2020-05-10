package ru.geekbrains.hellocalculator;

import org.junit.Test;

import ru.geekbrains.hellocalculator.calc.SubCommand;

import static org.junit.Assert.assertEquals;

public class SubCommandUnitTest {

    @Test(expected = Test.None.class)
    public void constructor_isCorrect(){
        SubCommand underTest = new SubCommand(.0, .0);
    }

    @Test
    public void execute_isCorrect(){
        SubCommand underTest = new SubCommand(5., 2.);
        assertEquals(3., underTest.execute(), 0);
    }
}
