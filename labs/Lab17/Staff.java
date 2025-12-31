package Lab17;

public class Staff extends Employee{
    private String title;
    private MyDate dateHired;

    public Staff(String title, int day, int month, int year, String name, String address, String phoneNum, int age, String email){
        super(name, address, phoneNum, age, email);
        this.title = title;
        this.dateHired = new MyDate(day, month, year);
    }

    public String getTitle(){
        return this.title;
    }

    public String getDateHired(){
        return this.dateHired.toString();
    }

    public String toString(){
        return "Class Name: Staff,\n" + getDateHired() + ",\nTitle: " + getTitle() + ",\n" + super.toString(true);
    }
}
