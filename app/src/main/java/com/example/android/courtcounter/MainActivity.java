package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //FUNCTIONAL CODE FOR TEAM A

    public void plus_Three(View view)
    {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }

    public void plus_Two(View view)
    {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }

    public void free(View view)
    {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    //FUNCTIONAL CODE FOR TEAM B

    public void plus_Three_B(View view)
    {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }

    public void plus_Two_B(View view)
    {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }

    public void free_B(View view)
    {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    //CODE FOR RESET

    public void reset(View view)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
