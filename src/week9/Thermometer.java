package application;

import java.util.*;

public class Thermometer implements Sensor {
    private boolean isThisThingOn;
    private Random random;

    public Thermometer() {
        this.isThisThingOn = false;
        this.random = new Random();
    }

    @Override
    public boolean isOn() {
        // returns true if the sensor is on

        if (this.isThisThingOn) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void on() {
        //  switches the sensor on
        this.isThisThingOn = true;
    }

    @Override
    public void off() {
        // switches the sensor off
        this.isThisThingOn = false;
    }

    @Override
    public int measure() {
        // returns the sensor reading if the sensor is on
        // if the sensor is off, it throws an IllegalStateException

        if (this.isThisThingOn) {
            int nextRandom = random.nextInt(61) - 30;
            return nextRandom;
        } else {
            throw new IllegalStateException();
        }
    }
}