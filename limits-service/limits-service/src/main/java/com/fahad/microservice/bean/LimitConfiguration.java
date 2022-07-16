package com.fahad.microservice.bean;

public class LimitConfiguration {
    private int minimum;
    private int maximum;

    public LimitConfiguration() {
    }

    public LimitConfiguration( int maximum,int minimum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }
}
