package com.sd.saki.myorm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button save;
    String name;
    String phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        save = (Button) findViewById(R.id.saveButton);
        save.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                EditText etname = (EditText) findViewById(R.id.name);
                name = etname.toString();

                EditText etphone = (EditText) findViewById(R.id.phone);
                phone = etphone.toString();


                Contact cnc = new Contact( name, phone );
                cnc.save();

            }
        }
        );
    }




}
