package Lab22;

import java.util.Date;
import java.util.ArrayList;

public abstract class GeometricObject implements Comparable, Cloneable{
    private boolean filled = false;
    private String color = "white";
    private Date dateCreated;

    protected GeometricObject() {
        this.dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled) {
        this();
        this.color = color;
        this.filled = filled;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public String toString() {
        return "Color: " + getColor() + ",\nFilled: " + isFilled() + ",\nDate Created: " + dateCreated;
    }

    public int compareTo(Object o) {
        if(o instanceof GeometricObject){
            GeometricObject g = (GeometricObject)o;
            double area1 = this.getArea();
            double area2 = g.getArea();
            if(area1 < area2) return -1;
            else if(area1 == area2) return 0;
        }
        return 1;
    }

    public static Object max(GeometricObject o1, GeometricObject o2){
        if(o1.compareTo(o2) < 0)
            return o2;
        else
            return o1;
    }

    public Object clone(){
        try{
            GeometricObject h = (GeometricObject)(super.clone());
            h.dateCreated = (Date)(this.dateCreated.clone());
            return h;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static void main(String[] args){
        Circle circle1 = new Circle();
        Circle circle2 = new Circle("Red", true, 1);
        Circle circle3 = new Circle("Blue", false, 2);
        Circle circle4 = new Circle("Yellow", true, 3);
        Circle circle5 = new Circle("Purple", false, 4);
        Circle circle6 = (Circle)(circle2.clone());
        Circle circle7 = (Circle)(circle4.clone());
        Circle circle8 = new Circle("Black", true, 7);
        Circle circle9 = (Circle)(circle6.clone());
        Circle circle10 = new Circle("White", false, 10);
        Square square1 = new Square();
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = (Rectangle)(rectangle1.clone());
        Rectangle rectangle3 = new Rectangle("Red", true, 2, 3);
        Rectangle rectangle4 = new Rectangle("White", true, 4, 5);
        Rectangle rectangle5 = (Rectangle)(rectangle3.clone());
        Rectangle rectangle6 = new Rectangle("Brown", false, 10, 35);
        Rectangle rectangle7 = (Rectangle)(rectangle4.clone());
        Rectangle rectangle8 = new Rectangle();
        Rectangle rectangle9 = new Rectangle("Blue", false, 8, 9);
        Rectangle rectangle10 = new Rectangle();

        ArrayList<GeometricObject> objects = new ArrayList<>();
        objects.add(circle1);
        objects.add(square1);
        objects.add(rectangle1);
        for(GeometricObject o : objects){
            if(o instanceof Colorable)
                ((Colorable)o).howToColor();
        }
        objects.remove(square1);

        objects.add(circle2);
        objects.add(circle3);
        objects.add(circle4);
        objects.add(circle5);
        objects.add(circle6);
        objects.add(circle7);
        objects.add(circle8);
        objects.add(circle9);
        objects.add(circle10);

        objects.add(rectangle2);
        objects.add(rectangle3);
        objects.add(rectangle4);
        objects.add(rectangle5);
        objects.add(rectangle6);
        objects.add(rectangle7);
        objects.add(rectangle8);
        objects.add(rectangle9);
        objects.add(rectangle10);

        GeometricObject temp = objects.getFirst();
        for(GeometricObject o : objects){
            if(GeometricObject.max(temp, o) == o){
                temp = o;
            }
        }
        System.out.println(temp);
    }
}