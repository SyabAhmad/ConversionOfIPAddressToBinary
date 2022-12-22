package com.example.conversionofipaddresstobinary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.net.InetAddress;

import java.net.UnknownHostException;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    int IPaddress;
    public String StringFinalMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView userinput = (TextView) findViewById(R.id.value1);
        TextView result1 = (TextView) findViewById(R.id.resultFor1);

        String input = userinput.toString();
        Button btn = (Button) findViewById(R.id.btn1);
        // Convert the IP address to an InetAddress object
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(String.valueOf(userinput));
                result1.setText(Integer.toBinaryString(val));
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