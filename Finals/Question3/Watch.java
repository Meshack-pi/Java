import java.time.LocalDate;
public class Watch {
    private String name;
    private String type;
    private static final int year = LocalDate.now().getYear();
    private int yom;
    public Watch(String name){
        this.name = name;
    }
    public Watch(String name,int yom){
        this.name = name;
        this.yom = yom;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setYom(int yom){
        this.yom = yom;
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public int getAge(){
        return (year-this.yom);
    }
    public void showDetails(){
        System.out.println("Watch name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Watch Type: "+getType());
    }
}
