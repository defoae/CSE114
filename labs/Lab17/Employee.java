package Lab17;

public class Employee extends Person {
    //- An employee has an salary and date-hired of type MyDate.
    // Define separately a class named MyDate.java that contains the fields year, month, and day.
    private int salary;
    private MyDate dateHired;

    protected Employee(int salary, int day, int month, int year, String name, String address, String phoneNum, int age, String email){
        super(name, address, phoneNum, age, email);
        this.dateHired = new MyDate(day, month, year);
        this.salary = salary;
    }

    protected Employee(String name, String address, String phoneNum, int age, String email){
        super(name, address, phoneNum, age, email);
    }

    public int getSalary(){
        return this.salary;
    }

    public String getDateHired(){
        return this.dateHired.toString();
    }

    public String toString(){
        return "Class Name: Employee,\n" + getDateHired() + ",\nSalary: "+ getSalary()+ ",\n" + super.toString();
    }

    public String toString(boolean needPersonMethod){
        return getDateHired() + ",\n" + super.toString();
    }
}
