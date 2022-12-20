package com.example.gopikaanil;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.gopikaanil.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user,pass;
    String u="muhsi";
    String p="123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=(EditText)findViewById(R.id.uname);
        pass=(EditText)findViewById(R.id.pwd);

    }

    public void verify(View v) {
        if (v.getId()==R.id.login){
            String a=user.getText().toString();
            String b=pass.getText().toString();
            if(a.equals(u)&&b.equals(p))
                Toast.makeText(this,"Login Successful",Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this,"invalid",Toast.LENGTH_LONG).show();
        }

    }
}
