package ru.geekbrains.hellocalculator.calc;

public class SubCommand implements ICommand {

    private final double arg1;

    public SubCommand(double arg1){
        this.arg1 = arg1;
    }

    @Override
    public double execute(double arg2) {
        return arg1 - arg2;
    }
}
