public class Main {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not allowed! Age < 18");
        } else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
