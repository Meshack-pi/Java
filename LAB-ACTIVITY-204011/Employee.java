public class Employee {
    private int employeeId;
    private String employeeName;
    private int socialSecurityNumber;
    private double salary;
    //constructor
    Employee(){
        employeeId = 0;
        employeeName = "FULL NAME";
        socialSecurityNumber = 1234;
        salary = 0.00;
    }
    //public getter methods
    public int getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public int getSocialSecurityNumber(){
        return socialSecurityNumber;
    }
    public double getSalary(){
        return salary;
    }

    //public setter methods
    void setEmployeeId(int EmployeeId){
        employeeId = EmployeeId;
    }
    void setEmployeeName(String Name){
        employeeName = Name;
    }
    void setSocialSecurityNumber(int SSN){
        socialSecurityNumber = SSN;
    }
    void setSalary(double Salary){
        salary = Salary;
    }
    //Method to display all employee details
    void displayEmployeeInfo(){
        System.out.println("Here are the employee details: ");
        System.out.println("Name: "+ getEmployeeName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Social Security Number: "+ getSocialSecurityNumber());
        System.out.println("Salary: "+ getSalary());
    }
}
