package abstractFactory;

public class RoundedRectangle implements Shape {
    public RoundedRectangle() {
        System.out.println("rounded rectangle create");
    }

    @Override
    public void draw() {
        System.out.println("rounded rectangle draw");
    }
}
