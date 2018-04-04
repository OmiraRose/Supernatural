package com.example.android.supernatural;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    int finalScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        TextView resultsMessage = findViewById(R.id.resultsMessage);
        TextView results = findViewById(R.id.results);
        finalScore = getIntent().getIntExtra("finalScore", 0);

        if (finalScore >= 8) {
            resultsMessage.setText(getString(R.string.hunting));
            results.setText(finalScore + getString(R.string.number));
        } else {
            resultsMessage.setText(getString(R.string.carryOn));
            results.setText(finalScore + getString(R.string.number));
        }

        Button resetQuiz = findViewById(R.id.reset);
        resetQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent beginIntent = new Intent(ResultsActivity.this, BeginActivity.class);
                startActivity(beginIntent);
            }
        });

    }

}



