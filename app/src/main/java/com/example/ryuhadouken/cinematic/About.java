package com.example.ryuhadouken.cinematic;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.mikepenz.aboutlibraries.LibsBuilder;

/**
 * Created by ryuhadouken on 30/4/16.
 */
public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
    }

    public void click(View v)
    {
        String uri;
        if (v.equals(findViewById(R.id.site)))
            uri="http://www.navneetsharma.in";
        else if(v.equals(findViewById(R.id.git)))
            uri="https://github.com/navneetzz/";
        else
            uri="https://plus.google.com/+Navneetsharma1";
        Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(i);
    }

    public void intro(View v)
    {
        Intent i = new Intent(About.this, Intro.class);
        startActivity(i);
    }

    public void credits(View v) {
        new LibsBuilder()
                .withActivityTitle(getString(R.string.credits))
                .withAboutAppName(getString(R.string.app_name))
                .withAboutVersionShownName(true)
                .withAboutIconShown(true)
                .withLicenseDialog(true)
                .withFields(R.string.class.getFields())
                .withAboutDescription(getString(R.string.desc4))
                .withActivityTheme(R.style.AboutLibrariesTheme)
                //start the activity
                .start(this);
    }

}
