package ru.geekbrains.hellocalculator;

import org.junit.Test;

import static org.junit.Assert.*;

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
}