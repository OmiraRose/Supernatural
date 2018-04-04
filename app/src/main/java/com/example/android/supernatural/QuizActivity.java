package com.example.android.supernatural;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {



    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    private ImageView mBannerView;
    private TextView mQuestionView;
    private RadioButton mRadioButtonA;
    private RadioButton mRadioButtonB;
    private RadioButton mRadioButtonC;
    private RadioButton mRadioButtonD;
    private TextView mScoreView;
    private Button mFinish;
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);



        mBannerView = findViewById(R.id.banner);
        mQuestionView = findViewById(R.id.questions);
        mRadioButtonA = findViewById(R.id.optionA);
        mRadioButtonB = findViewById(R.id.optionB);
        mRadioButtonC = findViewById(R.id.optionC);
        mRadioButtonD = findViewById(R.id.optionD);
        mFinish = findViewById(R.id.finish);
        mScoreView = findViewById(R.id.Score);




        updateQuestion();


        mRadioButtonA.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if (mRadioButtonA.getText() == mAnswer) {
                    mScore++;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Awesome!", Toast.LENGTH_SHORT).show();
                } else {
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Balls!", Toast.LENGTH_SHORT).show();
                }
            }

        });

        mRadioButtonB.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if (mRadioButtonB.getText() == mAnswer) {
                    mScore++;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "I'm Batman!", Toast.LENGTH_SHORT).show();
                } else {
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Hey, AssButt!", Toast.LENGTH_SHORT).show();
                }
            }

        });
        mRadioButtonC.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if (mRadioButtonC.getText() == mAnswer) {
                    mScore++;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Driver picks the music, Shotgun shuts his cakehole.", Toast.LENGTH_SHORT).show();
                } else {
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Idjit!", Toast.LENGTH_SHORT).show();
                }
            }

        });
        mRadioButtonD.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if (mRadioButtonD.getText() == mAnswer) {
                    mScore++;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Hello darling", Toast.LENGTH_SHORT).show();
                } else {
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "I lost my shoe", Toast.LENGTH_SHORT).show();
                }
            }

        });


    }


    public void updateQuestion() {
        if(mQuestionNumber <9) {
            mRadioButtonA.setChecked(false);
            mRadioButtonB.setChecked(false);
            mRadioButtonC.setChecked(false);
            mRadioButtonD.setChecked(false);
            mQuestionView.setText(mQuestionLibrary.getQuestions(mQuestionNumber));
            mRadioButtonA.setText(mQuestionLibrary.getAnswerA(mQuestionNumber));
            mRadioButtonB.setText(mQuestionLibrary.getAnswerB(mQuestionNumber));
            mRadioButtonC.setText(mQuestionLibrary.getAnswerC(mQuestionNumber));
            mRadioButtonD.setText(mQuestionLibrary.getAnswerD(mQuestionNumber));
            mBannerView.setImageResource(mQuestionLibrary.getimages(mQuestionNumber));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mScoreView.setVisibility(View.GONE);
            mFinish.setVisibility(View.GONE);
            mQuestionNumber++;

        }else{
            mRadioButtonA.setChecked(false);
            mRadioButtonB.setChecked(false);
            mRadioButtonC.setChecked(false);
            mRadioButtonD.setChecked(false);
            mQuestionView.setText(mQuestionLibrary.getQuestions(mQuestionNumber));
            mRadioButtonA.setText(mQuestionLibrary.getAnswerA(mQuestionNumber));
            mRadioButtonB.setText(mQuestionLibrary.getAnswerB(mQuestionNumber));
            mRadioButtonC.setText(mQuestionLibrary.getAnswerC(mQuestionNumber));
            mRadioButtonD.setText(mQuestionLibrary.getAnswerD(mQuestionNumber));
            mBannerView.setImageResource(mQuestionLibrary.getimages(mQuestionNumber));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mFinish.setVisibility(View.VISIBLE);
            mScoreView.setVisibility(View.GONE);
            mFinish.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent resultsIntent = new Intent(QuizActivity.this, ResultsActivity.class);
                    resultsIntent.putExtra("finalScore",mScore);
                    startActivity(resultsIntent);
                }
            });
        }
    }

    private void updateScore(int point) {
        mScoreView.setText("" + mScore);

    }



}

