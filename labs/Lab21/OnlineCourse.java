package Lab21;

public class OnlineCourse extends Course{
    private double assignmentsScore;
    private double examScore;

    public OnlineCourse(){
        super();
    }

    public OnlineCourse(String courseName, int credits, double assignmentsScore, double examScore){
        super(courseName, credits);
        this.examScore = examScore;
        this.assignmentsScore = assignmentsScore;
    }

    public double getAssignmentsScore(){
        return this.assignmentsScore;
    }

    public void setAssignmentsScore(double assignmentsScore){
        this.assignmentsScore = assignmentsScore;
    }

    public double getExamScore(){
        return this.assignmentsScore;
    }

    public void setExamScore(double examScore){
        this.examScore = examScore;
    }

    public double calculateGrade() {
        return 0.4 * this.assignmentsScore + 0.6 * examScore;
    }

    public String toString(){
        return "Online Course:\n" + super.toString(true) + "\nAssignment Score = " + assignmentsScore + "\nExam Score = " + this.examScore + "\nFinal Grade = " + this.calculateGrade();
    }

    public boolean equals(Object o) {
        if(o instanceof OnlineCourse){
            OnlineCourse g = (OnlineCourse)o;
            return (super.equals(o) && this.assignmentsScore == g.assignmentsScore && this.examScore == g.examScore);
        } else return false;
    }
}
