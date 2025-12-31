package Lab22;

public class Square extends GeometricObject implements Colorable{
    private double side;

    public Square(){
        super();
    }

    public Square(String color, boolean filled, double side){
        super(color, filled);
        this.side = side;
    }

    public double getPerimeter() {
        return this.side * 4;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public void howToColor() {
        System.out.println("Fill in the square");
    }

    public String toString(){
        return "Square:\n" + super.toString() + ",\nSide: " + this.side + ",\nPerimeter: " + this.getPerimeter() + ",\nArea: " + this.getArea();
    }
}
