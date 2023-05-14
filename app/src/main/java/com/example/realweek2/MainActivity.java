package com.example.realweek2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User();
        user.setFollowed(false);

        Intent receivingEnd = getIntent();
        int randomInt = Integer.parseInt(receivingEnd.getStringExtra("Random integer"));

        TextView myText = findViewById(R.id.textView);
        String randomInteger = String.valueOf(randomInt);
        myText.setText("MAD" + randomInteger);
    }

    boolean followed = false;
    public void onFollowClick (View v){
        if (followed) {
            Toast.makeText(getBaseContext(),"Unfollowed", Toast.LENGTH_SHORT).show();
            Button button = (Button) findViewById(R.id.btnFollow);
            button.setText("Follow");
            followed = false;

        } else {
            Toast.makeText(getBaseContext(),"Followed", Toast.LENGTH_SHORT).show();
            Button button = (Button) findViewById(R.id.btnFollow);
            button.setText("Unfollow");
            followed = true;
        }
    }

}