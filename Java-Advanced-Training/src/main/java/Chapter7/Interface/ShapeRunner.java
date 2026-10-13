package Chapter7.Interface;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/12/2026
 **/
public class ShapeRunner {
    public static void main(String[] args) {
        MySquare objSquare = new MySquare(5);
        objSquare.draw();
        objSquare.apply("Green");
        objSquare.display();

        MyCircle objCircle = new MyCircle(7);
        objCircle.draw();
        objCircle.apply("Red");
        objCircle.display();
    }
}
