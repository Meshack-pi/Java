//inner class a class within a class

class A{
    //a class will be used for only that purpose
    int age;
    public void show(){
        System.out.println("Inside show");
    }
    static class B{
        public void config(){
            System.out.println("Insidde config");
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = new A.B();
        //A.B only works when the class B is static
        obj1.config();
    }
   
}
