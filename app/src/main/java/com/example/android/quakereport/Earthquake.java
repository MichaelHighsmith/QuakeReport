package com.example.android.quakereport;

/**
 * Created by Owner on 1/26/2017.
 */

public class Earthquake {

    //define 3 global variables
    private double mMagnitude;

    private String mLocation;

    private long mTimeInMilliseconds;

    private String mUrl;

    //Makes a constructor that passes in 3 variables and assigns them to the strings created above
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    //make 3 public 'getter' methods so that other classes can acces this information
    public double getMagnitude() { return mMagnitude; }

    public String getLocation() { return mLocation; }

    public long gettimeInMilliseconds() { return mTimeInMilliseconds; }

    public String getUrl() { return mUrl; }



}
