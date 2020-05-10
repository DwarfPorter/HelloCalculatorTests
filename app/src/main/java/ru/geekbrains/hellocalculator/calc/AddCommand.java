package ru.geekbrains.hellocalculator.calc;

public class AddCommand implements ICommand {

    private final double arg1;
    private final double arg2;

    public AddCommand(double arg1, double arg2){
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    @Override
    public double execute() {
        return 0;
    }
}