public class Circle2D {
    private double x = 0;
    private double y = 0;
    private double radius = 1;

    public Circle2D(){

    }

    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public boolean contains(double x, double y){
        double distance = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
        return distance <= radius;
    }

    public boolean contains(Circle2D circle){
        double distance = Math.sqrt(Math.pow((circle.getX() - this.x), 2) + Math.pow((circle.getY() - this.y), 2));
        return distance + circle.radius <= this.radius;
    }

    public static void main(String[] args){
        Circle2D c1 = new Circle2D(2,2, 5.5);
        System.out.printf("%.2f\n", c1.getArea());
        System.out.printf("%.2f\n",c1.getPerimeter());
        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
    }
}
