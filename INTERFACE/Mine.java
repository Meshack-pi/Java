abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("The car is playing music");
    
    }
}
abstract class WagonR extends Car{
    //if you extend the car class you must implement the abstract method
    public void drive(){
        System.out.println("Drive wagonR");
    }
}
class UpdatedWagonR extends WagonR{ //this is a concrete class (A class that extends an abstract subclass)
    public void fly(){
        System.out.println("Fly UpdatedWagonR");
    }

}
//You cannot create objects from an abstract class if you want to create an object of an abstract class
//You must create a concrete class
public class Mine {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();
        obj.drive();    
        obj.playMusic();
        obj.fly();
        
    }
}
