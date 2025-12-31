package Lab21;

public class WashingMachine extends Appliance{
    private double capacity;
    private double powerConsumption;

    public WashingMachine(){
        super();
    }

    public WashingMachine(String brand, String modelNumber, double capacity, double powerConsumption){
        super(brand, modelNumber);
        this.capacity = capacity;
        this.powerConsumption = powerConsumption;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public void setCapacity(double capacity){
        this.capacity = capacity;
    }

    public double getPowerConsumption(){
        return this.powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption){
        this.powerConsumption = powerConsumption;
    }

    public double annualEnergyUse(){
        return powerConsumption * 200;
    }

    public String toString(){
        return "Washing Machine:\n" + super.toString(true) + "\nCapacity = " + this.getCapacity() + "\nPower Consumption = " + this.getPowerConsumption();
    }

    public boolean equals(Object o) {
        if(o instanceof WashingMachine){
            WashingMachine g = (WashingMachine)o;
            return (super.equals(g) && g.getPowerConsumption() == this.getPowerConsumption() && g.getCapacity() == this.getCapacity());
        }
        else return false;
    }
}
