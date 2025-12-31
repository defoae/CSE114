package Lab22;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(){
        super();
    }

    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public String toString(){
        return "Circle:\n" + super.toString() + ",\nRadius: " + this.radius + ",\nPerimeter: " + this.getPerimeter() + ",\nArea: " + this.getArea();
    }
}
