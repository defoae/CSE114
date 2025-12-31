package Lab16;

public class Lamp {
    final static int DIM = 1;
    final static int NORMAL = 2;
    final static int BRIGHT = 3;
    private int brightness = NORMAL;
    private boolean on = false;
    private int height = 12;
    private String color = "blue";

    public Lamp(){

    }

    public int getHeight() {
        return this.height;
    }

    public String getColor() {
        return this.color;
    }

    public String getBrightness() {
        switch (this.brightness){
            case 1: {
                return "Dim";
            }
            case 2: {
                return "Normal";
            }
            case 3: {
                return "Bright";
            }
            default:
                return "Unknown";
        }
    }

    public boolean getOn() {
        return this.on;
    }

    public void setBrightness(int brightness){
        switch (brightness){
            case 1:{
                this.brightness = DIM;
            }
            case 2: {
                this.brightness= NORMAL;
            }
            case 3: {
                this.brightness = BRIGHT;
            }
        }
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setOn(boolean on){
        this.on = on;
    }

    public String toString(){
        if(getOn()){
            return "Brightness: " + getBrightness() + "\nHeight: " + getHeight() + "\nColor: "+ getColor() + "\n";
        }
        else return "Height: " + getHeight() + "\nColor: "+ getColor() + "\nLamp is off\n";
    }

    public static void main(String[] args){
        Lamp lamp1 = new Lamp();
        Lamp lamp2 = new Lamp();

        // For the first lamp, assign BRIGHT brightness, height 20, color "gold", and turn it on.
        //
        //For the second lamp, assign DIM brightness, height 10, color "silver", and turn it off.

        lamp1.setBrightness(3);
        lamp1.setHeight(20);
        lamp1.setColor("gold");
        lamp1.setOn(true);

        lamp2.setBrightness(1);
        lamp2.setHeight(10);
        lamp2.setColor("silver");
        lamp2.setOn(false);

        System.out.println(lamp1.toString());
        System.out.println(lamp2.toString());
    }
}
