public class Administrator extends Staff {
    private String office;
    private int managedStaff;

    public Administrator(int staffId,String name,double baseSalary,String office,int managedStaff){
        super(staffId,name,baseSalary);
        this.managedStaff = managedStaff;
        this.office = office;

    }
    @Override
    public double calculatePay(){
        double bonus = managedStaff *500;
        return super.calculatePay() +bonus;
    }

}
