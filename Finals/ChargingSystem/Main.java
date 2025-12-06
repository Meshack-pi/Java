import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int gadget;
        Phone p = new Phone();
        p.charge();
        Laptop l = new Laptop();
        l.charge();
        SmartWatch s = new SmartWatch();
        s.charge();
        Scanner in = new Scanner(System.in);
        System.out.println("What gadget do you have: ");
        gadget = in.nextInt();
        switch(gadget){
            case 1:
                p.charge();
                break;
            case 2:
                s.charge();
                break;
            case 3:
                l.charge();
            default:
                System.out.println("Invalid input!");

        }
    }
}
