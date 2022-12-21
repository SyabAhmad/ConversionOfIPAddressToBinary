package com.example.conversionofipaddresstobinary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] firstValueOfIP = new int[1];
        final int[] secondValueOfIP = new int[1];
        final int[] thirdValueOfIP = new int[1];
        final int[] fourthValueOfIP = new int[1];
        int[] defaultValues = {128, 64, 32, 16, 8, 4, 2, 1};

        TextView firstValTextView = (TextView) findViewById(R.id.value1);
        TextView secondValTextView = (TextView) findViewById(R.id.value2);
        TextView thirdValTextView = (TextView) findViewById(R.id.value3);
        TextView fourthValTextView = (TextView) findViewById(R.id.value4);
        Button btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                firstValueOfIP[0] = Integer.parseInt((String) firstValTextView.getText());

                if (firstValueOfIP[0] < defaultValues[0])
                {

                }

                secondValueOfIP[0] = Integer.parseInt((String) secondValTextView.getText());
                thirdValueOfIP[0] = Integer.parseInt((String) thirdValTextView.getText());
                fourthValueOfIP[0] = Integer.parseInt((String) fourthValTextView.getText());
            }
        });

    }
}