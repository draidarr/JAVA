package devices;

import creatures.Human;
import com.company.Sellable;

public abstract class Device implements Sellable {
    public final String model;
    public final String producer;
    public int yearOfProduction;
    public double value;
    double voltage;


    public Device(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }


    public String toString() {
        return model + " " + producer + " " + value + " " + yearOfProduction;
    }

    abstract public void turnOn();

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {

    }

}