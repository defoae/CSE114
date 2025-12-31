package Lab17;

public class TestPerson {
    public static void main(String[] args){
        Person employee = new Employee(100000, 12, 5, 2008, "John Doe", "Stony Brook, NY", "+12345678", 47, "email@sbu");
        Person student = new Student(1, "Dinmukhamed", "Wagner Hall, Stony Brook", "+77019583135", 17, "madiyar@gmail.com");
        Employee faculty = new Faculty("Monday 2pm-4pm", 10, 2, 5, 1998, "Walter White", "Engineering Bldg.", "(631)5678", 67, "prof@yahoo.com");
        Employee staff = new Staff("Vice President", 26, 9, 2007, "Jane Doe", "Humanities Bldg.", "+1 632 1223", 55, "jd@mail.ru");

        print(employee);
        print(staff);
        print(student);
        print(faculty);
    }

    public static void print(Person o){
        if(o instanceof Faculty){
            System.out.println( ((Faculty)o).toString() );
            System.out.println();
        }
        else if(o instanceof Staff){
            System.out.println( ((Staff)o).toString() );
            System.out.println();
        }
        else if(o instanceof Employee){
            System.out.println( ((Employee)o).toString() );
            System.out.println();
        }
        else if(o instanceof Student){
            System.out.println( ((Student)o).toString() );
            System.out.println();
        }
    }
}
