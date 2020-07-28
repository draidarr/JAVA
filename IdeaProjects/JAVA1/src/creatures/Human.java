package creatures;

import com.company.Sellable;
import devices.Car;
import devices.Phone;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Human extends Animal implements Sellable {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Car[] garage;
    private Double salary;
    public Double cash;
    public Phone phone;
    static final Integer DEFAULT_GARAGE_SIZE = 7;

    public Human(String species) {
        super(species);
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(String species, Integer garageSize) {
        super(species);
        this.garage = new Car[garageSize];
    }


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

    public Car getVehicle(Integer park) {
        return garage[park];
    }

    public void setVehicle(Car vehicle, Integer park) {
        if (vehicle.value <= this.salary) {
            System.out.println("Gz, you bought a new car");
            this.garage[park] = vehicle;
        } else if (vehicle.value < this.salary / 12.0) {
            System.out.println("You bought a new car but you have to give us more money");
            this.garage[park] = vehicle;
        } else System.out.println("Get a new job instead of thinking about cars");
    }

    public Car[] getGarage() {
        return this.garage;
    }

    public String toString() {
        return firstName + " " + lastName + " " + pet + " " + garage + " " + salary;
    }

    public void sortGarage() {
        Arrays.sort(this.garage);
    }

    public void valueAll() {
        Double all = 0.0;
        for (Car vehicle : garage) {
            if (vehicle != null) {
                all += vehicle.value;
            }
        }
        System.out.println("Cars in your garage are worth: " + all);
    }

    public boolean hasCar(Car newCar) {
        for (Car vehicle : garage) {
            if (vehicle == newCar) {
                return true;
            }
        }
        return false;
    }

    public boolean hasSpace() {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void removeCar(Car vehicle) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == vehicle) {
                this.garage[i] = null;
            }
        }
    }

    public void addCar(Car newCar) throws Exception {
        if (this.hasSpace()) {
            for (int i = 0; i < this.garage.length; i++) {
                if (this.garage[i] == null) {
                    this.garage[i] = newCar;
                    break;
                }
            }
        } else {
            throw new Exception("You can't place that here");
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
    }
}



