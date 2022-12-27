package com.example.conversionofipaddresstobinary;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("SetTextI18n")
    void actionToFind(){
        EditText ip0 = (EditText) findViewById(R.id.value);
        int ip0value = Integer.parseInt(String.valueOf(ip0.getText()));
        EditText ip1 = (EditText) findViewById(R.id.value1);
        int ip1value = Integer.parseInt(String.valueOf(ip1.getText()));
        EditText ip2 = (EditText) findViewById(R.id.value2);
        int ip2value = Integer.parseInt(String.valueOf(ip2.getText()));
        EditText ip3 = (EditText) findViewById(R.id.value3);
        int ip3value = Integer.parseInt(String.valueOf(ip3.getText()));


        TextView range1 = (TextView) findViewById(R.id.range);
        TextView class1 = (TextView) findViewById(R.id.classes);


        ///find range and class

        if (ip0value>=1 && ip0value <=127)
        {
            range1.setText("1.0.0.0 to 127.255.255.255");
            class1.setText("Class A");
        }else if (ip0value>=128 && ip0value <=1191)
        {
            range1.setText("128.0.0.0 to 191.255.255.255");
            class1.setText("Class B");
        }
        else if (ip0value>=192 && ip0value <=223)
        {
            range1.setText("192.0.0.0 to 223.255.255.255");
            class1.setText("Class C");
        }
        else if (ip0value>=224 && ip0value <=239)
        {
            range1.setText("224.0.0.0 to 239.255.255.255");
            class1.setText("Class D");
        }
        else if (ip0value>=240 && ip0value <=255)
        {
            range1.setText("240.0.0.0 to 255.255.255.255");
            class1.setText("Class E");
        }

        ///converting to string and binary
        String ConvertedIP0Value = Integer.toBinaryString(ip0value);
        String ConvertedIP1Value = Integer.toBinaryString(ip1value);
        String ConvertedIP2Value = Integer.toBinaryString(ip2value);
        String ConvertedIP3Value = Integer.toBinaryString(ip3value);

        TextView result1 = (TextView) findViewById(R.id.resultFor1);
        TextView result2 = (TextView) findViewById(R.id.resultFor2);
        TextView result3 = (TextView) findViewById(R.id.resultFor3);
        TextView result4 = (TextView) findViewById(R.id.resultFor4);

        /// displaying result
        result1.setText(ConvertedIP0Value);
        result2.setText(ConvertedIP1Value);
        result3.setText(ConvertedIP2Value);
        result4.setText(ConvertedIP3Value);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = (Button) findViewById(R.id.btn1);
        // Convert the IP address to an InetAddress object
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                actionToFind();
            }
        });
    }

}






//    InetAddress address = null;
//        try {
//                address = InetAddress.getByName(String.valueOf(Integer.parseInt(input)));
//                } catch (UnknownHostException e) {
//                e.printStackTrace();
//                }
//
//                // Get the address in byte format
//                byte[] bytes = address.getAddress();
//
//                // Convert each byte to a 8-bit binary string
//                StringBuilder binary = new StringBuilder();
//                for (byte b : bytes) {
//                binary.append(String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'));
//                }
//
//                // Print the binary string
//                System.out.println(binary.toString());


////                else if (finalValue1 < defaultValues[1])
////                {
////                    binaryConvertedValue[0] = 0;
////                    temp[0] = firstValueOfIP[0]-defaultValues[1];
////                    binaryConvertedValue[1] = 1;
////                } else if(finalValue1 < defaultValues[2])
////                {
////                    binaryConvertedValue[1] = 0;
////                    temp[0] = firstValueOfIP[0]-defaultValues[2];
////                    binaryConvertedValue[2] = 1;
////                }
////                else if(finalValue1 < defaultValues[3])
////                {
////                    binaryConvertedValue[2] = 0;
////                    temp[0] = firstValueOfIP[0]-defaultValues[3];
////                    binaryConvertedValue[3] = 1;
////                }
////                else if(finalValue1 < defaultValues[4])
////                {
////                    binaryConvertedValue[3] = 0;
////                    temp[0] = firstValueOfIP[0]-defaultValues[4];
////                    binaryConvertedValue[4] = 1;
////                }
////                else if(finalValue1 < defaultValues[5])
////                {
////                    binaryConvertedValue[4] = 0;
////                    temp[0] = firstValueOfIP[0]-defaultValues[5];
////                    binaryConvertedValue[5] = 1;
////                }
////                else if(finalValue1 < defaultValues[6])
////                {
////                    binaryConvertedValue[5] = 0;
////                    temp[0] = firstValueOfIP[0]-defaultValues[6];
////                    binaryConvertedValue[6] = 1;
////                }else if(finalValue1 < defaultValues[7])
////                {
////                    binaryConvertedValue[6] = 0;
////                    temp[0] = firstValueOfIP[0]-defaultValues[7];
////                    binaryConvertedValue[7] = 1;
////                }
//
//
//                    //// Display result of First Value of IP address
//
//                    result1.setText(binaryConvertedValue[0]);



//                secondValueOfIP[0] = Integer.parseInt((String) secondValTextView.getText());
//                thirdValueOfIP[0] = Integer.parseInt((String) thirdValTextView.getText());
//                fourthValueOfIP[0] = Integer.parseInt((String) fourthValTextView.getText());