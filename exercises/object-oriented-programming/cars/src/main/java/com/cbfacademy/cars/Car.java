
package com.cbfacademy.cars;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String make;
    private String model;
    private String colour;
    private int year;

    public Car(String make, String model, String colour, int year) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getDetails() {
        return "Car Details" + make + model + colour + year;
    }
}

class Showroom {
    // Method to get the list of cars
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Volvo", "V40", "Blue", 2012));
        cars.add(new Car("Porsche", "Panamera", "Red", 2009));
        cars.add(new Car("Audi", "A3", "Grey", 2018));
        return cars;
    }
}
