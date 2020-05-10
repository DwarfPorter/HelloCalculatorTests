package ru.geekbrains.hellocalculator.calc;

public class Calculator {
    public void executeCommand(ICommand command) {
        command.execute();
    }
}
