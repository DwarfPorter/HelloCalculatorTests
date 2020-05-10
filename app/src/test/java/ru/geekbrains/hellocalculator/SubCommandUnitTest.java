package ru.geekbrains.hellocalculator;

import org.junit.Test;

public class SubCommandUnitTest {

    @Test(expected = Test.None.class)
    public void constructor_isCorrect(){
        SubCommand underTest = new SubCommand(.0, .0);
    }
}
