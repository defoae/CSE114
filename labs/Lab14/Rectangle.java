package Lab14;

public class Rectangle {
    private double height = 1;
    private double width = 1;
    private String color = "blue";

    public Rectangle(){

    }

    public Rectangle(double h, double w, String c){
        height = h;
        width = w;
        color = c;
    }

    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public String getColor(){
        return color;
    }

    public void setHeight(double h){
        if(h > 0) height = h;
    }
    public void setWidth(double w){
        if(w > 0) width = w;
    }
    public void setColor(String c){
        if(!c.isEmpty()) color = c;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }
}
