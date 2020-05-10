package ru.geekbrains.hellocalculator;

import org.junit.Test;

import ru.geekbrains.hellocalculator.calc.DivCommand;
import ru.geekbrains.hellocalculator.calc.MulCommand;

import static org.junit.Assert.assertEquals;

public class DivCommandUnitTest {

    @Test(expected = Test.None.class)
    public void constructor_isCorrect(){
        DivCommand underTest = new DivCommand(.1, .1);
    }

    @Test
    public void execute_isCorrect(){
        DivCommand underTest = new DivCommand(15., 3.);
        assertEquals(5., underTest.execute(), 0);
    }
}
