package Lab22;

public class Rectangle extends GeometricObject{
    private double length;
    private double width;

    public Rectangle(){
        super();
    }

    public Rectangle(String color, boolean filled, double width, double length){
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    public double getArea() {
        return this.width * this.length;
    }

    public String toString(){
        return "Rectangle:\n" + super.toString() + ",\nWidth: " + this.width + ",\nLength: " + this.length + ",\nPerimeter: " + this.getPerimeter() + ",\nArea: " + this.getArea();
    }
}
