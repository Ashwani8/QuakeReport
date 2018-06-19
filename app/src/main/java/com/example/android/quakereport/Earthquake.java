package com.example.android.quakereport;

/**
 * An {@link Earthquake} object holds the information about a single earthquake: magnitude, location, and date
 */

public class Earthquake {

    // define three global variable to hold respective parameter about the earth quake
    /** magnitude of the earthquake */
    private double mMagnitude;

    /** location of the earthquake */
    private String mLocation;

    /** date the earthquake occurred */
    //private Long mDate;

    /** Time of the earthquake */
    private Long mTimeInMilliseconds;

    private String mUrl;

    /**
     * Construct a new {@link Earthquake} Object
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location of the city of the earthquake
     * @param timeInMilliseconds is the time at which the earthquake strikes. [Jan 01, 1970]
     * @param   url is the website URL to find more details about the earthquake
     */

    public Earthquake(double magnitude, String location, Long timeInMilliseconds, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    // Since the global variables are private we need to define getter methods to access them
    // from outside

    /**
     * @return returns the magnitude of the earthquake
     */
    public double getMagnitude() {
        return mMagnitude;
    }
    /** @return returns the location of the earthquake */
    public String getLocation() {
        return mLocation;
    }
    /** @return returns the time of the earthquake */
    public Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /** @return returns the website address of the earthquake */
    public String getUrl() {
        return mUrl;
    }
}
