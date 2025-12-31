package Lab17;

public class Student extends Person{
    // - A student has a class status (freshman, sophomore, junior, or senior - define these various statuses as constants).
    private final static int freshman = 1;
    private final static int sophomore = 2;
    private final static int junior = 3;
    private final static int senior = 4;
    private String status;

    public Student(int classStatus, String name, String address, String phoneNum, int age, String email){
        super(name, address, phoneNum, age, email);
        switch(classStatus){
            case 1:{
                this.status = "Freshman";
                break;
            }
            case 2:{
                this.status = "Sophomore";
                break;
            }
            case 3:{
                this.status = "Junior";
                break;
            }
            case 4:{
                this.status = "Senior";
                break;
            }
        }
    }

    public String toString(){
        return "Class Name: Student,\n" + "Status: "+this.status + ",\n" + super.toString();
    }
}