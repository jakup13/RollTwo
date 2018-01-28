package com.example.android.scorekeeper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {
    int ScoreTeamA = 0;
    int ScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }
    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        ScoreTeamA = ScoreTeamA + 1;
        displayForTeamA(ScoreTeamA);
    }
    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        ScoreTeamA = ScoreTeamA + 2;
        displayForTeamA(ScoreTeamA);
    }
    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        ScoreTeamA = ScoreTeamA + 3;
        displayForTeamA(ScoreTeamA);
    }
    /**
     * Increase the score for Team A by 4 points.
     */
    public void addFourForTeamA(View v) {
        ScoreTeamA = ScoreTeamA + 4;
        displayForTeamA(ScoreTeamA);
    }
    /**
     * Increase the score for Team A by 5 points.
     */
    public void addFiveForTeamA(View v) {
        ScoreTeamA = ScoreTeamA + 5;
        displayForTeamA(ScoreTeamA);
    }
    /**
     * Increase the score for Team A by 6 points.
     */
    public void addSixForTeamA(View v) {
        ScoreTeamA = ScoreTeamA + 6;
        displayForTeamA(ScoreTeamA);
    }
    /**
     * Double the score for Team A.
     */
    public void doubleForTeamA(View v) {
        ScoreTeamA = ScoreTeamA * 2;
        displayForTeamA(ScoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        ScoreTeamB = ScoreTeamB + 1;
        displayForTeamB(ScoreTeamB);
    }
    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        ScoreTeamB = ScoreTeamB + 2;
        displayForTeamB(ScoreTeamB);
    }
    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View v) {
        ScoreTeamB = ScoreTeamB + 3;
        displayForTeamB(ScoreTeamB);
    }
    /**
     * Increase the score for Team B by 4 points.
     */
    public void addFourForTeamB(View v) {
        ScoreTeamB = ScoreTeamB + 4;
        displayForTeamB(ScoreTeamB);
    }
    /**
     * Increase the score for Team B by 5 points.
     */
    public void addFiveForTeamB(View v) {
        ScoreTeamB = ScoreTeamB + 5;
        displayForTeamB(ScoreTeamB);
    }
    /**
     * Increase the score for Team B by 4 points.
     */
    public void addSixForTeamB(View v) {
        ScoreTeamB = ScoreTeamB + 6;
        displayForTeamB(ScoreTeamB);
    }
    /**
     * Double the score for Team B.
     */
    public void doubleForTeamB(View v) {
        ScoreTeamB = ScoreTeamB * 2;
        displayForTeamB(ScoreTeamB);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Reset Scores.
     */
    public void resetScores(View v) {
        ScoreTeamA = 0;
        ScoreTeamB = 0;
        displayForTeamA(ScoreTeamA);
        displayForTeamB(ScoreTeamB);
    }
}