package Lab21;

public abstract class Course {
    private String courseName;
    private int credits;

    public Course(){

    }

    public Course(String courseName, int credits){
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getName(){
        return this.courseName;
    }

    public void setName(String courseName){
        this.courseName = courseName;
    }

    public int getCredits(){
        return this.credits;
    }

    public void setCredits(int credits){
        this.credits = credits;
    }

    public abstract double calculateGrade();

    public String toString(){
        return "Course: " + "\nName = " + this.courseName + "\nCredits = " + this.credits;
    }

    public String toString(boolean calledByChild){
        if(calledByChild)
            return "Name = " + this.courseName + "\nCredits = " + this.credits;
        else return null;
    }

    public boolean equals(Object o){
        if(o instanceof Course){
            Course g = (Course)o;
            return (g.credits == this.credits && g.courseName.equals(this.courseName));
        }
        else return false;
    }

    public static void main(String[] args){
        Course o1 = new OnlineCourse();
        Course o2 = new OnlineCourse("LIN200", 3, 100, 100);

        System.out.println(o1);
        System.out.println();
        System.out.println(o2);
        System.out.println();
        System.out.println(o1.equals(o2));
    }
}