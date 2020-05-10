package ru.geekbrains.hellocalculator;

import org.junit.Test;

import ru.geekbrains.hellocalculator.calc.Calculator;
import ru.geekbrains.hellocalculator.calc.ICommand;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CalculatorUnitTest {

    @Test(expected = Test.None.class)
    public void constructor_isCorrect() {
        Calculator underTest = new Calculator();
    }

    @Test
    public void executeCommand_isCorrect(){
        Calculator underTest = new Calculator();
        ICommand command = mock(ICommand.class);
        when(command.execute()).thenReturn(42.0);
        underTest.executeCommand(command);
        verify(command).execute();
        assertEquals(42.0, underTest.getResult(), 0);
    }
}