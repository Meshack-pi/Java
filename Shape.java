public class Shape {
    //attributes
    private String color;

    //constructor
    public Shape(){
        color = "Red color";
    }
    //overloaded method
    public Shape(String c){
        color = c;
    }
    public double findPerimeter(){
        return 0.00;
    }
    class Triangle extends Shape{
        private double base, height;
        public double findPerimeter(){
            return 0.5*base*height;
        }

    }
    class Rectangle extends Shape{
        private double length,width;

        public double findPerimeter(){
        return length*width;
    }
    }
    class Square extends Shape{
        private double length;
        public double findPerimeter(){
            return length*length;
        }
    }
    public static void main(String[] args) {
        Shape myShape = new Shape();
        Shape yourShape = new Shape("Yellow");
        System.out.println(yourShape.color);
        System.out.println(myShape.color);
    }
}
