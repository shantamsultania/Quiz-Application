package com.example.quiz_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button true_btn,flase_btn,next_btn;
    private TextView show_questions;
    private int counter=0;
    private Questions[] questions= new Questions[]
            {

              new Questions(R.string.question1,true),
                    new Questions(R.string.question1,false),
                    new Questions(R.string.question2,true),
                    new Questions(R.string.question3,false),
                    new Questions(R.string.question4,false),
                    new Questions(R.string.question5,true),
                    new Questions(R.string.question6,false),
                    new Questions(R.string.question7,true),
                    new Questions(R.string.question8,false),
                    new Questions(R.string.question9,true),
                    new Questions(R.string.question10,true),
                    new Questions(R.string.question11,true),
                    new Questions(R.string.question12,false),
                    new Questions(R.string.question13,true),
                    new Questions(R.string.question14,true),
                    new Questions(R.string.question15,false)

            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        true_btn = findViewById(R.id.true_btn);
        flase_btn = findViewById(R.id.false_btn);
        next_btn = findViewById(R.id.next_btn);

        true_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        flase_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counter=(counter+1) % questions.length;
                show_questions.setText(questions[counter].getQuestionid());

            }
        });
    }
    public void checkand(boolean choice)
    {
        boolean anss= questions[counter].ans;
        int tostid=0;
        if(choice == anss)
        {
            Toast.makeText(MainActivity.this,"Correct Ans",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(MainActivity.this,"your ans is incorrect",Toast.LENGTH_LONG).show();
        }
    }
}
