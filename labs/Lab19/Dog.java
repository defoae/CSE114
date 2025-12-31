package Lab19;

public class Dog extends Animal{
    public Dog(String name, double age, double yearsAtShelter){
        super(name, age, yearsAtShelter);
    }

    public String toString(){
        return (this.getName() + ": " + super.toString(true));
    }
}
