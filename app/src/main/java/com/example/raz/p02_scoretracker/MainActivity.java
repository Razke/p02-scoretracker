package com.example.raz.p02_scoretracker;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreHomeTeam = 0;
    int statHomeFouls = 0;
    int statHomeYellows = 0;
    int statHomeReds = 0;

    int scoreAwayTeam = 0;
    int statAwayFouls = 0;
    int statAwayYellows = 0;
    int statAwayReds = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);

        displayHomeTeam(0);
        displayHomeFouls(0);
        displayHomeYellows(0);
        displayHomeReds(0);
        displayAwayTeam(0);
        displayAwayFouls(0);
        displayAwayYellows(0);
        displayAwayReds(0);
    }

    /**
     * Increase the score for the Home Team by 1 point.
     */

    public void addHomeGoal(View v) {
        scoreHomeTeam++;
        displayHomeTeam(scoreHomeTeam);
    }

    /**
     * Displays the given score for the Home Team.
     */

    public void displayHomeTeam(int score) {
        TextView scoreView = findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the Home Fouls stat by 1 point.
     */

    public void addHomeFouls(View v) {
        statHomeFouls++;
        displayHomeFouls(statHomeFouls);
    }

    /**
     * Displays the Home Fouls stat.
     */

    public void displayHomeFouls(int stat) {
        TextView scoreView = findViewById(R.id.home_fouls);
        scoreView.setText(String.valueOf(stat));
    }

    /**
     * Increase the Home Yellows stat by 1 point.
     */

    public void addHomeYellows(View v) {
        statHomeYellows++;
        displayHomeYellows(statHomeYellows);
    }

    /**
     * Displays the Home Yellow stat.
     */

    public void displayHomeYellows(int stat) {
        TextView scoreView = findViewById(R.id.home_yellows);
        scoreView.setText(String.valueOf(stat));
    }

    /**
     * Increase the Home Reds stat by 1 point.
     */

    public void addHomeReds(View v) {
        statHomeReds++;
        displayHomeReds(statHomeReds);
    }

    /**
     * Displays the Home Reds stat.
     */

    public void displayHomeReds(int stat) {
        TextView scoreView = findViewById(R.id.home_reds);
        scoreView.setText(String.valueOf(stat));
    }

    /**
     * Increase the score for the Away Team by 1 point.
     */

    public void addAwayGoal(View v) {
        scoreAwayTeam++;
        displayAwayTeam(scoreAwayTeam);
    }

    /**
     * Displays the given score for the Away Team.
     */

    public void displayAwayTeam(int score) {
        TextView scoreView = findViewById(R.id.away_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the Away Fouls stat by 1 point.
     */

    public void addAwayFouls(View v) {
        statAwayFouls++;
        displayAwayFouls(statAwayFouls);
    }

    /**
     * Displays the Away Fouls stat.
     */

    public void displayAwayFouls(int stat) {
        TextView scoreView = findViewById(R.id.away_fouls);
        scoreView.setText(String.valueOf(stat));
    }

    /**
     * Increase the Away Yellows stat by 1 point.
     */

    public void addAwayYellows(View v) {
        statAwayYellows++;
        displayAwayYellows(statAwayYellows);
    }

    /**
     * Displays the Away Yellows stat.
     */

    public void displayAwayYellows(int stat) {
        TextView scoreView = findViewById(R.id.away_yellows);
        scoreView.setText(String.valueOf(stat));
    }

    /**
     * Increase the Away Reds stat by 1 point.
     */

    public void addAwayReds(View v) {
        statAwayReds++;
        displayAwayReds(statAwayReds);
    }

    /**
     * Displays the Away Reds stat.
     */

    public void displayAwayReds(int stat) {
        TextView scoreView = findViewById(R.id.away_reds);
        scoreView.setText(String.valueOf(stat));
    }

    /**
     * Starts a new match with the stats reset.
     */

    public void resetMatch(View v) {

        scoreHomeTeam = 0;
        statHomeFouls = 0;
        statHomeYellows = 0;
        statHomeReds = 0;

        scoreAwayTeam = 0;
        statAwayFouls = 0;
        statAwayYellows = 0;
        statAwayReds = 0;

        displayNewHomeTeam(0);
        displayNewHomeFouls(0);
        displayNewHomeYellows(0);
        displayNewHomeReds(0);
        displayNewAwayTeam(0);
        displayNewAwayFouls(0);
        displayNewAwayYellows(0);
        displayNewAwayReds(0);
    }

    /**
     * Displays the rest score and stats for both Teams.
     */
    public void displayNewHomeTeam(int score) {
        TextView scoreView = findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayNewHomeFouls(int stat) {
        TextView scoreView = findViewById(R.id.home_fouls);
        scoreView.setText(String.valueOf(stat));
    }

    public void displayNewHomeYellows(int stat) {
        TextView scoreView = findViewById(R.id.home_yellows);
        scoreView.setText(String.valueOf(stat));
    }

    public void displayNewHomeReds(int stat) {
        TextView scoreView = findViewById(R.id.home_reds);
        scoreView.setText(String.valueOf(stat));
    }

    public void displayNewAwayTeam(int score) {
        TextView scoreView = findViewById(R.id.away_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayNewAwayFouls(int stat) {
        TextView scoreView = findViewById(R.id.away_fouls);
        scoreView.setText(String.valueOf(stat));
    }

    public void displayNewAwayYellows(int stat) {
        TextView scoreView = findViewById(R.id.away_yellows);
        scoreView.setText(String.valueOf(stat));
    }

    public void displayNewAwayReds(int stat) {
        TextView scoreView = findViewById(R.id.away_reds);
        scoreView.setText(String.valueOf(stat));
    }
}