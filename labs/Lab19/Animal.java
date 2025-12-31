package Lab19;

// The superclass Animal should also contain the fields:
// a String name, a double age, and a double yearsAtShelter,
// and getter and setter methods for all of these fields. The fields should also be printed out in a toString() method. 
public class Animal {
    private String name;
    private double age;
    private double yearsAtShelter;

    protected Animal(String name, double age, double yearsAtShelter){
        this.name = name;
        this.age = age;
        this.yearsAtShelter = yearsAtShelter;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(double age){
        this.age = age;
    }

    public void setYearsAtShelter(double yearsAtShelter){
        this.yearsAtShelter = yearsAtShelter;
    }

    public String getName(){
        return this.name;
    }

    public double getAge(){
        return this.age;
    }

    public double getYearsAtShelter(){
        return this.yearsAtShelter;
    }

    public String toString(){
        return "Animal: " + this.age + " years old, " + this.yearsAtShelter + " years at shelter";
    }

    public String toString(boolean calledByChild) {
        return (this.age + " years old, " + this.yearsAtShelter + " years at shelter");
    }
}
