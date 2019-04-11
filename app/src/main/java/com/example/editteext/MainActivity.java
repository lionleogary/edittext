package com.example.editteext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setBackgroundDrawableResource(R.drawable.jj);
    }
    int size=30;
    public void response(View v){
        EditText ed1,ed2,ed3;
        TextView txv;

        ed1=findViewById(R.id.editText);
        ed2=findViewById(R.id.editText2);
        ed3=findViewById(R.id.editText3);
        txv=findViewById(R.id.textview);
        txv.setTextSize(size);
        txv.setText(ed1.getText().toString()+",您好\n"+"您的BMI是:");

        float height=Float.parseFloat(ed2.getText().toString());
        float weight=Float.parseFloat(ed3.getText().toString());



    }
    private float calculateBMI(float ht ,float wt){
        float BBMI=(float)(wt/Math.pow((ht/100),2));
        return BBMI;
    }
}
