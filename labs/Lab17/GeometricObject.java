package Lab17;

import java.util.Date;

public abstract class GeometricObject {
    private boolean filled = false;
    private String color = "white";
    private Date dateCreated;

    protected GeometricObject(){
        this.dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled){
        this();
        this.color = color;
        this.filled = filled;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public String getColor(){
        return this.color;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public void setColor(String color){
        this.color = color;
    }

    public abstract double getPerimeter();
    public abstract double getArea();

    public String toString(){
        return "Color: " + getColor() + ",\nFilled: " + isFilled() + ",\nDate Created: " + dateCreated;
    }
}