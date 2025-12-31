package Lab18;

public abstract class Vehicle {
    private String ownerName;
    private int numOfWheels;

    protected Vehicle(String ownerName, int numOfWheels){
        this.ownerName = ownerName;
        this.numOfWheels = numOfWheels;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public int getNumOfWheels(){
        return this.numOfWheels;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public void setNumOfWheels(int numOfWheels){
        this.numOfWheels = numOfWheels;
    }

    public String toString(){
        return "Vehicle with properties\n" + "Number of wheels: " + this.numOfWheels + "\nOwner Name: " + this.ownerName;
    }

    public String toString(boolean usedByChild){
        if(usedByChild){
            return "Number of wheels: " + this.numOfWheels + "\nOwner Name: " + this.ownerName;
        }
        return "";
    }

    public boolean equals(Object o){
        if(o instanceof Vehicle){
            Vehicle b = (Vehicle)o;
            return (b.ownerName).equals(this.ownerName) && this.numOfWheels == b.numOfWheels;
        }
        else return false;
    }

    public static void main(String[] args){
        Vehicle bicycle1 = new Bicycle("Max", 2);
        Vehicle bicycle2 = new Bicycle("Ethan", 3);
        Vehicle motorizedVehicle1 = new MotorizedVehicle("Lawrence", 4, 2);
        Vehicle motorizedVehicle2 = new MotorizedVehicle("Jane", 6, 5);

        System.out.println(bicycle1.toString());
        System.out.println(motorizedVehicle2.toString());

        System.out.println(bicycle1.equals(bicycle2));
        System.out.println(motorizedVehicle1.equals(motorizedVehicle2));

        bicycle1.setNumOfWheels(3);
        bicycle1.setOwnerName("Ethan");

        System.out.println(bicycle1.equals(bicycle2));
    }
}
