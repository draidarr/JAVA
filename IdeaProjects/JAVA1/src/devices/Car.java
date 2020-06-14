package devices;

import com.company.Human;
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.vehicle == this) {
            if (buyer.cash != null && buyer.cash >= price) {
                buyer.cash = buyer.cash - price;
                seller.cash = seller.cash + price;
                buyer.vehicle = seller.vehicle;
                seller.vehicle = null;
                System.out.println("You bought "+this);
            } else System.out.println("You can't buy that");
        } else System.out.println("Merchant doesn't have that item!");
    }
}

