package com.company;

import java.io.File;

public class Car {
    public final String model;
    public final String producer;
    public Double weight;
    String plate;
    File pic;
    double value;

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
        if (this.model == "e46" && this.producer == "bmw") {
            this.value = 5000.0;
        } else this.value = 10.0;
    }
}
