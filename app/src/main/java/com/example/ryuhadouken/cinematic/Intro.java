package com.example.ryuhadouken.cinematic;

import android.graphics.Color;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by ryuhadouken on 30/4/16.
 */
public class Intro extends AppIntro {

    @Override
    public void init(Bundle savedInstanceState) {

        addSlide(AppIntroFragment.newInstance(getResources().getString(R.string.app_name), getResources().getString(R.string.intro1), R.drawable.ic_launcher, Color.argb(255,48,48,48)));
        addSlide(AppIntroFragment.newInstance(getResources().getString(R.string.details), getResources().getString(R.string.intro2), R.drawable.ic_launcher, Color.argb(255,48,48,48)));
        addSlide(AppIntroFragment.newInstance(getResources().getString(R.string.sorting), getResources().getString(R.string.intro3), R.drawable.ic_launcher, Color.argb(255, 48, 48, 48)));
        addSlide(AppIntroFragment.newInstance(getResources().getString(R.string.fav), getResources().getString(R.string.intro4), R.drawable.ic_launcher, Color.argb(255, 48, 48, 48)));
        showStatusBar(true);
        setZoomAnimation();

    }

    @Override
    public void onSkipPressed() {
        finish();
    }

    @Override
    public void onNextPressed() {
        // Do something when users tap on Next button.
    }

    @Override
    public void onDonePressed() {
        finish();
    }

    @Override
    public void onSlideChanged() {
        // Do something when slide is changed
    }
}

