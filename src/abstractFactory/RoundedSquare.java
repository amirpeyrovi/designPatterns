package abstractFactory;

public class RoundedSquare implements Shape {
    public RoundedSquare() {
        System.out.println("rounded square create");
    }

    @Override
    public void draw() {
        System.out.println("rounded square draw");
    }
}
