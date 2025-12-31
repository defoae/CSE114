package Lab14;

public class TestRectangle {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(40, 4, "red");
        Rectangle r2 = new Rectangle(35.9, 3.5, "red");

        System.out.println("Rectangle 1 properties: ");
        System.out.println(r1.getWidth());
        System.out.println(r1.getHeight());
        System.out.println(r1.getColor());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());
        System.out.println();
        System.out.println("Rectangle 2 properties: ");
        System.out.println(r2.getWidth());
        System.out.println(r2.getHeight());
        System.out.println(r2.getColor());
        System.out.println(r2.getPerimeter());
        System.out.printf("%.1f", r2.getArea());
    }
}
