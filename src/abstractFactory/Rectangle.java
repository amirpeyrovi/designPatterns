package abstractFactory;

public class Rectangle implements Shape {
    public Rectangle() {
        System.out.println("rectangle create");
    }

    @Override
    public void draw() {
        System.out.println("rectangle draw");
    }
}
