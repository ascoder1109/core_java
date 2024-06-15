import java.util.spi.AbstractResourceBundleProvider;

public class Abstraction {
    public static void main(String[] args) {

    }
}

abstract class Shape{
    String color;
    abstract double area();

}

class Rectangle extends Shape{
    double length;

    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }
}

void main(){
    Rectangle rectangle = new Rectangle(5, 10);
    System.out.println(rectangle.area());
}