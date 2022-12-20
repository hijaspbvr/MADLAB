package com.example.customcalc;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.customcalc.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

     Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonAdd,buttonMul,buttonSub,buttonDiv,buttonClear,buttonEqual,button10;
     EditText  E1;
     float value1,value2;
    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.b0);
        button1 = (Button) findViewById(R.id.b1);
        button2 = (Button) findViewById(R.id.b2);
        button3 = (Button) findViewById(R.id.b3);
        button4 = (Button) findViewById(R.id.b4);
        button5 = (Button) findViewById(R.id.b5);
        button6 = (Button) findViewById(R.id.b6);
        button7 = (Button) findViewById(R.id.b7);
        button8 = (Button) findViewById(R.id.b8);
        button9 = (Button) findViewById(R.id.b9);
        button10 = (Button) findViewById(R.id.b10);
        buttonAdd = (Button) findViewById(R.id.add);
        buttonSub = (Button) findViewById(R.id.sub);
        buttonMul = (Button) findViewById(R.id.mul);
        buttonDiv = (Button) findViewById(R.id.div);
        buttonClear = (Button) findViewById(R.id.bc);
        buttonEqual = (Button) findViewById(R.id.eql);
        E1 = (EditText) findViewById(R.id.edt1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E1.setText(E1.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E1.setText(E1.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E1.setText(E1.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E1.setText(E1.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E1.setText(E1.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E1.setText(E1.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E1.setText(E1.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E1.setText(E1.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E1.setText(E1.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E1.setText(E1.getText() + "0");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (E1== null) {
                    E1.setText("");
                } else {
                    value1 = Float.parseFloat(E1.getText() + "");
                    Addition = true;
                    E1.setText(null);
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (E1== null) {
                    E1.setText("");
                } else {
                    value1 = Float.parseFloat(E1.getText() + "");
                    Subtract = true;
                    E1.setText(null);
                }
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (E1== null) {
                    E1.setText("");
                } else {
                    value1 = Float.parseFloat(E1.getText() + "");
                    Division = true;
                    E1.setText(null);
                }
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (E1== null) {
                    E1.setText("");
                } else {
                    value1 = Float.parseFloat(E1.getText() + "");
                    Multiplication = true;
                    E1.setText(null);
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2 = Float.parseFloat(E1.getText() + "");
                if (Addition == true) {
                    E1.setText(value1 + value2 + "");
                    Addition = false;
                }
                if (Subtract == true) {
                    E1.setText(value1 - value2 + "");
                    Subtract = false;
                }
                if (Multiplication == true) {
                    E1.setText(value1 * value2 + "");
                    Multiplication = false;
                }
                if (Division == true) {
                    E1.setText(value1 / value2 + "");
                   Division = false;
                }
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              E1.setText("");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              E1.setText(E1.getText() + ".");
            }
        });


    }
}
