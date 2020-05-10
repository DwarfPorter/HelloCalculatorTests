package ru.geekbrains.hellocalculator;

import org.junit.Test;

import ru.geekbrains.hellocalculator.calc.AddCommand;

import static org.junit.Assert.*;

public class AddCommandUnitTest {

    @Test(expected = Test.None.class)
    public void constructor_isCorrect(){
        AddCommand underTest = new AddCommand(.0);
    }

    @Test
    public void execute_isCorrect(){
        AddCommand underTest = new AddCommand(2.);
        assertEquals(4., underTest.execute(2.), 0);
    }

}
