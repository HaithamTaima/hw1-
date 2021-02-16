package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double sum=0;
    int count =0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et_salare= findViewById(R.id.main_unm);
        Button btn_nextone= findViewById(R.id.main_nextone);
        Button btn_ending= findViewById(R.id.main_ending);
        TextView tv_result= findViewById(R.id.main_result );

        btn_nextone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!et_salare.getText().toString().isEmpty()){


            double salare = Double.parseDouble(et_salare.getText().toString());
            //sum =sum+salare
             sum += salare ;
             et_salare.setText("");
             count++;
             Toast.makeText(getBaseContext(),sum + "",Toast.LENGTH_LONG).show();
             Toast.makeText(getBaseContext(),count + "",Toast.LENGTH_LONG).show();
            }

            btn_ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count != 0 ){
                        tv_result.setText((sum/count) +"");
                    }

                }
            });
            }
        });
    }
}