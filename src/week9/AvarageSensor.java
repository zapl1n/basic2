package application;

import java.util.*;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> allSensors;
    private ArrayList<Integer> allReadings;

    public AverageSensor() {
        this.allSensors = new ArrayList<Sensor>();
        this.allReadings = new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional) {
        this.allSensors.add(additional);
    }

    @Override
    public boolean isOn() {
        // returns true if all sensors are on

        boolean allOn = false;

        for (Sensor sensor : allSensors) {              // iterate through sensor list to see if all sensors are on.
            if (sensor.isOn()) {
                allOn = true;
            } else {
                allOn = false;
                break;                                  // break if we find a sensor that is off
            }
        }

        if (allOn) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void on() {
        //  switches all sensors on
        for (Sensor sensor : allSensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        // switches all sensors off
        for (Sensor sensor : allSensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        // returns the average sensor reading of all the sensors in average sensor, if the sensor is on
        // if the sensor is off, or no sensors have been added to average sensor yet, it throws an IllegalStateException

        if ( this.allSensors.isEmpty() || !this.isOn() ) {
            throw new IllegalStateException();
        } else {

            int measureSum = 0;
            int average = 0;

            for (Sensor sensor : allSensors) {

                measureSum += sensor.measure();
            }

            average = measureSum / allSensors.size();

            this.allReadings.add(average);           // 20.4 add average to list of readings() method

            return average;
        }
    }


    public List<Integer> readings() {                       // 20.4
        return (List) this.allReadings;
    }
}