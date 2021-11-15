package com.example.android.quakereport;

public class Earthquake {

    //variables for the storage of the magnitude and location and date
    private Double mMagnitude;
    private String moffsetLocation;
    private String mprimaryLocation;
    private long mTimeInMilliseconds;


    //Default constructor for the class
    public Earthquake(Double magnitude,String OffsetLocation,  String PrimaryLocation, long timeInMilliseconds){
        mMagnitude = magnitude;
        moffsetLocation = OffsetLocation;
        mprimaryLocation = PrimaryLocation;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    //getter method for each variable
    public Double getMagnitude(){ return mMagnitude; }

    public String getOffsetLocation(){ return moffsetLocation; }

    public String getPrimaryLocation(){ return mprimaryLocation; }

    public long getTimeInMilliseconds() { return mTimeInMilliseconds; }
}
