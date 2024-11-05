package com.ubl.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText number1, number2;
    Button btnPlus, btnMinus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.txtNumber1);
        number2 = findViewById(R.id.txtNumber2);
        btnPlus = findViewById(R.id.btnPlus);
    }

    public void handlePlusButton(View v){
        Integer number1Value = Integer.parseInt(number1.getText().toString());
        Integer number2Value = Integer.parseInt(number2.getText().toString());

        Integer result = number1Value + number2Value;
        Log.d("result", result.toString());

        Intent resultIntent = new Intent(MainActivity.this, ResultActivity.class);
        resultIntent.putExtra("plusResult", result.toString());
        startActivity(resultIntent);



    }
}