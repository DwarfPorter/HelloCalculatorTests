package ru.geekbrains.hellocalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;

import java.text.NumberFormat;
import java.util.Objects;

import ru.geekbrains.hellocalculator.calc.*;

public class MainActivity extends AppCompatActivity {

    private final Calculator calculator = new Calculator();
    private ICommand currentCommand;
    private TextInputEditText argument;
    private double firstArgument;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        argument = findViewById(R.id.argument);
        findViewById(R.id.buttonClear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearArgument();
            }
        });
        findViewById(R.id.buttonPlus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCurrentCommand(new AddCommand(getArgument()));
            }
        });
        findViewById(R.id.buttonMinus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCurrentCommand(new SubCommand(getArgument()));
            }
        });
        findViewById(R.id.buttonMultiplication).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCurrentCommand(new MulCommand(getArgument()));
            }
        });
        findViewById(R.id.buttonDivide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCurrentCommand(new DivCommand(getArgument()));
            }
        });
        findViewById(R.id.buttonResult).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                executeCommand();
            }
        });
    }

    private void executeCommand() {
        double result = calculator.setArgument(getArgument())
                .executeCommand(currentCommand).getResult();
        NumberFormat nm = NumberFormat.getNumberInstance();
        argument.setText(nm.format(result));
    }

    private void clearArgument(){
        argument.setText("");
    }

    private void setCurrentCommand(ICommand cmd){
        currentCommand = cmd;
        clearArgument();
    }


    private double getArgument() {
        String text = Objects.requireNonNull(argument.getText()).toString();
        if (!text.isEmpty()){
            try {
                return Double.parseDouble(text);
                // it means it is double
            } catch (Exception e1) {
                // this means it is not double
                e1.printStackTrace();
            }
        }
        return 0.;
    }
}
