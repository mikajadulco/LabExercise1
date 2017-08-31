package com.example.jadulco_maria_115.labexercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv_RA;
    TextView tv_FinalGrade;
    Button btn_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv_RA = (TextView) findViewById(R.id.tvRA);
        tv_FinalGrade= (TextView) findViewById(R.id.tvFinalGrade);
        btn_Back = (Button) findViewById(R.id.btnBack);
        String output = getIntent().getStringExtra("arey");
        tv_RA.setText("Your RA is " + output);

    }

    public void goBack(View view) {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}
