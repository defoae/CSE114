package Lab19;

public class Employee {
    private String name;
    private String ID;

    public Employee(String name, String id){
        this.name = name;
        this.ID = id;
    }

    public String getName(){
        return this.name;
    }

    public String getID(){
        return this.ID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setID(String id){
        this.ID = id;
    }

    public String toString(){
        return "Employee -> Name: " + this.name + ", ID: " + this.ID;
    }
}
