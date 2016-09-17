package com.example.kevin.harambeclicker;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by kevin on 9/16/2016.
 */


public class shop extends Activity{

    // Create counter TextViews
    private TextView prayerCounterTextView, multiplierCounterTextView;
    // Create resources object
    private Resources harambeResources;

    public void getVariables(){
        objectsVariables p = new objectsVariables();

        //RETURN THE PRAYERS VALUE111
        int prayerCounter = p.getPrayers();

    }


    public void create(Bundle savedInstanceState) {
        // Initialize counter TextViews and set them
        String updatePrayersTextStart = String.format(harambeResources.getString(R.string.prayers_text), 0);
        prayerCounterTextView.setText(updatePrayersTextStart);

        // Initialize counter TextViews and set them


    }

    public void buyChurch(){

    }

}
