public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary){
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }
    public class Engineer extends Employee{
        public Engineer(int empId,String name,String ssn,double salary){
            super(empId, name, ssn, salary);
        }
    }
    public class Admin extends Employee{
        public Admin(int empId,String name,String ssn, double salary){
            super(empId,name,ssn,salary);
        }
    }

    public class Manager extends Employee{
        //Manager attributes
        private String deptName;
        //constructor
        public Manager(int empId, String name, String ssn, double salary, String deptName){
            super (empId,name,ssn,salary);
            this.deptName = deptName;
        }
        //getter method
        public String getDeptName(){
            return deptName;
        }
    }
    
    public class Director extends Manager{
        //director attribute
        private double budget;
        //constructor
        public Director(int empId, String name, String ssn, double salary, String deptName,double budget){
            super(empId, name, ssn, salary, deptName);
            this.budget = budget;
        }
        //getter method
        public double getBudget(){
            return budget;
        }
    }


    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }


    public String getSsn() {
        return ssn;
    }
    public void raiseSalary(double increase){
        salary +=increase;
    }

}