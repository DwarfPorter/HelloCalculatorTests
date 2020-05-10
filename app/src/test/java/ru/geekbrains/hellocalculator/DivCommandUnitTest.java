package ru.geekbrains.hellocalculator;

import org.junit.Test;

import ru.geekbrains.hellocalculator.calc.MulCommand;

public class DivCommandUnitTest {

    @Test(expected = Test.None.class)
    public void constructor_isCorrect(){
        DivCommand underTest = new DivCommand(.1, .1);
    }
}
