package com.example.asimz.humanassistantrobot;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);


        // Set up the user interaction to manually show or hide the system UI.


        // Upon interacting with UI controls, delay any scheduled hide()
        // operations to prevent the jarring behavior of controls going away
        // while interacting with the UI.

    }
    public void HomeAutomation(View view) {
        Intent intent = new Intent(this, HomeAutomation.class);
        startActivity(intent);
        // Do something in response to button
    }
    public void Survellience(View view) {
        Intent intent = new Intent(this, Survillence.class);
        startActivity(intent);
        // Do something in response to button
    }
    public void AboutUs(View view) {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
        // Do something in response to button
    }
    public void Exit(View view) {
        finish();
        System.exit(0);
        // Do something in response to button
    }
}