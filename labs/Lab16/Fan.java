package Lab16;

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private int radius = 5;
    private String color = "blue";

    public Fan(){

    }

    public String getSpeed() {
        switch (this.speed){
            case 1: {
                return "Slow";
            }
            case 2: {
                return "Medium";
            }
            case 3: {
                return "Fast";
            }
            default:
                return "Unknown";
        }
    }

    public String getColor() {
        return this.color;
    }

    public int getRadius() {
        return this.radius;
    }

    public boolean getOn() {
        return this.on;
    }

    public void setSpeed(int speed){
        switch (speed){
            case 1:{
                this.speed = SLOW;
                break;
            }
            case 2: {
                this.speed = MEDIUM;
                break;
            }
            case 3: {
                this.speed = FAST;
                break;
            }
        }
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public void setOn(boolean on){
        this.on = on;
    }

    public String toString(){
        if(getOn()){
            return "Speed: " + getSpeed() + "\nRadius: " + getRadius() + "\nColor: "+getColor()+"\n";
        }
        else return "Radius: " + getRadius() + "\nColor: "+getColor() + "\nFan is off\n";
    }

    public static void main(String[] args){
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setColor("yellow");
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setSpeed(3);

        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setOn(false);
        fan2.setColor("blue");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }

    // Assign medium speed, radius 5, color blue, and turn it off to the second object.
}
