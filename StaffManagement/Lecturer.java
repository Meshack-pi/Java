public class Lecturer extends Staff{
    private String department;
    private int numberOfCourses;
    public Lecturer(int staffId,String name, double baseSalary,String department,int numberOfCourses){
        super(staffId,name,baseSalary);
        this.department = department;
        this.numberOfCourses = numberOfCourses;
    }
    @Override
    public double calculatePay(){
        //base salary should be a bonus of 1000 per course a lecturere teaches
        double bonus = numberOfCourses*1000;
        return super.calculatePay()+bonus;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("The number of courses you teah is: "+numberOfCourses);
        System.out.println("Department taught is: "+department);
    }
}
