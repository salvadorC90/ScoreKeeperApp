package com.example.android.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreRedTeam = 0;
    int scoreBlueTeam = 0;
    int demoRedTeam = 0;
    int demoBlueTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /**
     * Increase the score for Red team by 1 point.
     */
    public void addOneForRedTeam(View v) {
        scoreRedTeam = scoreRedTeam + 1;
        displayForRedTeam(scoreRedTeam);

    }

    /**
     * Increase the score for Red by 2 points.
     */
    public void addTwoForRedTeam(View v) {
        scoreRedTeam = scoreRedTeam + 2;
        displayForRedTeam(scoreRedTeam);

    }

    /**
     * Increase the demos for Red team by 1 point.
     */
    public void addDemoForRedTeam(View v) {
        demoRedTeam = demoRedTeam + 1;
        displayForRedTeamDemo(demoRedTeam);

    }

    /**
     * Increase the score for Blue Team by 1 point.
     */
    public void addOneForBlueTeam(View v) {
        scoreBlueTeam = scoreBlueTeam + 1;
        displayForBlueTeam(scoreBlueTeam);

    }

    /**
     * Increase the score for Blue Team by 2 points.
     */
    public void addTwoForBlueTeam(View v) {
        scoreBlueTeam = scoreBlueTeam + 2;
        displayForBlueTeam(scoreBlueTeam);

    }

    /**
     * Increase the demos for Blue Team by 1 point.
     */
    public void addDemoForBlueTeam(View v) {
        demoBlueTeam = demoBlueTeam + 1;
        displayForBlueTeamDemo(demoBlueTeam);
    }

    public void clearCounter(View v) {
        scoreRedTeam = 0;
        scoreBlueTeam = 0;
        demoRedTeam = 0;
        demoBlueTeam = 0;
        displayForRedTeam(scoreRedTeam);
        displayForBlueTeam(scoreBlueTeam);
        displayForRedTeam(demoRedTeam);
        displayForBlueTeam(demoBlueTeam);
    }

    /**
     * Displays the given score for Red Team.
     */
    public void displayForRedTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_team);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Blue Team.
     */
    public void displayForBlueTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.blue_team);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given demos for Red Team.
     */
    public void displayForRedTeamDemo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_team_demo);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given demos for Blue Team.
     */
    public void displayForBlueTeamDemo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.blue_team_demo);
        scoreView.setText(String.valueOf(score));
    }
}