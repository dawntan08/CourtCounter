package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }



    // initial req: after click button, score change to 3
    public void scorePlusThree(View view) {
        displayForTeamA(3);
    }

    // initial req: after click button, score change to 2
    public void scorePlusTwo(View view) {
        displayForTeamA(2);
    }

    // initial req: after click button, score change to 1
    public void scorePlusOne(View view) {
        displayForTeamA(1);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
