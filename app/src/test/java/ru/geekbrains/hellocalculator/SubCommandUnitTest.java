package ru.geekbrains.hellocalculator;

import org.junit.Test;

import ru.geekbrains.hellocalculator.calc.SubCommand;

public class SubCommandUnitTest {

    @Test(expected = Test.None.class)
    public void constructor_isCorrect(){
        SubCommand underTest = new SubCommand(.0, .0);
    }
}
