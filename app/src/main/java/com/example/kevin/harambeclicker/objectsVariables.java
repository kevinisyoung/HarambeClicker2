package com.example.kevin.harambeclicker;

import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kevin on 9/17/2016.
 */


public class objectsVariables {
    // Create counter instance variables
    private int multiplierCounter, prayerCounter, animation, multiplierBuild;
    // Create counter TextViews
    private TextView prayerCounterTextView, multiplierCounterTextView;
    // Create Harambe ImageViews
    private ImageView harambeNormal, harambeLeft, harambeRight;
    // Create resources object
    private Resources harambeResources;


    // Create Shop variables for prices
    private int churchCost, monkCost;





    //return variables to be used in another class
    public void setPrayers(int prayerCounter){prayerCounter = prayerCounter;}
    public int getPrayers(){return prayerCounter;}


    //return multiplierCounter
    public void setMultiplierCounter(int MultiplierCounter){multiplierCounter = multiplierCounter;}
    public int getMultiplierCounter(){return multiplierCounter;}

    //return animation
    public void setAnimation(int prayers){animation = animation;}
    public int getAnimation(){return animation;}

    //return multiplier build
    public void setMultiplierBuild(int multiplierBuild){multiplierBuild = multiplierBuild;}
    public int getMultiplierBuild(){return prayerCounter;}


}
