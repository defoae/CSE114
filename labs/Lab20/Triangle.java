package Lab20;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if(side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1)
            throw new IllegalTriangleException("In a triangle, the sum of any two sides should be greater than the other side");
        else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    public static void main(String[] args){
       try{
           Triangle triangle = new Triangle(10, 2, 3);
       } catch (IllegalTriangleException e){
           System.out.println(e.toString());
       }
    }
}
