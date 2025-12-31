package Lab18;

public class Bicycle extends Vehicle{
    public Bicycle(String ownerName, int numOfWheels) {
        super(ownerName, numOfWheels);
    }

    @Override
    public String toString(){
        return "Bicycle with properties\n" + super.toString(true) + "\n";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}