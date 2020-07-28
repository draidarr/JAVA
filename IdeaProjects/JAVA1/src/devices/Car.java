package devices;

import creatures.Human;
import com.company.Sellable;

import java.io.File;
import java.util.Objects;

public abstract class Car extends Device implements Sellable, Comparable<Car> {
    public Double weight;
    String plate;
    File pic;

    public Car(String model, String producer) {
        super(model, producer);
        if (this.model == "e46" && this.producer == "bmw") {
            this.value = 5000.0;
            this.yearOfProduction = 2000;
        } else if (this.model == "3" && this.producer == "tesla") {
            this.yearOfProduction = 2021;
            this.value = 300.0;
        } else {
            this.value = 10.0;
            this.yearOfProduction = 1995;
        }
    }

    public boolean equals(Car other) {
        return Objects.equals(value, other.value);
    }

    public String toString() {
        return model + " " + producer + " " + value;
    }

    abstract public void refuelCar();

    public int compareTo(Car o) {
        return o.yearOfProduction - this.yearOfProduction;
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this)) {
            throw new Exception("Sorry, there's no car like this");
        }
        if (!buyer.hasSpace()) {
            throw new Exception("Sorry, your garage is to small");
        }
        if (buyer.cash < price) {
            throw new Exception("Sry, too poor");
        }
        seller.removeCar(this);
        buyer.addCar(this);
        seller.cash = seller.cash + price;
        buyer.cash = buyer.cash - price;
        System.out.println("Transaction went well");
    }

    @Override
    public void turnOn() {
        System.out.println("Starting the system");
    }
}



