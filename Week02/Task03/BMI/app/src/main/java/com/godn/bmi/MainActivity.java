package com.godn.bmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView results;
    EditText editWeight, editHeightFt, editHeightIn;
    Button btnCalculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editWeight = findViewById(R.id.editWeight);
        editHeightFt = findViewById(R.id.editHeightFt);
        editHeightIn = findViewById(R.id.editHeightIn);
        results = findViewById(R.id.showResults);
        btnCalculate = findViewById(R.id.button);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int weight = Integer.parseInt(editWeight.getText().toString());
                int heightFt = Integer.parseInt(editHeightFt.getText().toString());
                int heightIn = Integer.parseInt(editHeightIn.getText().toString());

                int totalIn = heightFt*12 + heightIn;

                double totalCM = totalIn*2.53;

                double totalM = totalCM/100;

                double BMI = weight/Math.pow(totalM, 2);

                if(BMI > 25){
                    results.setText("You are Overweight!!!");
                } else if (BMI < 18) {
                    results.setText("You are Underweight!!");
                }else{
                    results.setText("You're Healthy!!");
                }
            }
        });
    }
}