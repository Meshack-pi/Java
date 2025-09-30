public class EmployeeTest {
    public static void printEmployee(Employee emp){
            System.out.println();
            //print the data in this employee object
            System.out.println("Employee id: " + emp.getEmpId());
            System.out.println("Employee Name: " + emp.getName());
            System.out.println("Employee SSN: " + emp.getSsn());
            System.out.println("Employee Salary: " + emp.getSalary());
        }

    public static void main(String[] args) {
        // Create an Employee instance first (needed to create inner class instances)
        Employee emp = new Employee(100, "Base", "000-00-0000", 50000.0);
        // Create an instance of Engineer with the specified information
        Employee.Engineer engineer = emp.new Engineer(101, "Jane Smith", "012-34-5678", 120345.27);
        
        Employee.Manager manager = emp.new Manager(207, "Barbara Johnson", "054-12-2367", 109501.36, "US Marketing");
        Employee.Admin admin = emp.new Admin(304,"Bill Monroe", "108-23-6509",75002.34);
        Employee.Director director = emp.new Director(12, "Susan Wheeler", "099-45-2340", 120567.36,"Global Marketing",1000000);  
        // Display employee information
        manager.raiseSalary(4000.9);
        printEmployee(engineer);
        printEmployee(admin);
        printEmployee(director);
        printEmployee(manager);
    }
}
