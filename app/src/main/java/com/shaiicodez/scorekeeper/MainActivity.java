package com.shaiicodez.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //Team 1
    int scoreTeamOne = 0;
    TextView txtScoreTeamOne;

    //Team 2
    int scoreTeamTwo = 0;
    TextView txtScoreTeamTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtScoreTeamOne = findViewById(R.id.txt_score_team1);
        txtScoreTeamTwo = findViewById(R.id.txt_score_team2);

    }

    public void resetTeams(View view) {
        scoreTeamOne = 0;
        scoreTeamTwo = 0;
        txtScoreTeamOne.setText(""+scoreTeamOne);
        txtScoreTeamTwo.setText(""+scoreTeamTwo);
    }

    //Team 1
    public void clearScoreTeamOne(View view) {
        scoreTeamOne = 0;
        txtScoreTeamOne.setText(""+scoreTeamOne);
    }

    public void addTenTeamOne(View view) {
        scoreTeamOne = scoreTeamOne + 10;
        txtScoreTeamOne.setText(""+scoreTeamOne);
    }

    public void addOneTeamOne(View view) {
        scoreTeamOne = scoreTeamOne + 1;
        txtScoreTeamOne.setText(""+scoreTeamOne);
    }

    public void addFiveTeamOne(View view) {
        scoreTeamOne = scoreTeamOne + 5;
        txtScoreTeamOne.setText(""+scoreTeamOne);
    }

    //Team 2
    public void clearScoreTeamTwo(View view) {
        scoreTeamTwo = 0;
        txtScoreTeamTwo.setText(""+scoreTeamTwo);
    }

    public void addTenTeamTwo(View view) {

        scoreTeamTwo = scoreTeamTwo + 10;
        txtScoreTeamTwo.setText(""+scoreTeamTwo);
    }

    public void addOneTeamTwo(View view) {

        scoreTeamTwo = scoreTeamTwo + 1;
        txtScoreTeamTwo.setText(""+scoreTeamTwo);
    }

    public void addFiveTeamTwo(View view) {

        scoreTeamTwo = scoreTeamTwo + 5;
        txtScoreTeamTwo.setText(""+scoreTeamTwo);
    }

}