package devices;

import com.company.Sellable;

import java.io.File;
import java.util.Objects;

public class Car extends Device implements Sellable {
    public Double weight;
    String plate;
    File pic;

    public Car(String model, String producer) {
        super(model, producer);
        if (this.model == "e46" && this.producer == "bmw") {
            this.value = 5000.0;
        } else this.value = 10.0;
    }

    public boolean equals(Car other) {
        return Objects.equals(value, other.value);
    }

    public String toString() {
        return model + " " + producer + " " + value;
    }

    @Override
    public void turnOn() {
        System.out.println("Starting the system");
    }
}
