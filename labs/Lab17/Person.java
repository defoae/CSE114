package Lab17;

public abstract class Person {
    //A person has a name, address, phone number, age and email address and implement a method getAge():int.
    private String name;
    private String address;
    private String phoneNum;
    private int age;
    private String email;

    protected Person(){

    }

    protected Person(String name, String address, String phoneNum, int age, String email){
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.age = age;
        this.email = email;
    }

    public int getAge(){
        return this.age;
    }

    public String toString(){
        return "Name: " + this.name + ",\nAddress: " + this.address + ",\nPhone Number: "+ this.phoneNum + ",\nAge: " + this.age + ",\nEmail: " + this.email;
    }
}
