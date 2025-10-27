public class Staff {
    private int staffId;
    private String name;
    private double baseSalary;

    public Staff(int staffId,String name,double baseSalary){
        this.staffId= staffId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public int getStaffId(){
        return staffId;
    }
    public String getStaffName(){
        return name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public void setStaffName(String name){
        this.name = name;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    public void setStaffId(int staffId){
        this.staffId = staffId;
    }
    public double calculatePay(){
        return this.baseSalary;
    }
    public void displayInfo(){
        System.out.println("Staff name: "+getStaffName());
        System.out.println("Staff ID: "+getStaffId());
        System.out.println("Base salary is: "+getBaseSalary());
    }
    public void displayInfo(boolean showSalary){
        System.out.println("Staff name: "+getStaffName());
        System.out.println("Staff ID: "+getStaffId());
        if(showSalary){
            System.out.println("Base salary is: "+getBaseSalary());
        } else{
            System.out.println("Salary details are hidden.");
        }
    }
}
