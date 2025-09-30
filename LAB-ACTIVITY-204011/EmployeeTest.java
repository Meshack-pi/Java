public class  EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.setEmployeeId(39);
        e1.setSalary(3000);
        e1.setSocialSecurityNumber(29292);
        e1.setEmployeeName("James Mwangi");
        e2.setEmployeeId(39);
        e2.setSalary(3000);
        e2.setSocialSecurityNumber(29292);
        e2.setEmployeeName("James Mwangi");
        e1.displayEmployeeInfo();
        e2.displayEmployeeInfo();
    }
}
