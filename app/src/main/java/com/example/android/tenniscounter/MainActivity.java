package com.example.android.tenniscounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String playerOnePoints = "Points: 0";
    String playerTwoPoints = "Points: 0";
    int playerTwoGame = 0;
    int playerOneGame = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayGamesPlayerOne(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGamesPlayerTwo(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPlayerOnePoints(String score) {
        TextView scoreView = findViewById(R.id.team_a_points);
        scoreView.setText(String.valueOf(score));
    }


    public void displayPlayerTwoPoints(String score) {
        TextView scoreView = findViewById(R.id.team_b_points);
        scoreView.setText(String.valueOf(score));
    }

/// /    Player One Scores


    public void fifteenForPlayerOne(View view) {
        playerOnePoints = "Points: 15";
        displayPlayerOnePoints(playerOnePoints);

    }

    public void thirtyForPlayerOne(View view) {
        playerOnePoints = "Points: 30";
        displayPlayerOnePoints(playerOnePoints);

    }

    public void fortyForPlayerOne(View view) {
        playerOnePoints = "Points: 40";
        displayPlayerOnePoints(playerOnePoints);

    }

    public void AdvantageInForPlayerOne(View view) {
        playerOnePoints = "Points: Ad";
        playerTwoPoints = "Points: Out";
        displayPlayerTwoPoints(playerTwoPoints);
        displayPlayerOnePoints(playerOnePoints);
    }

    public void GamePlayerOne(View view) {
        playerOnePoints = "0";
        playerTwoPoints = "0";
        playerOneGame = playerOneGame + 1;
        displayPlayerOnePoints(playerOnePoints);
        displayPlayerTwoPoints(playerTwoPoints);
        displayGamesPlayerOne(playerOneGame);

    }

//    Player Two Scores

    public void fifteenForPlayerTwo(View view) {
        playerTwoPoints = "Points: 15";
        displayPlayerTwoPoints(playerTwoPoints);

    }

    public void thirtyForPlayerTwo(View view) {
        playerTwoPoints = "Points: 30";
        displayPlayerTwoPoints(playerTwoPoints);

    }

    public void fortyForPlayerTwo(View view) {
        playerTwoPoints = "Points: 40";
        displayPlayerTwoPoints(playerTwoPoints);

    }

    public void AdvantageInForPlayerTwo(View view) {
        playerOnePoints = "Points: Out";
        playerTwoPoints = "Points: Ad";
        displayPlayerTwoPoints(playerTwoPoints);
        displayPlayerOnePoints(playerOnePoints);
    }

    public void GamePlayerTwo(View view) {
        playerOnePoints = "0";
        playerTwoPoints = "0";
        playerTwoGame = playerTwoGame + 1;
        displayPlayerOnePoints(playerOnePoints);
        displayPlayerTwoPoints(playerTwoPoints);
        displayGamesPlayerTwo(playerTwoGame);

    }

    //Deuce and Resets
    public void Deuce(View view) {
        playerOnePoints = "Points: 40";
        playerTwoPoints = "Points: 40";
        displayPlayerOnePoints(playerOnePoints);
        displayPlayerTwoPoints(playerTwoPoints);


    }

    public void Reset(View view) {
        playerOnePoints = "Points: 0";
        playerTwoPoints = "Points: 0";
        playerOneGame = 0;
        playerTwoGame = 0;
        displayPlayerOnePoints(playerOnePoints);
        displayPlayerTwoPoints(playerTwoPoints);
        displayGamesPlayerOne(playerTwoGame);
        displayGamesPlayerTwo(playerTwoGame);

    }

}
