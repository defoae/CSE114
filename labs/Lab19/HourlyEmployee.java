package Lab19;

public class HourlyEmployee extends Employee{
    private double hours;
    private double wage;

    public HourlyEmployee(String name, String ID, double hours, double wage){
        super(name, ID);
        this.hours = hours;
        this.wage = wage;
    }

    public void setHours(double hours){
        this.hours = hours;
    }

    public void setwWge(double wage){
        this.wage = wage;
    }

    public double getHours(){
        return this.hours;
    }

    public double getWage(){
        return this.wage;
    }

    public double earnings(){
        return this.hours * this.wage;
    }

    public String toString(){
        return super.toString() + ", Hours: " + this.getHours() + ", Wage: " + this.getWage() + "/hr, Earnings: " + this.earnings() + "$ a week";
    }
}
