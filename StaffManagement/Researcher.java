public class Researcher extends Staff implements Researchable {
    private int numberOfPublications;
    private String fieldOfStudy;
    public Researcher(int staffId,String name,double salary,int numberOfPublications,String fieldOfStudy){
        super(staffId, name, salary);
        this.numberOfPublications = numberOfPublications;
        this.fieldOfStudy = fieldOfStudy;
    }
    @Override
    public void conductResearch(String topic) {
        System.out.println("Conducting a research on: "+ topic);
    }
    @Override
    public double calculateGrant(double baseGrant){
        return baseGrant + (numberOfPublications*200);
    }
    @Override
    public double calculatePay(){
        double bonus = numberOfPublications *200;
        return super.calculatePay() + bonus;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Field of study: "+fieldOfStudy);
        System.out.println("Publications: "+numberOfPublications);
    }
    public void setNumberOfPublications(int numberOfPublications){
        this.numberOfPublications = numberOfPublications;
    }
    public int getNumberOfPublications(){
        return numberOfPublications;
    }
    
}
