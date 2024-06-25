
package com.cbfacademy.cars;
import java.util.ArrayLists;
import java.util.List;

public class Car{
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

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public String getColour(){
        return colour;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public String getDetails(){
        return "Make: " + make + ", Model: " + model + ", Colour: " + ", Year: " + year;
    }

    public class Showroom {
        public List<Car> getCars(){
            List<Cars> cars = new ArrayList<>();
            cars.add(new Car("volvo", "V40", "Blue", 2012));
            cars.add(new Car("Porsche", "Panamera", "Red", 2009));
            cars.add(new Car("Audi", "A3", "Grey",2018));
            return cars;
        }
    }

    public class App {
        public static void main(String[] args){
            showroom showroom = new Showroom();
            List<Car> cars = showroom.getCars();

            for (Car car : cars) {
                System.out.println(car.getDetails());
            }
        }
    }
}