package com.company;
import java.time.LocalDateTime;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Car vehicle;
    private Double salary;

    public void sal(){
        System.out.println("Your salary was last seen at: " + LocalDateTime.now());
        System.out.println("Your salary is: " + this.salary);
    }
    public void setsal(double x){
        if (salary<=0){
            System.out.println("It's inappropriate to steal from your employees");
        }
        else {
            System.out.println("The data has been sent to accounting department");
            System.out.println("You have to take the annex from Hania in human resources department");
            System.out.println("ZUS and US already know about your salary so don't lie to them!");
            this.salary=x;
            System.out.println("Your salary is: " + this.salary);
        }
    }
}
