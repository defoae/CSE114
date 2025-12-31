package Lab19;

public class Cat extends Animal{
    public Cat(String name, double age, double yearsAtShelter){
        super(name, age, yearsAtShelter);
    }

    public String toString(){
        return (this.getName() + ": " + super.toString(true));
    }
}
