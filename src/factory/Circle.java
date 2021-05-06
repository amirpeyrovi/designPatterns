package factory;

public class Circle implements Shape {
    public Circle() {
        System.out.println("circle create");
    }

    @Override
    public void draw() {
        System.out.println("circle");
    }
}
