package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double unm=0,unm_sum=0;
    double un ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        EditText et_num= findViewById(R.id.main_unm);
        Button btn_nextone= findViewById(R.id.main_nextone);
        Button btn_ending= findViewById(R.id.main_ending);
        TextView tv_result= findViewById(R.id.main_result );

        btn_nextone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int c = Integer.parseInt(et_num.getText().toString());
            unm +=c;
            unm_sum +=1;
            un= unm/unm_sum;
            et_num.setText("");

            btn_ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this,"The calculation was done",Toast.LENGTH_SHORT).show();
                    tv_result.setText(unm/unm_sum +"");
                }
            });
            }
        });
    }
}