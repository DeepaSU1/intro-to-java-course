
package shapes;

import java.util.List;
import java.util.ArrayList;


public class Shapes {
    public static double computerArea(List<Enclosure> enclosures){
        double totalArea = 0;
        for (Enclosure enclosure : enclosures){
            totalArea += enclosure.area();
        }
        return totalArea;
    }

    public static double computerPerimeter(List<Enclosure> enclosures){
        double totalPerimeter = 0;
        for (Enclosure enclosure : enclosures){
            totalPerimeter += enclosure.perimeter();
        }
        return totalPerimeter;
    }

    public static void main(String[] args){
        List<Enclosure> shapes = new ArrayList<>();
        shapes.add(new Square(20));
        shapes.add(new Square(4));
        shapes.add(new Square(12));
        shapes.add(new Circle(15));
        shapes.add(new Circle(10));
        shapes.add(new Circle(5));

        double totalArea = computerArea(shapes);
        double totalPerimeter = computerArea(shapes);

        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter " + totalPerimeter);
    }
}