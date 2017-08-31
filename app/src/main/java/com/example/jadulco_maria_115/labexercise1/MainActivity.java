package com.example.jadulco_maria_115.labexercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_Quiz1;
    EditText et_Quiz2;
    EditText et_seatWorks;
    EditText et_LabEx;
    EditText et_MajorExam;
    Button btn_Compute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Quiz1 = (EditText) findViewById(R.id.quiz1);
        et_Quiz2 = (EditText) findViewById(R.id.quiz2);
        et_seatWorks = (EditText) findViewById(R.id.seatWorks);
        et_LabEx = (EditText) findViewById(R.id.labEx);
        et_MajorExam = (EditText) findViewById(R.id.majorExam);
        btn_Compute = (Button) findViewById(R.id.btnCompute);

    }

    protected void computeForGrade(View view) {
        String quiz1= et_Quiz1.getText().toString();
        double finalQuiz1=Double.parseDouble(quiz1);

        String quiz2= et_Quiz2.getText().toString();
        double finalQuiz2=Double.parseDouble(quiz2);

        String sw = et_seatWorks.getText().toString();
        double finalSW=Double.parseDouble(sw);

        String le = et_LabEx.getText().toString();
        double finalLE=Double.parseDouble(le);

        String me = et_MajorExam.getText().toString();
        double finalME=Double.parseDouble(me);

        double RA = (0.10 * finalQuiz1) + (0.10 * finalQuiz2) + (0.10 * finalSW) + (0.40 * finalLE) + (0.30 * finalME);


        String finalRA = Double.toString(RA);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("arey", finalRA);
        startActivity(intent);




    }
}
