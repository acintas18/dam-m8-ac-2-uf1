/**
 * UF1 - Activitat 2
 * Hello world!
 * Vincular → Xml amb el JAVA
 * Button → Canviar text a Hola món!
 *
 * @author Alex Cintas
 *
 * @version 1.0 30/09/2019
 *
 */

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Button b = findViewById(R.id.button);
        b.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {


                TextView text=(TextView)findViewById(R.id.textview);



                if (text.getText()=="Hello World!"){

                    text.setText("Hola mundo!");

                }  else {

                    text.setText("Hello World!");
                }

            }
        });


    }


}
