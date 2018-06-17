package com.example.android.quakereport;

/**
 * An {@link Earthquake} object holds the information about a single earthquake: magnitude, location, and date
 */

public class Earthquake {

    // define three global variable to hold respective parameter about the earth quake
    /** magnitude of the earthquake */
    private String mMagnitude;

    /** location of the earthquake */
    private String mLocation;

    /** date the earthquake occurred */
    private String mDate;

    /**
     * Construct a new {@link Earthquake} Object
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location of the city of the earthquake
     * @param date is the date on which the earthquake strikes.
     */

    public Earthquake(String magnitude, String location, String date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    // Since the global variables are private we need to define getter methods to access them
    // from outside

    /**
     * @return returns the magnitude of the earthquake
     */
    public String getMagnitude() {
        return mMagnitude;
    }
    /** @return returns the location of the earthquake */
    public String getLocation() {
        return mLocation;
    }
    /** @return returns the date of the earthquake */
    public String getDate() {
        return mDate;
    }
}
