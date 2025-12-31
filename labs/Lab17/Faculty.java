package Lab17;

public class Faculty extends Employee{
    private String officeHours;
    private int rank;
    private MyDate dateHired;

    public Faculty(String officeHours, int rank, int day, int month, int year, String name, String address, String phoneNum, int age, String email){
        super(name, address, phoneNum, age, email);
        this.officeHours = officeHours;
        if (rank <= 10 && rank >= 1){
            this.rank = rank;
        }
        this.dateHired = new MyDate(day, month, year);
    }

    public String getOfficeHours(){
        return this.officeHours;
    }

    public String getDateHired(){
        return this.dateHired.toString();
    }

    public int salaryRange(){
        int years = 2025 - this.dateHired.getYear();
        if (rank*years<10)
            return 1;
        else if (10 <= rank*years && rank*years < 20)
            return 2;
        else if (20 <= rank*years)
            return 3;
        else return -1;
    }

    public String toString(){
        return "Class Name: Faculty,\n" +getDateHired() + ",\nOffice Hours: "+ getOfficeHours()+ ",\nSalary Range: " + salaryRange() + ",\n" + super.toString(true);
    }
}
