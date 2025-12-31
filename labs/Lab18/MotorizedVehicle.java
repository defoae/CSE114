package Lab18;

public class MotorizedVehicle extends Vehicle{
    private double engineVolumeDisplacement;

    public MotorizedVehicle(String ownerName, int numOfWheels, int engineVolumeDisplacement){
        super(ownerName, numOfWheels);
        this.engineVolumeDisplacement = engineVolumeDisplacement;
    }

    public int getHorsepower(){
        return (int)(this.engineVolumeDisplacement * this.getNumOfWheels());
    }

    @Override
    public String toString(){
        return "Motorized Vehicle with properties\n" + super.toString(true) +
                "\nEngine Volume Displacement: " + engineVolumeDisplacement + "\nHorsepower: "+ this.getHorsepower()+ "\n";
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof MotorizedVehicle){
            MotorizedVehicle b = (MotorizedVehicle)o;
            return b.getHorsepower() == this.getHorsepower() && super.equals(o);
        }
        else return false;
    }
}
