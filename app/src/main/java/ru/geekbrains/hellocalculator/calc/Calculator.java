package ru.geekbrains.hellocalculator.calc;

public class Calculator {
    private double result;
    private double arg2;

    public Calculator setArgument(double arg2){
        this.arg2 = arg2;
        return this;
    }

    public Calculator executeCommand(ICommand command) {
        if (command == null){
            throw new IllegalArgumentException("command");
        }
        result = command.execute(arg2);
        return this;
    }

    public double getResult() {
        return result;
    }
}
