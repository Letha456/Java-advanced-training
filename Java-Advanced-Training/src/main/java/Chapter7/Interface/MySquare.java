package Chapter7.Interface;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/12/2026
 **/
public class MySquare extends MyShape implements IShapeCalculation, IGraphics {

    public MySquare(int side) {
        super(side, 0);
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public void apply(String color) {
        System.out.println("Applying " + color + " color");
    }

    @Override
    public void draw() {
        System.out.println("Drawing the square");

    }

    @Override
    public void display() {
        System.out.println("Side: " + this.length);
        System.out.println("Area: " + getArea());
        System.out.println("====================================");
    }
}
