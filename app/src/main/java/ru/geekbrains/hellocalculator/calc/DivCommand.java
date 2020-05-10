package ru.geekbrains.hellocalculator.calc;

public class DivCommand implements ICommand {

    private final double arg1;

    public DivCommand(double arg1) {
        this.arg1 = arg1;
    }

    @Override
    public double execute(double arg2) {
        if (arg2 == 0){
            throw new IllegalArgumentException("arg2");
        }
        return arg1 / arg2;
    }
}
