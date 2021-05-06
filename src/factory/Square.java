package factory;

public class Square implements Shape {
    public Square() {
        System.out.println("square create");
    }

    @Override
    public void draw() {
        System.out.println("square");
    }
}
