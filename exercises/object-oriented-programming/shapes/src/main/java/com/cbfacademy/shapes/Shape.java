
package com.cbfacademy.shapes;

public abstract class Shape {
    public abstract double getArea();
    protected String name;
    
    public String getName(){
        return this.name;
    }
}


//   class Paint {
//     private double coverage;

//     public Paint(double coverage){
//         this.coverage = coverage;
//     }

//     public double getAmount(Shape shape){
//         double area = shape.getArea();
//         return area/coverage;
//     }
// }



