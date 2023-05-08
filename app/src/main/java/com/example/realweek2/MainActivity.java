package com.example.realweek2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User();
        user.setFollowed(false);

    }

    boolean followed = false;
    public void onFollowClick (View v){
        if (followed) {

            Button button = (Button) findViewById(R.id.btnFollow);
            button.setText("Follow");
            followed = false;

        } else {

            Button button = (Button) findViewById(R.id.btnFollow);
            button.setText("Unfollow");
            followed = true;
        }
    }

}