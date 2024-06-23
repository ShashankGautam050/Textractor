package com.shashank.textractor;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class OnboardingScreen extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addFragment(new Step.Builder().setTitle("Extract Text from Images Using Machine Learning")
                .setContent("Recognize Text from Images Using Machine Learning")
                .setBackgroundColor(Color.parseColor("#FF0957"))
                .setDrawable(R.drawable.onboard1)
                .setSummary("You can extract text from images using machine learning.")
                .build());

        addFragment(new Step.Builder().setTitle("Copy and Use the Extracted Text in Seconds")
                .setContent("Recognize Text from Images Using Machine Learning")
                .setBackgroundColor(Color.parseColor("#FF0957"))
                .setDrawable(R.drawable.onboard2)
                .setSummary("You can extract text from images using machine learning.")
                .build());

        addFragment(new Step.Builder().setTitle("This is header")
                .setContent("Recognize Text from Images Using Machine Learning")
                .setBackgroundColor(Color.parseColor("#FF0957"))
                .setDrawable(R.drawable.onboard3)
                .setSummary("You can extract text from images using machine learning.")
                .build());
    }

    @Override
    public void currentFragmentPosition(int position) {
        // Handle fragment position changes if necessary
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

    @Override
    public void finishTutorial() {
        // This method is called when the tutorial is finished
        // Start MainActivity and finish this activity
        Intent intent = new Intent(OnboardingScreen.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
