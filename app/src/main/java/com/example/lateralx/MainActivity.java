package com.example.lateralx;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



//for dialer app
    public  void call(View v)
    {
        Uri u = Uri.parse("tel:" + "7415738934");

        // Create the intent and set the data for the
        // intent as the phone number.
        Intent i = new Intent(Intent.ACTION_DIAL, u);

        try
        {
            // Launch the Phone app's dialer with a phone
            // number to dial a call.
            startActivity(i);
        }
        catch (SecurityException s)
        {
            // show() method display the toast with
            // exception message.
        }
    }
//for markerbased
    public void startMarkerbased(View v){
        Intent i = new Intent(this,AugmentedImageActivity.class);
        startActivity(i);
    }

//for markerless
    public void startMarkerless(View v){
        Intent i = new Intent(this,MarkerlessActivity.class);
        startActivity(i);
    }

//for vr tour
    public void startTour(View v){
        Intent i = new Intent(this,VRTourActivity.class);
        startActivity(i);
    }
}

