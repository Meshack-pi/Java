abstract class Triangle {
    protected int sideA;
    protected int sideB;
    protected int sideC;
    public Triangle(int sideA,int sideB,int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC= sideC;
    }
    //abstract method to calculate the perimeter
    public abstract int getPerimeter();
}

public class RightTriangle extends Triangle{
    //constructor in the right triangle class
    public RightTriangle(int sideA,int sideB,int sideC){
        super(sideA, sideB, sideC);
    }
    @Override
    public int getPerimeter(){
        return sideA + sideB +sideC;
    }

}