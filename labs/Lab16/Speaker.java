package Lab16;

public class Speaker {
    final static int LOW = 1;
    final static int MEDIUM = 2;
    final static int HIGH = 3;
    private int volume = LOW;
    private boolean on = false;
    private int power = 15;
    private String brand = "Stony";

    public Speaker(){

    }

    public int getPower() {
        return this.power;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getVolume() {
        switch (this.volume){
            case 1: {
                return "Low";
            }
            case 2: {
                return "Medium";
            }
            case 3: {
                return "High";
            }
            default:
                return "Unknown";
        }
    }

    public boolean getOn() {
        return this.on;
    }

    public void setVolume(int volume){
        switch (volume){
            case 1:{
                this.volume = LOW;
            }
            case 2: {
                this.volume= MEDIUM;
            }
            case 3: {
                this.volume = HIGH;
            }
        }
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setPower(int power){
        this.power = power;
    }

    public void setOn(boolean on){
        this.on = on;
    }

    public String toString(){
        if(getOn()){
            return "Volume: " + getVolume() + "\nPower: " + getPower() + "\nBrand: "+ getBrand() + "\n";
        }
        else return "Power: " + getPower() + "\nBrand: "+ getBrand() + "\nSpeaker is off\n";
    }

    public static void main(String[] args) {
        // For the first speaker, assign HIGH volume, power 40, brand "Bose", and turn it on.
        //
        //For the second speaker, assign MEDIUM volume, power 20, brand "JBL", and turn it off.

        Speaker speaker1 = new Speaker();
        Speaker speaker2 = new Speaker();

        speaker1.setBrand("Bose");
        speaker1.setOn(true);
        speaker1.setVolume(3);
        speaker1.setPower(40);

        speaker2.setBrand("JBL");
        speaker2.setOn(false);
        speaker2.setVolume(2);
        speaker2.setPower(20);

        System.out.println(speaker1.toString());
        System.out.println(speaker2.toString());
    }
}
