package Lab17;

public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }
    public double getArea(){
        double s = this.getPerimeter() / 2;
        return Math.sqrt(s * (s-this.side1) * (s-this.side2) * (s-this.side3));
    }
    public String toString(){
        return "Triangle with properties\nSide1: " + this.side1 + ",\nSide2: " + this.side2 + ",\nSide3: " + this.side3 + ",\nPerimeter: "+ getPerimeter() +",\nArea: " + getArea() +",\n" + super.toString();
    }

    public static void main(String[] args) {
        GeometricObject triangle = new Triangle("yellow", true, 1, 1.5, 1);
        System.out.println(triangle.toString());
    }
}
