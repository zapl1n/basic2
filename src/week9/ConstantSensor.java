package application;

public class ConstantSensor implements Sensor {
    private int parameter;

    public ConstantSensor(int parameter) {
        this.parameter = parameter;
    }

    @Override
    public boolean isOn() {
        // ConstantSensor is always on. Always returns true

        return true;
    }

    @Override
    public void on() {
        // ConstantSensor is always on. Cannot switch on or off.
    }

    @Override
    public void off() {
        // ConstantSensor is always on. Cannot switch on or off.
    }

    @Override
    public int measure() {
        // returns the sensor reading if the sensor is on
        // if the sensor is off, it throws an IllegalStateException

        return this.parameter;
    }
}