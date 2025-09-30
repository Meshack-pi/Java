public class Student {
    private int studentId;
    private String studentName;
    private String courseName;
    private char grade;
    Student(){
        studentId = 204011;
        studentName = "FULL NAME";
        courseName = "COMPUTER SCIENCE";
        grade =  'A';
    }
    //public getter methods
    public int getStudentId(){
        return studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public String getCourseName(){
        return courseName;
    }
    public char getGrade(){
        return grade;
    }
    //public setter methods
    void setStudentId(int Idnumber){
        studentId= Idnumber;
    }
    void setGrade(char StudentGrade){
        grade = StudentGrade;
    }
    void setCourseName(String course){
        courseName = course;
    }
    void setStudentName(String name){
        studentName = name;
    }
    void displayInfo(){
        System.out.println("Name: "+ getStudentName());
        System.out.println("Course: "+ getCourseName());
        System.out.println("Name: "+ getGrade());
        System.out.println("Name: "+ getStudentId());
    }
}
