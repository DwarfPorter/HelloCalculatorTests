package ru.geekbrains.hellocalculator.calc;

public class Calculator {
    private double result;

    public void executeCommand(ICommand command) {
        if (command == null){
            throw new IllegalArgumentException("command");
        }
        result = command.execute();
    }

    public double getResult() {
        return result;
    }
}
