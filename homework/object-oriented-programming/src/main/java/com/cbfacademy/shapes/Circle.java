
package shapes;

public class Circle implements Enclosure {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    @Override 
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
}
