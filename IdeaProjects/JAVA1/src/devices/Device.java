package devices;

public abstract class Device {
    public final String model;
    public final String producer;
    public int yearOfProduction;
    public double value;
    double v;

    public Device(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }


    public String toString() {
        return model + " " + producer + " " + value + " " + yearOfProduction;
    }

    abstract public void turnOn();
}