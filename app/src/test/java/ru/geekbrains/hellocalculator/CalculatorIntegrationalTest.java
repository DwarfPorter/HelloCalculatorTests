package ru.geekbrains.hellocalculator;

import org.junit.Test;

import ru.geekbrains.hellocalculator.calc.*;

import static org.junit.Assert.assertEquals;

public class CalculatorIntegrationalTest {

    @Test
    public void addCommand_isCorrect(){
        Calculator underTest = new Calculator();
        AddCommand addCommand = new AddCommand(1., 1.);
        underTest.executeCommand(addCommand);
        assertEquals(2., underTest.getResult(), 0);
    }

    @Test
    public void subCommand_isCorrect(){
        Calculator underTest = new Calculator();
        SubCommand subCommand = new SubCommand(1., 1.);
        underTest.executeCommand(subCommand);
        assertEquals(0., underTest.getResult(), 0);
    }

    @Test
    public void mulCommand_isCorrect(){
        Calculator underTest = new Calculator();
        MulCommand mulCommand = new MulCommand(1., 0.);
        underTest.executeCommand(mulCommand);
        assertEquals(0., underTest.getResult(), 0);
    }

    @Test
    public void divCommand_isCorrect(){
        Calculator underTest = new Calculator();
        DivCommand divCommand = new DivCommand(1., 1.);
        underTest.executeCommand(divCommand);
        assertEquals(1., underTest.getResult(), 0);
    }
}
