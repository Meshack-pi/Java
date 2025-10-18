

interface A{
    void show();//by default it is public abstract
    void config();// no need to state public abstract
    int age = 44; //every variable by default are final and static
    String area= "Nairobi"; //we have to change
}
class B implements A{
    public void show(){
        System.out.println("Inside show");
    }
    public void config(){
        System.out.println("Inside the config");
    }
}
public class InterFace {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.config();
        obj.show();
        A.age = 34;
        System.out.println(A.age);
    }
}
