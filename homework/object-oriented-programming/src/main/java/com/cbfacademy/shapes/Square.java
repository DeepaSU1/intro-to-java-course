
package shapes;


public class Square implements Enclosure {
    private double width;

    public Square(double width){
        this.width = width;
    }

    @Override
    public double perimeter(){
        return 4 * width;
    }

    @Override
    public double area(){
        return Math.pow(width, 2);
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(){
        this.width = width;
    }
}