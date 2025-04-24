
package com.nemirus.calculator;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.nemirus.calculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private EditText input;
    private Button zero, one, two, three, four, five, six, seven, eight, nine;
    private Button plus, minus, times, divide, equal, remove;
    private String inputed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        zero = binding.zero;
        one = binding.one;
        two = binding.two;
        three = binding.three;
        four = binding.four;
        five = binding.five;
        six = binding.six;
        seven = binding.seven;
        eight = binding.eight;
        nine = binding.nine;
        plus = binding.plus;
        minus = binding.minus;
        times = binding.times;
        divide = binding.divide;
        equal = binding.equal;
        remove = binding.remove;
        input = binding.input;
        inputed = "";
        
        one.setOnClickListener(v -> clickedOne());
        two.setOnClickListener(v -> clickedTwo());
        three.setOnClickListener(v -> clickedThree());
        four.setOnClickListener(v -> clickedFour());
        five.setOnClickListener(v -> clickedFive());
        six.setOnClickListener(v -> clickedSix());
        seven.setOnClickListener(v -> clickedSeven());
        eight.setOnClickListener(v -> clickedEight());
        nine.setOnClickListener(v -> clickedNine());
        zero.setOnClickListener(v -> clickedZero());
        plus.setOnClickListener(v -> clickedPlus());
        minus.setOnClickListener(v -> clickedMinus());
        times.setOnClickListener(v -> clickedTimes());
        divide.setOnClickListener(v -> clickedDivide());
        remove.setOnClickListener(v -> clickedRemove());
        equal.setOnClickListener(v -> clickedEqual());
    }
    
    /* String to int: Integer.parseInt(var); String to char = .charAt(pos); */
    
    private void clickedOne() {
        String na = "1";
        inputed = (inputed + na);
        input.setText(inputed);
    }
    
    private void clickedTwo() {
        String nb = "2";
        inputed = (inputed + nb);
        input.setText(inputed);
    }
    
    private void clickedThree() {
        String nc = "3";
        inputed = (inputed + nc);
        input.setText(inputed);
    }
    
    private void clickedFour() {
        String nd = "4";
        inputed = (inputed + nd);
        input.setText(inputed);
    }
    
    private void clickedFive() {
        String ne = "5";
        inputed = (inputed + ne);
        input.setText(inputed);
    }
    
    private void clickedSix() {
        String nf = "6";
        inputed = (inputed + nf);
        input.setText(inputed);
    }
    
    private void clickedSeven() {
        String ng = "7";
        inputed = (inputed + ng);
        input.setText(inputed);
    }
    
    private void clickedEight() {
        String nh = "8";
        inputed = (inputed + nh);
        input.setText(inputed);
    }
    
    private void clickedNine() {
        String ni = "9";
        inputed = (inputed + ni);
        input.setText(inputed);
    }
    
    private void clickedZero() {
        String nj = "0";
        inputed = (inputed + nj);
        input.setText(inputed);
    }
    
    private void clickedPlus() {
        String nk = "+";
        inputed = (inputed + nk);
        input.setText(inputed);
    }
    
    private void clickedMinus() {
        String nl = "-";
        inputed = (inputed + nl);
        input.setText(inputed);
    }
    
    private void clickedTimes() {
        String nm = "×";
        inputed = (inputed + nm);
        input.setText(inputed);
    }
    
    private void clickedDivide() {
        String nn = "÷";
        inputed = (inputed + nn);
        input.setText(inputed);
    }
    
    private void clickedEqual() {
        if(input.getText().toString().contains("+")) {
        int plusIndex = inputed.indexOf('+');
        String beforePlus = inputed.substring(0, plusIndex);
        int na = Integer.parseInt(beforePlus);
        String[] part = inputed.split("\\+");
        String afterPlus = part[1];
        int nb = Integer.parseInt(afterPlus);
        input.setText(String.valueOf(na + nb));
        inputed = input.getText().toString();
        }
        
        else if(input.getText().toString().contains("-")) {
        int plusIndex = inputed.indexOf('-');
        String beforePlus = inputed.substring(0, plusIndex);
        int na = Integer.parseInt(beforePlus);
        String[] part = inputed.split("\\-");
        String afterPlus = part[1];
        int nb = Integer.parseInt(afterPlus);
        input.setText(String.valueOf(na - nb));
        inputed = input.getText().toString();
        }
        
        else if(input.getText().toString().contains("×")) {
        int plusIndex = inputed.indexOf('×');
        String beforePlus = inputed.substring(0, plusIndex);
        int na = Integer.parseInt(beforePlus);
        String[] part = inputed.split("\\×");
        String afterPlus = part[1];
        int nb = Integer.parseInt(afterPlus);
        input.setText(String.valueOf(na * nb));
        inputed = input.getText().toString();
        }
        
        else if(input.getText().toString().contains("÷")) {
        int plusIndex = inputed.indexOf('÷');
        String beforePlus = inputed.substring(0, plusIndex);
        int na = Integer.parseInt(beforePlus);
        String[] part = inputed.split("\\÷");
        String afterPlus = part[1];
        int nb = Integer.parseInt(afterPlus);
        input.setText(String.valueOf(na / nb));
        inputed = input.getText().toString();
        }
        
    }
    
    private void clickedRemove() {
        input.setText("");
        inputed = "";
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }
}
