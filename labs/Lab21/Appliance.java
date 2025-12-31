package Lab21;

public abstract class Appliance {
    private String brand;
    private String modelNumber;

    public Appliance(){

    }

    public Appliance(String brand, String modelNumber){
        this.brand = brand;
        this.modelNumber = modelNumber;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModeNumber(){
        return this.modelNumber;
    }

    public void setModelNumber(String modelNumber){
        this.modelNumber = modelNumber;
    }

    public abstract double annualEnergyUse();

    public String toString(){
        return "Appliance:\nbrand = " + this.getBrand() + "\nModel Number = " + this.getModeNumber();
    }

    public String toString(boolean calledByChild){
        if(calledByChild)
            return "Brand = " + this.getBrand() + "\nModel Number = " + this.getModeNumber();
        else
            return null;
    }

    public boolean equals(Object o){
        if(o instanceof Appliance){
            Appliance g = (Appliance)o;
            return (g.getModeNumber().equals(this.getModeNumber()) && g.getBrand().equals(this.getBrand()));
        }
        else return false;
    }

    public static void main(String[] args){
        Appliance o1 = new WashingMachine();
        Appliance o2 = new WashingMachine("Samsung", "AE123", 5, 1);

        System.out.println(o1);
        System.out.println();
        System.out.println(o2);
        System.out.println();
        System.out.println(o1.equals(o2));
    }
}
