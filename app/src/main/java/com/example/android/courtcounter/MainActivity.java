package com.example.android.courtcounter;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences myScore = this.getSharedPreferences("MyAwesomeScore", Context.MODE_PRIVATE);
        scoreTeamA = myScore.getInt("scoreTeamA", 0);
        displayForTeamA(scoreTeamA);

        SharedPreferences myScore1 = this.getSharedPreferences("MyAwesomeScore1", Context.MODE_PRIVATE);
        scoreTeamB = myScore1.getInt("scoreTeamB", 0);
        displayForTeamB(scoreTeamB);

    }

    public void addOneForTeamA(View v) {
        scoreTeamA= scoreTeamA + 1;

        SharedPreferences myScore = getSharedPreferences("MyAwesomeScore", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = myScore.edit();
        editor.putInt("scoreTeamA", scoreTeamA);
        editor.commit();

        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;

        SharedPreferences myScore = getSharedPreferences("MyAwesomeScore", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = myScore.edit();
        editor.putInt("scoreTeamA", scoreTeamA);
        editor.commit();

        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;

        SharedPreferences myScore = getSharedPreferences("MyAwesomeScore", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = myScore.edit();
        editor.putInt("scoreTeamA", scoreTeamA);
        editor.commit();

        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;

        SharedPreferences myScore1 = getSharedPreferences("MyAwesomeScore1", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = myScore1.edit();
        editor.putInt("scoreTeamB", scoreTeamB);
        editor.commit();

        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;

        SharedPreferences myScore1 = getSharedPreferences("MyAwesomeScore1", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = myScore1.edit();
        editor.putInt("scoreTeamB", scoreTeamB);
        editor.commit();

        displayForTeamB(scoreTeamB);
    }

    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;

        SharedPreferences myScore1 = getSharedPreferences("MyAwesomeScore1", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = myScore1.edit();
        editor.putInt("scoreTeamB", scoreTeamB);
        editor.commit();

        displayForTeamB(scoreTeamB);
    }

    public  void resetScore(View v){
        scoreTeamA = 0;

        SharedPreferences myScore = getSharedPreferences("MyAwesomeScore", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = myScore.edit();
        editor.putInt("scoreTeamA", scoreTeamA);
        editor.commit();

        scoreTeamB = 0;

        SharedPreferences myScore1 = getSharedPreferences("MyAwesomeScore1", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor1 = myScore1.edit();
        editor1.putInt("scoreTeamB", scoreTeamB);
        editor1.commit();

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    public void minusScoreForTeamA(View v){
        scoreTeamA = scoreTeamA - 1;

        SharedPreferences myScore = getSharedPreferences("MyAwesomeScore", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = myScore.edit();
        editor.putInt("scoreTeamA", scoreTeamA);
        editor.commit();

        displayForTeamA(scoreTeamA);
    }
    public void minusScoreForTeamB(View v){
        scoreTeamB = scoreTeamB - 1;

        SharedPreferences myScore1 = getSharedPreferences("MyAwesomeScore1", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = myScore1.edit();
        editor.putInt("scoreTeamB", scoreTeamB);
        editor.commit();

        displayForTeamB(scoreTeamB);
    }


    public void displayForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);

        scoreView.setText(String.valueOf(score));}

    public void displayForTeamB(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_b_score);

        scoreView.setText(String.valueOf(score));
    }
}
