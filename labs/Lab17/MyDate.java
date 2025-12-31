package Lab17;

public class MyDate {
    private int year = 2025;
    private int month = 10;
    private int day = 1;

    public MyDate(){

    }

    public MyDate(int day, int month, int year){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }
    public int getDay(){
        return this.day;
    }

    public String toString(){
        return "Date Hired: "+getMonth()+"/"+getDay()+"/"+getYear();
    }
}
