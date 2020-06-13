package com.company;

import java.time.LocalDateTime;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    private Car vehicle;
    private Double salary;


    public void sal() {
        System.out.println("Your salary was last seen at: " + LocalDateTime.now());
        System.out.println("Your salary is: " + this.salary);
    }

    public void setSalary(double x) {
        if (x <= 0) {
            System.out.println("It's inappropriate to steal from your employees");
        } else {
            System.out.println("The data has been sent to accounting department");
            System.out.println("You have to take the annex from Hania in human resources department");
            System.out.println("ZUS and US already know about your salary so don't lie to them!");
            this.salary = x;
            System.out.println("Your salary is: " + this.salary);
        }
    }

    public String getVehicle(String which) {
        return "whatever";
    }

    public void setVehicle(String which) {
        if (which == "beema") {
            if (this.vehicle.value >= this.salary) {
                System.out.println("Gz, you bought a new car");
            } else if (this.vehicle.value >= this.salary) {
                System.out.println("You bought a new car but you have to give us more money");
            } else System.out.println("Get a new job instead of thinking about cars");
        }
    }
}
