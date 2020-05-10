package ru.geekbrains.hellocalculator;

import org.junit.Test;

import ru.geekbrains.hellocalculator.calc.AddCommand;
import ru.geekbrains.hellocalculator.calc.Calculator;

import static org.junit.Assert.assertEquals;

public class CalculatorIntegrationalTest {

    @Test
    public void addCommand_isCorrect(){
        Calculator underTest = new Calculator();
        AddCommand addCommand = new AddCommand(1., 1.);
        underTest.executeCommand(addCommand);
        assertEquals(2., underTest.getResult(), 0);
    }

}
