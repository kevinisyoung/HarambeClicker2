package com.example.kevin.harambeclicker;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Create counter TextViews
    private TextView prayerCounterTextView, multiplierCounterTextView;
    // Create Harambe ImageViews
    private ImageView harambeNormal, harambeLeft, harambeRight;
    // Create resources object
    private Resources harambeResources;


    //get the variables

        objectsVariables p = new objectsVariables();

        //RETURN THE PRAYERS VALUE111
        int prayerCounter = p.getPrayers();
        int multiplierCounter = p.getMultiplierCounter();
        int multiplierBuild = p.getMultiplierBuild();
        int animation = p.getAnimation();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Grab and initialize resources into res
        harambeResources = getResources();

        // Initialize counter TextViews and set them
        prayerCounterTextView = (TextView) findViewById(R.id.prayerCounterText);
        String updatePrayersTextStart = String.format(harambeResources.getString(R.string.prayers_text), 0);
        prayerCounterTextView.setText(updatePrayersTextStart);

        multiplierCounterTextView = (TextView) findViewById(R.id.multiplierCounterText);
        String updateMultiplierTextStart = String.format(harambeResources.getString(R.string.multiplier_text), 1);
        multiplierCounterTextView.setText(updateMultiplierTextStart);

        // Initialize the Harambe ImageViews
        harambeNormal = (ImageView) findViewById(R.id.harambe);
        harambeLeft = (ImageView)  findViewById(R.id.harambeLeft);
        harambeRight = (ImageView)  findViewById(R.id.harambeRight);
    }

    // Run when the screen is tapped.
    public void prayer(View v) {
        setMultiplierCounter();
        setPrayerCounter();
        setAnimation();
        makeSize();
        multiplierBuildUp();
    }

    // Opens up the shop
    public void shopOpen(View v) {

    }

    // Add to the multiplier the more you tap.
    public void multiplierBuildUp(){
        multiplierBuild++;
        if (multiplierBuild > 10) {
            multiplierBuild -= 10;
            multiplierCounter+=1;
        }
    }

    // Update and set the prayer counter to the current value.
    public void setPrayerCounter(){
        if (multiplierCounter == 0) {
            prayerCounter++;
        } else if (multiplierCounter > 0) {
            prayerCounter += multiplierCounter;
        }
        String updatePrayersText = String.format(harambeResources.getString(R.string.prayers_text), prayerCounter);
        prayerCounterTextView.setText(updatePrayersText);
    }

    // Update and set multiplier counter to the current value.
    public void setMultiplierCounter(){
        String updateMultiplierText = String.format(harambeResources.getString(R.string.multiplier_text), getFutureMultiplierCounter(multiplierCounter));
        multiplierCounterTextView.setText(updateMultiplierText);
    }

    // Get the next tap multiplier for human addition accuracy
    public int getFutureMultiplierCounter(int currentMultiplier){
        if (currentMultiplier > 0 && currentMultiplier < 5){
            return ++currentMultiplier;
        } else {
            return 1;
        }
    }

    // Set correct image for animation.
    public void setAnimation(){
        animation++;

        if (animation == 2) {
            harambeNormal.setVisibility(View.INVISIBLE);
            harambeRight.setVisibility(View.INVISIBLE);
            harambeLeft.setVisibility(View.VISIBLE);
        }
        if (animation == 4) {
            harambeNormal.setVisibility(View.INVISIBLE);
            harambeRight.setVisibility(View.VISIBLE);
            harambeLeft.setVisibility(View.INVISIBLE);
        }
        if (animation == 6) {
            animation = 0;
            harambeNormal.setVisibility(View.VISIBLE);
            harambeRight.setVisibility(View.INVISIBLE);
            harambeLeft.setVisibility(View.INVISIBLE);
        }
    }

    // Update current size of Harambe
    public void makeSize(){
        if (multiplierCounter > 4) {
            multiplierCounter = 0;

            harambeNormal.requestLayout();
            harambeNormal.getLayoutParams().height += 5;
            harambeNormal.getLayoutParams().width += 5;

            harambeRight.requestLayout();
            harambeRight.getLayoutParams().height += 5;
            harambeRight.getLayoutParams().width += 5;

            harambeLeft.requestLayout();
            harambeLeft.getLayoutParams().height += 5;
            harambeLeft.getLayoutParams().width += 5;
        }
    }
}
