package com.example.conversionofipaddresstobinary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         final int[] firstValueOfIP = new int[1];
         final int[] secondValueOfIP = new int[1];
         final int[] thirdValueOfIP = new int[1];
         final int[] fourthValueOfIP = new int[1];
         int[] defaultValues = {128, 64, 32, 16, 8, 4, 2, 1};
         final int[] temp = new int[1];
         final int[] binaryConvertedValue = new int[7];

        EditText firstValTextView = (EditText) findViewById(R.id.value1);
//        EditText secondValTextView = (EditText) findViewById(R.id.value2);
//        EditText thirdValTextView = (EditText) findViewById(R.id.value3);
//        EditText fourthValTextView = (EditText) findViewById(R.id.value4);
//        firstValTextView = Integer.parseInt(firstValTextView);
//        secondValTextView = Integer.parseInt(secondValTextView);
//        thirdValTextView = Integer.parseInt(thirdValTextView);
//        fourthValTextView = Integer.parseInt(fourthValTextView);
        Button btn = (Button) findViewById(R.id.btn);
        TextView result1 = (TextView) findViewById(R.id.resultFor1);


        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                firstValueOfIP[0] = Integer.parseInt((String) firstValTextView.getText().toString());

                int firstvalue = Integer.parseInt(String.valueOf(firstValueOfIP[0]));
                if (firstvalue < defaultValues[0])
                {
                    temp[0] = firstValueOfIP[0]-defaultValues[0];
                    binaryConvertedValue[0] = 1;
                }
                else if (firstvalue < defaultValues[1])
                {
                    binaryConvertedValue[0] = 0;
                    temp[0] = firstValueOfIP[0]-defaultValues[1];
                    binaryConvertedValue[1] = 1;
                } else if(firstvalue < defaultValues[2])
                {
                    binaryConvertedValue[1] = 0;
                    temp[0] = firstValueOfIP[0]-defaultValues[2];
                    binaryConvertedValue[2] = 1;
                }
                else if(firstvalue < defaultValues[3])
                {
                    binaryConvertedValue[2] = 0;
                    temp[0] = firstValueOfIP[0]-defaultValues[3];
                    binaryConvertedValue[3] = 1;
                }
                else if(firstvalue < defaultValues[4])
                {
                    binaryConvertedValue[3] = 0;
                    temp[0] = firstValueOfIP[0]-defaultValues[4];
                    binaryConvertedValue[4] = 1;
                }
                else if(firstvalue < defaultValues[5])
                {
                    binaryConvertedValue[4] = 0;
                    temp[0] = firstValueOfIP[0]-defaultValues[5];
                    binaryConvertedValue[5] = 1;
                }
                else if(firstvalue < defaultValues[6])
                {
                    binaryConvertedValue[5] = 0;
                    temp[0] = firstValueOfIP[0]-defaultValues[6];
                    binaryConvertedValue[6] = 1;
                }else if(firstvalue < defaultValues[7])
                {
                    binaryConvertedValue[6] = 0;
                    temp[0] = firstValueOfIP[0]-defaultValues[7];
                    binaryConvertedValue[7] = 1;
                }


                //// Display result of First Value of IP address

                for (int j : binaryConvertedValue) {
                    result1.setText(j);
                }



//                secondValueOfIP[0] = Integer.parseInt((String) secondValTextView.getText());
//                thirdValueOfIP[0] = Integer.parseInt((String) thirdValTextView.getText());
//                fourthValueOfIP[0] = Integer.parseInt((String) fourthValTextView.getText());
            }
        });

    }
}