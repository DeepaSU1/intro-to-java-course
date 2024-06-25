
package com.cbfacademy;

public class Dogs{
    String breed;
    String size;
    int age;
    String color;

    public Dogs(String inputBreed, String inputSize, int inputAge, String inputColor){
        breed = inputBreed;
        size = inputSize;
        age = inputAge;
        color = inputColor;
    }

    public void eat(){
        System.out.println(breed + " is eating.");
    }

    public void run(){
        System.out.println(breed + " is running.");
    }

    public void sit(){
        System.out.println(breed + " is sitting.");
    }

    public void sleep(){
        System.out.println(breed + " is sleeping.");
    }

    public String toString(){
        return "This dog is " + breed + " , size is " + size + " , age is " + age + " and color is " + color;
    }

    public static void main(String[] args){
        Dogs dog1 = new Dogs("Beagle", "Medium", 5,"Brown");
        Dogs dog2 = new Dogs("Sausage", "Medium", 7, "Black");
        Dogs dog3 = new Dogs("Labrador", "Large", 3, "Yellow");

        dog1.eat();
        dog1.sit();
        dog1.sleep();
        dog1.run();

        dog2.eat();
        dog2.sleep();

        dog3.run();
        dog3.sit();

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        
    }

}