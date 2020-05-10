package ru.geekbrains.hellocalculator;

import org.junit.Test;

import ru.geekbrains.hellocalculator.calc.ICommand;

public class AddCommandUnitTest {

    @Test(expected = Test.None.class)
    public void constructor_isCorrect(){
        AddCommand underTest = new AddCommand(.0, .0);
    }

}
